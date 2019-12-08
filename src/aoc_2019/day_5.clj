(ns aoc-2019.day-5)

(defn computer
  [input]
  (loop [input input
         n 0]
    (if (= 99 (input n))
      input
      (let [index-a (input (+ n 1)) a (input index-a)
            index-b (input (+ n 2)) b (input index-b)
            index-c (input (+ n 3))]
        (case (input n)
          1 (recur (assoc input index-c (+ a b)) (+ n 4))
          2 (recur (assoc input index-c (* a b)) (+ n 4)))))))
