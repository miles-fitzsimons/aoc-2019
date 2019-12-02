(ns aoc-2019.day-1-test
  (:require [clojure.test :refer :all]
            [aoc-2019.day-1 :as day-1]
            [data]))

(deftest part-1
  (testing "calc-fuel"
    (is (= 2 (day-1/calc-fuel 12)))
    (is (= 2 (day-1/calc-fuel 14)))
    (is (= 654 (day-1/calc-fuel 1969)))
    (is (= 33583 (day-1/calc-fuel 100756))))

  (testing "calc-fuel-requirements-1"
    (is (= 3255932 (day-1/calc-fuel-requirements-1 data/day-1-masses)))))

(deftest part-2
  (testing "calc-fuel-per-module"
    (is (= 2 (day-1/calc-fuel-per-module 12)))
    (is (= 966 (day-1/calc-fuel-per-module 1969)))
    (is (= 50346 (day-1/calc-fuel-per-module 100756))))

  (testing "calc-fuel-requirements-2"
    (is (= 4881041 (day-1/calc-fuel-requirements-2 data/day-1-masses)))))
