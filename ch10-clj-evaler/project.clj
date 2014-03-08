(defproject ch10-clj-evaler "0.1.0-SNAPSHOT"
  :description "Clojure expression evaluator from 'ClojureScript: Up and Running.'"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2173"]
                 [domina "1.0.2"]
                 [compojure "1.1.6"]
                 [ring/ring-jetty-adapter "1.2.1"]]
  :plugins [[lein-cljsbuild "1.0.2"]]
  :source-paths ["src/clj"]
  :main ch10-clj-evaler.server
  :cljsbuild {:builds
              [{:source-paths ["src/cljs"],
                :compiler
                {:pretty-print true,
                 :output-to "resources/public/client.js",
                 :optimizations :whitespace}}]})
