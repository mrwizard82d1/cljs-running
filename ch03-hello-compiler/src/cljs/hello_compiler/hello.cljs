(ns hello-compiler.hello)

(defn ^:export main []
  (.write js/document "<p>Hello, Optimized ClojureScript Compiler!</p>"))
