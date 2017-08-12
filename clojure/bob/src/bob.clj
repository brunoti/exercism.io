(ns bob
  (:require [clojure.string :refer [ends-with? blank? trim]]))

(defn is-yell? [phrase]
  (and (re-matches #"([A-Z]|\W|\d)+" phrase)
        (not (re-matches #"(\W|\d)+" phrase))))

(defn response-for [phrase]
  (if (is-yell? phrase) "Whoa, chill out!"
    (if (ends-with? phrase "?") "Sure."
      (if (blank? (trim phrase)) "Fine. Be that way!" "Whatever."))))
