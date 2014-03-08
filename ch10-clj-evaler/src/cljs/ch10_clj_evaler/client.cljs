(ns ch10-clj-evaler.client
  (:require [goog.net.XhrIo :as xhr]
            [domina :as d]
            [domina.events :as events]))

(def result-id "eval-result")
(def expr-id "eval-expr")
(def button-id "eval-button")
(def url "/eval")

(defn receive-result
  "Handles a result received from the server."
  [event]
  ; Sets the text identified by result-id to the response returned by
  ; the server.
  (d/set-text! (d/by-id result-id)
               (.getResponseText (.-target event))))

(defn post-for-eval 
  "Posts an expression to the server to be evaluated."
  [expr-str]
  ; Sends a POST request to url with the expression as the content. 
  (xhr/send url receive-result "POST" expr-str))

(defn get-expr
  "Gets the expression identified by expr-id"
  []
  (.-value (d/by-id expr-id)))

(defn ^:export main
  "Listens for button presses and responds appropriately."
  []
  ; The main function listens for events from button-id. If it
  ; receives a click event, it posts it to the server for evaluation
  ; and then reports the event has been handled (not quite certain
  ; about this last part).
  (events/listen! (d/by-id button-id)
                  :click
                  (fn [event]
                    (post-for-eval (get-expr))
                    (events/stop-propogation event)
                    (events/prevent-default event))))
                                   
