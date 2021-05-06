(ns hanjahanzi.react-app
  (:require ["react-native" :as rn]
            [hanjahanzi.react-native :refer [render-root]]
            [re-frame.core :as rf]
            [reagent.core :as r]))

(rf/reg-event-db
 :set-query
 (fn [db [event query]]
   (assoc db :query query)))

(rf/reg-event-db
 :delete-query
 (fn [db [event]]
   (assoc db :query "")))

(rf/reg-sub
 :query
 (fn [db] (:query db)))

(defn header []
  [:> rn/View {:style {:flex-direction :row
                       :align-items    :center}}
   [:> rn/TextInput {:style          {:flex    1
                                      :padding 10}
                     :placeholder    "검색"
                     :on-change-text #(rf/dispatch [:set-query %])
                     :value          @(rf/subscribe [:query])}]
   [:> rn/TouchableNativeFeedback {:on-press #(rf/dispatch [:delete-query])
                                   :style    {:padding 10}}
    [:> rn/Text {:style {:padding 10}} "⨯"]]])

(defn content []
  [:> rn/Text {:style {:padding 5}} @(rf/subscribe [:query])])

(defn footer []
  [:> rn/Text "footer"])

(defn root []
  [:> rn/View {:style {:flex             1
                       :background-color :white
                       :align-items      :stretch
                       :justify-content  :space-between}}
   [:> rn/View {:style {:background-color :red}}
    [header]]

   [:> rn/View {:style {:flex             1
                        :background-color :white}}
    [content]]

   [:> rn/View {:style {:background-color :blue}}
    [footer]]])

(defn ^:dev/after-load start []
  (rf/clear-subscription-cache!)
  (render-root "hanjahanzi" (r/as-element [root])))

(rf/reg-event-db
 :init
 (fn [db [event]]
   {:query "y"}))

(defn init []
  (rf/dispatch-sync [:init])
  (start))
