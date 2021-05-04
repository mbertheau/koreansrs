(ns koreansrs.app
  (:require [clojure.string :as s]
            com.smxemail.re-frame-document-fx
            [koreansrs.config :as config]
            koreansrs.google-api
            [koreansrs.utils :refer-macros [r-sub r-event-fx r-event-db]]
            [re-frame.core :as rf]
            [reagent.core :as r]))

(defn listen [v] (deref (rf/subscribe v)))

(r-sub :get-in [path] []
       (get-in db path))

(r-event-fx :init []
            {:db        (-> db
                            (assoc :hanja {})
                            (assoc :words [])
                            (assoc :auth :initializing))
             :gapi/init {:client-id         "317426179182-6p56pl2v7iar72k417kp84g3s9r58a4a.apps.googleusercontent.com"
                         :signed-in-changed #(rf/dispatch [:signed-in-changed %])}})

(defn random-word [db]
  (let [words (:words db)]
    (when-not (empty? words) (-> words rand-nth (get 0)))))

(r-event-fx :go-to-random-word []
            (let [word (random-word db)]
              (when word {:dispatch [:navigate-to word]})))

(r-event-fx :navigate-to [dest]
            {:document/location-assign {:url (str "#" dest)}})

(r-event-fx :navigation-received [s]
            {:dispatch (if (empty? s)
                         [:go-to-random-word]
                         [:set-query s])})

(r-event-db :set-query [new-query]
            (assoc db :query new-query))

(defn query-result
  ":char-matches is a list of lists (groups) of hangeul - hanja - meaning
  3-vectors.

  In the case of single char queries there's only one group with all hanjas for
  the given hangeul, or all hangeul pronounciations for the given hanja.

  In the case of multi char queries, there's a group for each exactly matching
  word, where each group contains meaning for each character in the matching
  word.

  :word-matches is a list of 3-vectors word - hanja - meaning.
  "
  [words hanja query]
  (let [query-len (count query)]
    (if (= 0 query-len)
      {:char-matches []
       :word-matches []}
      (let [matches (filterv #(or (clojure.string/includes? (% 0) query)
                                  (clojure.string/includes? (% 1) query))
                             words)]
        {:char-matches (if (= 1 query-len)
                         (->> matches
                                        ; extract geulja - hanja pairs from words
                              (map #(for [i (range (count (% 0)))]
                                      [(-> % (get 1) (get i))
                                       (-> % (get 0) (get i))]))
                                        ; string together all characters ignoring word boundaries
                              (apply concat)
                                        ; filter out characters not matching the query
                              (filter #(or (= (% 0) (get query 0))
                                           (= (% 1) (get query 0))))
                                        ; filter out duplicates
                              distinct
                                        ; guarantee stable order
                              sort
                                        ; add hanja meaning
                              (mapv #(conj % (hanja (% 0))))
                                        ; put in one list so the structure of :char-matches is the same as for multi char queries
                              vector)
                         (->> matches
                                        ; leave only exact matches
                              (filter #(or (= (% 0) query)
                                           (= (% 1) query)))
                                        ; transform into groups of geulja - hanja - meaning
                              (mapv (fn [[korean-w hanja-w meaning]]
                                      (mapv #(vector %2 %1 (hanja %2)) korean-w hanja-w)))))
         :word-matches matches}))))


(r-sub :result [] [output [:get-in [:query]]
                   words [:get-in [:words]]
                   hanja [:get-in [:hanja]]]
       (query-result words hanja output))

(r-sub :char-results [] [result [:result]]
       (:char-matches result))

(r-sub :num-char-result-groups [] [char-results [:char-results]]
       (count char-results))

(r-sub :char-result-group [i] [char-results [:char-results]]
       (get char-results i))

(r-sub :num-char-results-in-group [i] [char-result-group [:char-result-group i]]
       (count char-result-group))

(r-sub :char-result [i j] [char-result-group [:char-result-group i]]
       (get char-result-group j))

(defn link-to [new-query]
  {:on-click #(rf/dispatch [:navigate-to new-query])})

(defn char-result [i j]
  (let [[hanja geulja meaning] (listen [:char-result i j])]
    [:div.char-result
     [:div.hanja (link-to hanja) hanja]
     [:div.geulja (link-to geulja) geulja]
     [:div.meaning (link-to hanja) meaning]
     #_[:a {:href (str "https://en.wiktionary.org/wiki/" hanja)} "Wiktionary"]
     [:a {:href (str "plecoapi://x-callback-url/s?q=" hanja)} "Pleco"]
     ]))

(defn char-result-group [i]
  [:div.char-result-group
   (for [j (range (listen [:num-char-results-in-group i]))]
     ^{:key j}
     [char-result i j])])

(defn char-result-groups []
  [:div.char-result-groups
   (for [i (range (listen [:num-char-result-groups]))]
     ^{:key i}
     [char-result-group i])])

(r-sub :word-results [] [result [:result]]
       (:word-matches result))

(r-sub :word-result [i] [word-results [:word-results]]
       (get word-results i))

(defn word-result [i]
  (let [[korean hanja meaning] (listen [:word-result i])
        query                  (listen [:get-in [:query]])
        highlight-queried      #(map-indexed (fn [i c] ^{:key i} [:span {:class (when (= c query) "queried")} c]) %)]
    [:div.word-result
     [:div.korean (link-to korean) (map highlight-queried korean)]
     [:div.hanja (map-indexed (fn [index hanja-char]
                                ^{:key index}
                                [:span (link-to hanja-char) hanja-char]) hanja)]
     [:div.meaning (link-to korean) meaning]]))

(r-sub :num-word-results [] [word-results [:word-results]]
       (count word-results))

(defn word-results []
  [:div.word-results
   (for [i (range (listen [:num-word-results]))]
     ^{:key i}
     [word-result i])])

(defn results []
  [:div
   [char-result-groups]
   [word-results]])

(defn input [{:keys [value on-change]
              :as   attrs}]
  (let [int (r/atom value)
        ext (r/atom value)]
    (fn [{:keys [value on-change]
          :as   attrs}]
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

(r-event-fx :sign-in []
            {:gapi/sign-in {}})

(r-event-fx :sign-out []
            {:gapi/sign-out {}})

(r-event-fx :signed-in-changed [new-signed-in?]
            (let [loaded? (-> db :loaded?)
                  effect  {:db (-> db
                                   (assoc :signed-in? new-signed-in?)
                                   (assoc :auth :initialized))}]
              (if (and (not loaded?) new-signed-in?)
                (assoc effect :dispatch [:load])
                effect)))

(def spreadsheet-id "1k5m7LzcFK2yhdrg7qHsEhiPUM4EWD0jjO2n1A2qPQAU")

(r-event-fx :load []
            {:gapi/batchGet {:request {:spreadsheetId spreadsheet-id
                                       :ranges        ["Words!A:C" "Hanja!A:B"]}
                             :then    #(rf/dispatch [:data-loaded %])}})

(r-event-fx :data-loaded [data]
            (let [words         (->> data
                                     (filter #(s/starts-with? (:range %) "Words!"))
                                     first
                                     :values)
                  hanja         (->> data
                                     (filter #(s/starts-with? (:range %) "Hanja!"))
                                     first
                                     :values
                                     (map #(hash-map (first %) (second %)))
                                     (apply merge))
                  is-somewhere? (-> db :query empty? not)]
              {:db         (-> db
                               (assoc :data data)
                               (assoc :hanja hanja)
                               (assoc :words words)
                               (assoc :loaded? true))
               :dispatch-n [(when-not is-somewhere? [:go-to-random-word])]}))

(r-event-fx :save []
            {:gapi/batchUpdate {:request {:spreadsheetId    spreadsheet-id
                                          :data             [{:range          "Words!A:C"
                                                              :majorDimension "ROWS"
                                                              :values         (:words db)}
                                                             {:range          "Hanja!A:B"
                                                              :majorDimension "ROWS"
                                                              :values         (mapv vec (:hanja db))}]
                                          :valueInputOption "RAW"}
                                :then    console.log}})

(r-sub :signed-in? [] [] (:signed-in? db))

(defn sign-in-out-button []
  (let [signed-in? (listen [:signed-in?])]
    [:button {:on-click #(rf/dispatch [(if signed-in? :sign-out :sign-in)])}
     (if signed-in? "Sign out" "Sign in")]))

(defn load-button []
  [:button {:on-click #(rf/dispatch [:load])}
   "Reload"])

(defn save-button []
  [:button {:on-click #(rf/dispatch [:save])}
   "Save"])

(r-sub :num-hanja [] [hanja [:get-in [:hanja]]]
       (count hanja))

(r-sub :num-words [] [words [:get-in [:words]]]
       (count words))

(defn stats []
  [:span " " (listen [:num-words]) " Words, " (listen [:num-hanja]) " Hanja"])

(defn state []
  (let [auth (listen [:get-in [:auth]])]
    [:div
     (if (= :initializing auth)
       [:span " Signing in... "]
       [sign-in-out-button])
     (when (= :initialized auth)
       (if (not (listen [:get-in [:loaded?]]))
         [:span " Loading... "]
         [load-button]))]))

(defn header []
  [:header
   [:a.hamburger "☰"]
   [input {:value       (listen [:get-in [:query]])
           :id          "query-input"
           :style       {:border-width  "0"
                         :border-bottom "0.05em solid white"
                         :padding       "0.3em"
                         :font-size     "16px"}
           :on-change   #(when (not (empty? %)) (rf/dispatch [:navigate-to %]))
           :placeholder "검색"}]
   [:a.hamburger {:on-click #(rf/dispatch [:delete-query])} "⨯"]])

(rf/reg-fx :focus
           (fn [element-id]
             (console.log element-id)
             (.focus (.getElementById js/document element-id))))

(r-event-fx :delete-query []
            {:db    (assoc db :query "")
             :focus "query-input"})

(defn app []
  [:div.container
   [header]
   [:div.content
    [state]
    [results]]
   [:footer [stats]]])
