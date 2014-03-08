(ns ch10-clj-evaler.server
  (:require [compojure.route :as route]
            [compojure.core :as compojure]
            [ring.util.response :as response]
            [ring.adapter.jetty :as jetty]))

(defn eval-clojure
  "Evaluates a Clojure expression."
  [request]
  (try
    (let [expr (read-string (slurp (:body request)))]
      (pr-str (eval expr)))
    (catch Throwable t
      (str "ERROR: " t))))

; I do not understand the point of app.
(compojure/defroutes app
  (compojure/POST "/eval" request (eval-clojure request))
  (compojure/GET "/" request
                 (response/resource-response "public/index.html"))
  (route/resources "/"))

(defn -main []
  (prn "View the example at http://localhost:4000/")
  (jetty/run-jetty app {:join? true :port 4000}))

