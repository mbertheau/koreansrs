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

(rf/reg-sub
 :get-in
 (fn [db [_ path]]
   (get-in db path)))

(defn listen [v] (deref (rf/subscribe v)))

(defn result [res]
  (let [active-char-index (r/atom 0)]
    (fn [res]
      [:div.result
       [:div.explanation
        [:div
         [:div.korean (:korean res)]
         [:div.translation (:trans res)]]
        [:div
         [:div.hanja (map-indexed (fn [i c] ^{:key i}[:span {:on-click (fn [] (reset! active-char-index i))} c ]) (:hanja res))]
         [:div.meaning (apply str (interpose " – " (map #(if (nil? %) "?" %) (:meaning res))))]]]
       [:div.examples
        (doall (for [[korean hanja meaning] (-> res :words (get @active-char-index))]
                 ^{:key korean}
                 [:div.example
                  [:div.korean
                   [:span {:on-click #(rf/dispatch [:assoc-in [:input] korean])} korean]]
                  [:div.hanja hanja]
                  [:div.meaning meaning]]))]])))

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
