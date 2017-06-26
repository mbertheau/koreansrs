(ns koreansrs.data
  (:require clojure.string))

(def hanja {\揮 "shake"
            \發 "send out"
            \油 "oil"})

(def words [["휘발유" "揮發油" "Benzin"]
            ["후식" "後食" "Nachtisch"]
            ["후회" "後悔" "regret"]
            ["후기" "後記" "review"]
            ["후배" "後輩" "er ist meine Bitch"]
            ["편식" "偏食" "einseitige Ernährung"]
            ["정식" "定食" "(mehr-Gänge-)Menü"]
            ["음식물" "飮食物" "Lebensmittel"]
            ["식혜" "食醯" "Süßes Getränk aus fermentiertem Reis"]
            ["식탁" "食卓" "Esstisch"]
            ["식초" "食醋" "Essig"]
            ["식용유" "食用油" "Speiseöl"]
            ["식사량" "食事量" "Portion"]
            ["식도" "食道" "Speiseröhre"]
            ["식당" "食堂" "Restaurant"]
            ["식기 세척기" "食器 洗滌器" "Geschirrspülmaschine"]
            ["과식" "過食" "Völlerei"]
            ])

(def pronounciations (->> words
                          (map #(map vector (% 0) (% 1)))
                          (apply concat)
                          (map #(vector (% 0) (set [(% 1)])))
                          (apply concat)
                          (apply hash-map)))

(defn one-hanja-words [c]
  (filterv #(clojure.string/includes? (% 1) (str c)) words))

(one-hanja-words \油)

(defn one-hanja-meaning [c]
  (hanja c))

(one-hanja-meaning \油)

(defn korean [input]
                                        ; input is a korean word
  (let [matching-words (filter #(= input (% 0)) words)]
    (for [matching-word matching-words
          :let [[korean hanja trans] matching-word]]
      {:korean input
       :trans trans
       :hanja hanja
       :meaning (map one-hanja-meaning hanja)
       :words (vec (for [ja hanja
                         :let [words-with-ja (filterv #(not= (% 1) hanja) (one-hanja-words ja))]]
                     words-with-ja))})))

(korean "휘발유")

(apply str (interpose " - " (map #(if (nil? %) "?" %) (:meaning(first (korean "식용유"))))))

(apply str(interpose " - " '("a" "b" "c")))

; foo
