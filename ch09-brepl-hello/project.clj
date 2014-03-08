(defproject ch09-brepl-hello "0.1.0-SNAPSHOT"
  :description "'Hello, World' JavaScript app from 'ClojureScript - Up and Running,' using the browser REPL (bREPL)"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2173"]
                 [compojure "1.1.6"]
                 [ring/ring-jetty-adapter "1.2.1"]]
  :plugins [[lein-cljsbuild "1.0.2"]]
  :source-paths ["src/clj"]
  :cljsbuild {:builds
              [{:source-paths ["src/cljs"],
                :compiler
                {:pretty-print true,
                 :output-to "resources/public/brepl-hello.js",
                 :optimizations :whitespace}}]})
