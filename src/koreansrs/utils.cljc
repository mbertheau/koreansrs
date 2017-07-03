(ns koreansrs.utils)


(defmacro r-sub
  [sub-name args inputs body]
  (let [query-v             (into ['_] args)
        partitioned-inputs  (partition 2 inputs)
        input-query-vectors (mapv second partitioned-inputs)
        input-names*        (mapv first partitioned-inputs)
        input-names         (if (empty? input-names*) 'db input-names*)
        input-fn            `(fn [~query-v ~'_]
                               [~@(for [input-query-vector input-query-vectors]
                                    `(re-frame.core/subscribe ~input-query-vector))])
        value-fn            `(fn [~input-names ~query-v ~'_] ~body)]
    (if (empty? input-query-vectors)
      `(re-frame.core/reg-sub ~sub-name ~value-fn)
      `(re-frame.core/reg-sub ~sub-name ~input-fn ~value-fn))))

(defmacro r-event-fx
  [event-name args body]
  `(re-frame.core/reg-event-fx
    ~event-name
    (when koreansrs.config/debug? [re-frame.core/debug])
    (fn [{:keys [~'db] :as ~'coeffect} ~(into ['_] args)]
      ~body)))

(defmacro r-event-db
  [event-name args body]
  `(re-frame.core/reg-event-db
    ~event-name
    (when koreansrs.config/debug? [re-frame.core/debug])
    (fn [~'db ~(into ['_] args)]
      ~body)))
