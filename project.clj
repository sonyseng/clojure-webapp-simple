(defproject clojure-webapp-simple "0.1.0-SNAPSHOT"
  :description "Simple clojure Webapp for testing"
  :url "http://www.google.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring/ring-core "1.2.0"]
                 [compojure "1.1.5"]
                 [ring/ring-jetty-adapter "1.2.0"]
                 [liberator "0.9.0"]]
  :main clojure-webapp-simple.core)
