(ns aoc-2019.day-4)
;
;(defn adjacent-digits?
;  [s]
;  (some? (re-find #"(\d)\1+" s)))


(defn adjacent-digits?
  [n]
  (some? (re-find #"(\d)\1+" (str n))))

(defn only-two-adjacent-digits?
  [n]
  (some #(= (count %) 2) (partition-by identity (str n))))

(defn increasing?
  [n]
  (= (str n) (clojure.string/join (sort (str n)))))

(defn is-password?
  [n]
  (and (increasing? n) (adjacent-digits? n)))

(defn count-passwords
  [start end]
  (count (filter #(is-password? %) (range start (inc end)))))
