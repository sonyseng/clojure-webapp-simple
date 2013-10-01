(ns clojure-webapp-simple.core
    (:use
     compojure.core)
  (:require
     [ring.adapter.jetty :as jetty]
     [compojure.route :as route]
     [liberator.core :refer [resource defresource]]
     [ring.util.response :as resp]))

(defroutes main-routes
  (GET "/" [] (resp/file-response "index.html" {:root "public"}))
  (GET "/lib" [] (resource :available-media-types ["application/json"]
                           :handle-ok "<html>Hello, Internet.</html>"))
  (route/resources "/")
  (route/not-found "404 Not Found"))

(defn -main [] (jetty/run-jetty main-routes {:port 8080}))
