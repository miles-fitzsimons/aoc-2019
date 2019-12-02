(ns aoc-2019.day-2-test
  (:require [clojure.test :refer :all]
            [aoc-2019.day-2 :as day-2]
            [data]))

(deftest part-1
  (testing "computer"
    (is (=
          [3500 9 10 70 2 3 11 0 99 30 40 50]
          (day-2/computer [1 9 10 3 2 3 11 0 99 30 40 50])))
    (is (= [2 0 0 0 99] (day-2/computer [1 0 0 0 99])))
    (is (= [2 3 0 6 99] (day-2/computer [2 3 0 3 99])))
    (is (= [2 4 4 5 99 9801] (day-2/computer [2 4 4 5 99 0])))
    (is (= [30 1 1 4 2 5 6 0 99] (day-2/computer [1 1 1 4 99 5 6 0 99])))
    (is (= 5305097 (first (day-2/computer data/day-2-input))))))

(deftest part-2
  (testing "brute-force"
    (is (= [1 49 25] (day-2/brute-force data/day-2-input)))))
