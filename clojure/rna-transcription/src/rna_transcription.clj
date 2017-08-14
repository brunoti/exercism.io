(ns rna-transcription
  (:require [clojure.string :as str] ))

(def dna-to-rna-map {"G" "C" "C" "G" "T" "A" "A" "U"})

(defn trans-n [n]
  (if
    (nil? (dna-to-rna-map n))
    (throw (AssertionError. "Wrong Inptut"))
    (dna-to-rna-map n)))

(defn to-rna [string]
  (str/join ""
    (map trans-n
         (str/split string #""))))
