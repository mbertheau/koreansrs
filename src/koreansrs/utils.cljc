(ns koreansrs.utils)


(defmacro r-sub
  [sub-name args inputs body]
  (let [query-v (into ['_] args)
        partitioned-inputs (partition 2 inputs)
        input-query-vectors (mapv second partitioned-inputs)
        input-names* (mapv first partitioned-inputs)
        input-names (if (empty? input-names*) 'db input-names*)
        input-fn (list 'fn [query-v '_]
                    (mapv #(list 're-frame.core/subscribe %)
                           input-query-vectors))
        value-fn (list 'fn [input-names query-v '_]
                    body)]
    (if (empty? input-query-vectors)
      (list 're-frame.core/reg-sub
        sub-name
        value-fn)
      (list 're-frame.core/reg-sub
        sub-name
        input-fn
        value-fn))))

(comment
  (r-sub get-in [path] []
         (get-in db path))


  (r-sub :num-char-results-in-group [i] [char-result-group [:char-result-group i]]
         (count char-result-group))

)
