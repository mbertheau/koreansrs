(ns koreansrs.app
  (:require [reagent.core :as r]
            [re-frame.core :as rf]
            [koreansrs.data :as data]))

(rf/reg-event-db
 :init-db
 (fn [_ _]
   (let [word (-> data/words
                  rand-nth
                  (get 0))]
     {:hanja data/hanja
      :words data/words
      :input word
      :char-index 0
      :output word})))

(rf/reg-event-db
 :assoc-in
 (fn [db [_ path new-value]]
   (assoc-in db path new-value)))

(rf/reg-event-db
 :set-word
 (fn [db [_ new-word new-char-index]]
   (-> db
       (assoc :input new-word)
       (assoc :output new-word)
       (assoc :char-index new-char-index))))

(rf/reg-sub
 :get-in
 (fn [db [_ path]]
   (get-in db path)))

(rf/reg-sub
 :result
 :<- [:get-in [:output]]
 (fn [output _]
   (-> output data/korean first)))

(rf/reg-sub
 :char-index
 :<- [:get-in [:char-index]]
 (fn [char-index _]
   (or char-index 0)))

(rf/reg-sub
 :res-examples
 :<- [:result]
 :<- [:char-index]
 (fn [[result char-index] _]
   (sort-by first (-> result :words (get char-index)))))

(rf/reg-sub
 :res-hanja-char
 :<- [:result]
 :<- [:char-index]
 (fn [[result char-index]]
   (get (-> result :hanja) char-index)))

(defn listen [v] (deref (rf/subscribe v)))

(defn linkify [word active-hanja-char]
  (fn [hanja-char output-char index]
    ^{:key index}
    [:span {:class (when (= active-hanja-char hanja-char) "active")
            :style {:cursor "pointer"}
            :on-click (fn [] (rf/dispatch [:set-word word index]))}
     output-char]))

(defn examples []
  (let [active-word (listen [:get-in [:output]])
        res-examples (listen [:res-examples])
        res-hanja-char (listen [:res-hanja-char])]
    [:div.examples
     (doall (map-indexed (fn [index [korean hanja meaning]]
                   ^{:key index}
                   [:div.example {:style {:font-weight (when (= korean active-word) "bolder")}}
                    [:div.korean (map (linkify korean res-hanja-char) hanja korean (range))]
                    [:div.hanja (map (linkify korean res-hanja-char) hanja hanja (range))]
                    [:div.meaning meaning]])
                 res-examples))]))

(defn result []
  (let [{:keys [korean hanja trans meaning]} (listen [:result])
        active-word (listen [:get-in [:output]])
        active-char-index (listen [:get-in [:char-index]])
        active-hanja-char (get hanja active-char-index)]
    [:div.result

     [:div.explanation
      [:div
       [:div.hanja (map (linkify korean active-hanja-char) hanja hanja (range))]
       [:div.meaning (apply str (interpose " – " (map #(if (nil? %) "?" %) meaning)))]]
      [:div
       [:div.korean (map (linkify korean active-hanja-char) hanja korean (range))]
       [:div.translation (:trans result)]]]

     [examples]]))

(defn results []
  [:div {:id "results"}
   [result]
   #_(doall (for [res (data/korean (listen [:get-in [:output]]))]
            ^{:key (:korean res)}
            [result]))])

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
   [input {:value (listen [:get-in [:input]])
           :on-change #(rf/dispatch [:set-word % 0])}]
   [results]])
