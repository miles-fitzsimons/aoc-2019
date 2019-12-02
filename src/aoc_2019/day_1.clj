(ns aoc-2019.day-1)

(defn calc-fuel
  [mass]
  ((comp #(- % 2) #(quot % 3)) mass))

(defn calc-fuel-requirements-1
  [masses]
  (reduce + (map #(calc-fuel %) masses)))

(defn calc-fuel-per-module
  [mass]
  (loop [result []
         m mass]
    (if (pos? m)
      (recur (conj result (calc-fuel m)) (calc-fuel m))
      (reduce + (butlast result)))))

(defn calc-fuel-requirements-2
  [masses]
  (->> masses
       (map #(calc-fuel-per-module %))
       (reduce +)))
