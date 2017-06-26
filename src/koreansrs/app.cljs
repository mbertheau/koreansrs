(ns koreansrs.app
  (:require [reagent.core :as r]
            [re-frame.core :as rf]
            [koreansrs.data :as data]))

(rf/reg-event-db
 :init-db
 (fn [_ _]
   {:hanja data/hanja
    :words data/words
    :input "후식"
    :output "후식"}))

(rf/reg-event-db
 :assoc-in
 (fn [db [_ path new-value]]
   (assoc-in db path new-value)))

(rf/reg-event-db
 :set-word
 (fn [db [_ new-word new-char-index]]
   (-> db
       (assoc :input new-word)
       (assoc :char-index new-char-index))))

(rf/reg-sub
 :get-in
 (fn [db [_ path]]
   (get-in db path)))

(defn listen [v] (deref (rf/subscribe v)))

(defn result [res]
  (let [active-char-index (listen [:get-in [:char-index]])
        active-hanja-char (get (:hanja res) active-char-index)
        linkify2 (fn [word hanja-char output-char index]
                   ^{:key index}
                   [:span {:class (when (= active-hanja-char hanja-char) "active")
                           :style {:cursor "pointer"}
                           :on-click (fn [] (rf/dispatch [:set-word word index]))}
                    output-char])]
    [:div.result

     [:div.explanation
      [:div
       [:div.hanja (map linkify2 (repeat (:korean res)) (:hanja res) (:hanja res) (range))]
       [:div.meaning (apply str (interpose " – " (map #(if (nil? %) "?" %) (:meaning res))))]]
      [:div
       [:div.korean (map linkify2 (repeat (:korean res)) (:hanja res) (:korean res) (range))]
       [:div.translation (:trans res)]]]

     [:div.examples
      (let []
        (doall (for [[korean hanja meaning] (sort-by first (-> res :words (get active-char-index)))]
                 ^{:key korean}
                 [:div.example
                  [:div.korean (map linkify2 (repeat korean) hanja korean (range))]
                  [:div.hanja (map linkify2 (repeat korean) hanja hanja (range))]
                  [:div.meaning meaning]])))]]))

(defn results []
  [:div {:id "results"}
   (doall (for [res (data/korean (listen [:get-in [:output]]))]
            ^{:key (:korean res)}
            [result res]))])

(defn input [{:keys [value on-change]
              :as attrs}]
  (let [int (r/atom value)
        ext (r/atom value)]
    (fn [{:keys [value on-change]
          :as attrs}]
      (when-not (= value @ext)
        (do (reset! int value)
            (reset! ext value)
            (on-change value)))
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
           :on-change #(rf/dispatch [:assoc-in [:output] %])}]
   [results]])
