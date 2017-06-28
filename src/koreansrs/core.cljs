(ns koreansrs.core
  (:require [reagent.core :as reagent]
            [re-frame.core :as rf]
            [re-frisk.core :refer [enable-re-frisk!]]
            [koreansrs.app :as app]))

(def debug?
  ^boolean goog.DEBUG)

(defn dev-setup []
  (when debug?
    (enable-console-print!)
    (enable-re-frisk! {:kind->id->handler? true})))

(defn mount-root []
  (rf/clear-subscription-cache!)
  (reagent/render [app/app] (.getElementById js/document "app")))

(defn ^:export main []
  (rf/dispatch-sync [:init-db])
  (dev-setup)
  (mount-root))
