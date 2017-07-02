(ns koreansrs.app
  (:require [reagent.core :as r]
            [re-frame.core :as rf]
            [koreansrs.data :as data]
            [koreansrs.config :as config]
            [koreansrs.utils :refer-macros [r-sub]]
            [com.smxemail.re-frame-document-fx]))

(rf/reg-event-db
 :init-db
 (when config/debug? [rf/debug])
 (fn [_ _]
   {:hanja data/hanja
    :words data/words}))

(rf/reg-event-fx
 :go-to-random-word
 (when config/debug? [rf/debug])
 (fn [{:keys [db]} _]
   (let [word (-> db :words rand-nth (get 0))]
     {:dispatch [:navigate-to word]})))

(rf/reg-event-fx
 :navigate-to
 (when config/debug? [rf/debug])
 (fn [_ [_ dest]]
   {:document/location-assign {:url (str "#" dest)}}))

(rf/reg-event-db
 :set-query
 (when config/debug? [rf/debug])
 (fn [db [_ new-query]]
   (-> db
       (assoc :input new-query)
       (assoc :output new-query))))

(defn listen [v] (deref (rf/subscribe v)))

(r-sub :get-in [path] []
       (get-in db path))

(defn query-result
  ":char-matches is a list of lists (groups) of hangeul - hanja - meaning
  3-vectors.

  In the case of single char queries there's only one group with all hanjas for
  the given hangeul, or all hangeul pronounciations for the given hanja.

  In the case of multi char queries, there's a group for each exactly matching
  word, where each group contains meaning for each character in the matching
  word.

  :word-matches is a list of 3-vectors word - hanja - meaning.
  "
  [words hanja query]
  (let [query-len (count query)]
    (if (= 0 query-len)
      {:char-matches []
       :word-matches []}
      (let [matches (filterv #(or (clojure.string/includes? (% 0) query)
                                  (clojure.string/includes? (% 1) query))
                             words)]
        {:char-matches (if (= 1 query-len)
                         (->> matches
                                        ; extract geulja - hanja pairs from words
                              (map #(for [i (range (count (% 0)))]
                                      [(-> % (get 1) (get i))
                                       (-> % (get 0) (get i))]))
                                        ; string together all characters ignoring word boundaries
                              (apply concat)
                                        ; filter out characters not matching the query
                              (filter #(or (= (% 0) (get query 0))
                                           (= (% 1) (get query 0))))
                                        ; filter out duplicates
                              distinct
                                        ; guarantee stable order
                              sort
                                        ; add hanja meaning
                              (mapv #(conj % (hanja (% 0))))
                                        ; put in one list so the structure of :char-matches is the same as for multi char queries
                              vector)
                         (->> matches
                                        ; leave only exact matches
                              (filter #(or (= (% 0) query)
                                           (= (% 1) query)))
                                        ; transform into groups of geulja - hanja - meaning
                              (mapv (fn [[korean-w hanja-w meaning]]
                                      (mapv #(vector %2 %1 (hanja %2)) korean-w hanja-w)))))
         :word-matches matches}))))


(r-sub :result [] [output [:get-in [:output]]
                   words [:get-in [:words]]
                   hanja [:get-in [:hanja]]]
       (query-result words hanja output))

(r-sub :char-results [] [result [:result]]
       (:char-matches result))

(r-sub :num-char-result-groups [] [char-results [:char-results]]
       (count char-results))

(r-sub :char-result-group [i] [char-results [:char-results]]
       (get char-results i))

(r-sub :num-char-results-in-group [i] [char-result-group [:char-result-group i]]
       (count char-result-group))

(r-sub :char-result [i j] [char-result-group [:char-result-group i]]
       (get char-result-group j))

(defn link-to [new-query]
  {:on-click #(rf/dispatch [:navigate-to new-query])})

(defn char-result [i j]
  (let [[hanja geulja meaning] (listen [:char-result i j])]
    [:div.char-result
     [:div.hanja (link-to hanja) hanja]
     [:div.geulja (link-to geulja) geulja]
     [:div.meaning (link-to hanja) meaning]]))

(defn char-result-group [i]
  [:div.char-result-group
   (for [j (range (listen [:num-char-results-in-group i]))]
     ^{:key j}
     [char-result i j])])

(defn char-result-groups []
  [:div.char-result-groups
   (for [i (range (listen [:num-char-result-groups]))]
     ^{:key i}
     [char-result-group i])])

(r-sub :word-results [] [result [:result]]
       (:word-matches result))

(r-sub :word-result [i] [word-results [:word-results]]
       (get word-results i))

(defn word-result [i]
  (let [[korean hanja meaning] (listen [:word-result i])
        query (listen [:get-in [:output]])
        highlight-queried #(map (fn [c] [:span {:class (when (= c query) "queried")} c]) %)]
    [:div.word-result
     [:div.korean (link-to korean) (map highlight-queried korean)]
     [:div.hanja (map-indexed (fn [index hanja-char]
                                ^{:key index}
                                [:span (link-to hanja-char) hanja-char]) hanja)]
     [:div.meaning (link-to korean) meaning]]))

(r-sub :num-word-results [] [word-results [:word-results]]
       (count word-results))

(defn word-results []
  [:div.word-results
   (for [i (range (listen [:num-word-results]))]
     ^{:key i}
     [word-result i])])

(defn results []
  [:div
   [char-result-groups]
   [word-results]])

(defn input [{:keys [value on-change]
              :as attrs}]
  (let [int (r/atom value)
        ext (r/atom value)]
    (fn [{:keys [value on-change]
          :as attrs}]
      (when-not (= value @ext)
        (do (reset! int value)
            (reset! ext value)))
      [:input (-> attrs
                  (assoc :value @int)
                  (assoc :on-change #(let [new-value (-> % .-target .-value)]
                                       (reset! int new-value)
                                       (when on-change
                                         (on-change new-value))))
                  (assoc :type "text"))])))

(defn app []
  [:div
   "검색:" [input {:value (listen [:get-in [:input]])
                   :style {:border-width "0"
                           :border-bottom "0.05em solid black"
                           :padding "0.3em"
                           :font-size "16px"}
                   :on-change #(when (not (empty? %)) (rf/dispatch [:navigate-to %]))
                   :placeholder "검색"}]
   [results]])
