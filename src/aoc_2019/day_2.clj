(ns aoc-2019.day-2)

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

(defn brute-force
  [input]
  (loop [instructions (for [instruction '(1 2)
                            noun (range 100)
                            verb (range 100)]
                        [instruction noun verb])]
    (let [result (computer (assoc
                             input
                             0 ((first instructions) 0)
                             1 ((first instructions) 1)
                             2 ((first instructions) 2)))]
      (if (= (first result) 19690720)
        (first instructions)
        (recur (rest instructions))))))
