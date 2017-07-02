(ns koreansrs.core
  (:require [clojure.string :as s]
            [goog.events :as events]
            [koreansrs.app :as app]
            [koreansrs.config :as config]
            [re-frame.core :as rf]
            [re-frisk.core :refer [enable-re-frisk!]]
            [reagent.core :as reagent])
  (:import goog.History
           goog.history.EventType))

(defn dev-setup []
  (when config/debug?
    (enable-console-print!)
    (enable-re-frisk! {:kind->id->handler? true
                       :events? false})))

(defonce history
  (doto (History.)
    (events/listen EventType.NAVIGATE #(let [s (-> % .-token)]
                                         (rf/dispatch (if (empty? s)
                                                        [:go-to-random-word]
                                                        [:set-query s]))))
    (.setEnabled true)))

(defn mount-root []
  (rf/clear-subscription-cache!)
  (reagent/render [app/app] (.getElementById js/document "app")))

(defn ^:export main []
  (rf/dispatch-sync [:init-db])
  (dev-setup)
  (mount-root))
