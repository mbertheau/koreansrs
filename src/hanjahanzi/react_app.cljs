(ns hanjahanzi.react-app
  (:require ["react-native" :as rn]
            [hanjahanzi.react-native :refer [render-root]]
            [re-frame.core :as rf]
            [reagent.core :as r]))

(defn root []
  [:> rn/View {:style {:flex             1
                       :background-color "white"
                       :align-items      "center"
                       :justify-content  "center"}}
   [:> rn/Text {:style {:padding 5}} "Hello"]])

(defn ^:dev/after-load start []
  (rf/clear-subscription-cache!)
  (render-root "hanjahanzi" (r/as-element [root])))

(defn init []
  (start))
