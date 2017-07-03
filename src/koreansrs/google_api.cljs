(ns koreansrs.google-api
  (:require [re-frame.core :as rf]))

(rf/reg-fx :gapi/init
           (fn [{:keys [client-id signed-in-changed]}]
             ((aget js/window "doInit") client-id signed-in-changed)))

(rf/reg-fx :gapi/sign-in
           (fn []
             ((aget js/window "doSignIn"))))

(rf/reg-fx :gapi/sign-out
           (fn []
             ((aget js/window "doSignOut"))))

(rf/reg-fx :gapi/batchGet
           (fn [{:keys [request then]}]
             ((aget js/window "batchGet")
              (clj->js request)
              #(then (:valueRanges (:result (js->clj % :keywordize-keys true)))))))

(rf/reg-fx :gapi/batchUpdate
           (fn [{:keys [request then]}]
             ((aget js/window "batchUpdate")
              (clj->js request)
              #(then (js->clj % :keywordize-keys true)))))
