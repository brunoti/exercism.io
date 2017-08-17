(ns anagram
  (:require
    [clojure.string :as str]))

(defn string-to-chars [word]
  (str/split (str/lower-case word) #""))

(defn same-count-of-each-char? [word anagram]
  (=
   (frequencies (string-to-chars word))
   (frequencies (string-to-chars anagram))))

(defn includes-all? [string substrs]
  (reduce (fn [has? substr]
            (and has?
                 (str/includes? (str/lower-case string) substr)))
          true substrs))

(defn lower-case-array [words]
  (map str/lower-case words))

(defn same-size?
  [& strs] (apply = (map count strs)))

(defn anagram-of? [word anagram]
  (and
    (includes-all? anagram (string-to-chars word))
    (same-size? word anagram)
    (same-count-of-each-char? word anagram)
    (apply not= (map str/lower-case [word anagram]))))

(defn anagrams-for [word anagrams]
  (filter #(true? (anagram-of? word %1)) anagrams))
