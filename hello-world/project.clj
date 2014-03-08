(defproject hello-world "0.1.0-SNAPSHOT"
  :description "'Hello, World' JavaScript app from 'ClojureScript - Up and Running.'"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2173"]]
  :plugins [[lein-cljsbuild "1.0.2"]]
  :cljsbuild {:builds []})
