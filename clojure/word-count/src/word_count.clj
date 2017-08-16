(ns word-count
  (:require [clojure.string :as str]))

(defn counter [words word]
  (assoc words word (inc (get words word 0))))

(defn sanitize [words]
  (str/replace (str/lower-case words) #"\W+" " "))

(defn word-count [string]
  (reduce counter {}
          (map str/trim
               (str/split (sanitize string) #"()\s+"))))

(defn -main "zica" []
  (print (word-count "topperson")))
