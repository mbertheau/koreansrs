(ns koreansrs.core
  (:require [goog.events :as events]
            [reagent.core :as reagent]
            [re-frame.core :as rf]
            [re-frisk.core :refer [enable-re-frisk!]]
            [secretary.core :as secretary :refer-macros [defroute]]
            [koreansrs.app :as app])
  (:import [goog History]
           [goog.history EventType]))

(def debug?
  ^boolean goog.DEBUG)

(defn dev-setup []
  (when debug?
    (enable-console-print!)
    (enable-re-frisk! {:kind->id->handler? true
                       :events? false})))

(defroute "/:query" [query]
  (rf/dispatch [:set-query query]))

(def history
  (doto (History.)
    (events/listen EventType.NAVIGATE
                   (fn [event] (do
                                 (let [something (.-token event)]
                                   (console.log something)
                                   (secretary/dispatch! something)))))
    (.setEnabled true)))

(defn mount-root []
  (rf/clear-subscription-cache!)
  (reagent/render [app/app] (.getElementById js/document "app")))

(defn ^:export main []
  (rf/dispatch-sync [:init-db])
  (dev-setup)
  (mount-root))
