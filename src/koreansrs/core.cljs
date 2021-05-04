(ns koreansrs.core
  (:require [clojure.string :as s]
            [goog.events :as events]
            [koreansrs.app :as app]
            [koreansrs.config :as config]
            [re-frame.core :as rf]
            #_[re-frisk.core :refer [enable-re-frisk!]]
            [reagent.core :as reagent]
            [reagent.dom])
  (:import goog.History
           goog.history.EventType))

(defn dev-setup []
  (when config/debug?
    (enable-console-print!)
    #_(enable-re-frisk! {:kind->id->handler? true
                         :events?            false})))

(defonce history
  (doto (History.)
    (events/listen EventType.NAVIGATE #(let [s (-> % .-token)]
                                         (do (js/console.log %)
                                             (if-not (s/starts-with? s "id_token=")
                                               (rf/dispatch [:navigation-received (js/decodeURIComponent s)])))))
    (.setEnabled true)))

(defn ^:dev/after-load mount-root []
  (rf/clear-subscription-cache!)
  (reagent.dom/render [app/app] (.getElementById js/document "app")))

(defn ^:export main []
  (dev-setup)
  (rf/dispatch-sync [:init])
  (mount-root))
