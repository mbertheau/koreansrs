(set-env!
 :source-paths #{"src"}
 :resource-paths #{"html"}
 :dependencies
 '[[org.clojure/clojure "1.8.0"]
   [org.clojure/clojurescript "1.9.671"]
   [adzerk/boot-cljs "2.0.0"]
   [pandeiro/boot-http "0.8.3"]
   [adzerk/boot-reload "0.5.1"]
   [adzerk/boot-cljs-repl "0.3.3"]
   [com.cemerick/piggieback "0.2.1"]
   [weasel "0.7.0"]
   [org.clojure/tools.nrepl "0.2.13"]
   [reagent "0.7.0"]
   [re-frame "0.9.4"]
   [re-frisk "0.3.2"]
   [binaryage/devtools "0.9.4"]
   [powerlaces/boot-cljs-devtools "0.2.0"]
   [com.smxemail/re-frame-document-fx "0.0.1-SNAPSHOT"]])

(require '[adzerk.boot-cljs :refer [cljs]]
         '[pandeiro.boot-http :refer [serve]]
         '[adzerk.boot-reload :refer [reload]]
         '[adzerk.boot-cljs-repl :refer [cljs-repl start-repl]]
         '[powerlaces.boot-cljs-devtools :refer [cljs-devtools]])

(deftask dev []
  (comp
   (serve :dir "target")
   (watch)
   (notify)
   (reload :on-jsload 'koreansrs.core/mount-root)
   (cljs-repl)
   (cljs-devtools)
   (cljs :compiler-options {:parallel-build true
                            :preloads '[devtools.preload]})
   (target :dir #{"target"})))

(deftask build []
  (comp
   (cljs :optimizations :advanced
         :compiler-options {:parallel-build true
                            :closure-defines {'goog.DEBUG false}
                            :output-wrapper true})
   (sift :include #{#"\.out"} :invert true)
   (target :dir #{"build"})))
