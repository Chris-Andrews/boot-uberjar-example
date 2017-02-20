(ns my-namespace
  (:require [clojure.test :refer [deftest is]]))

(defn -main [& args]
  (println "Hello world!"))

(deftest Broken
  (is (= true false)))
