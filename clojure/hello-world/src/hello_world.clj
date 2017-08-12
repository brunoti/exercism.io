(ns hello-world
  (:require [clojure.string :refer [join]]))

(defn hello
  ([] "Hello, World!")
  ([name] (join ["Hello, " name "!"])))
