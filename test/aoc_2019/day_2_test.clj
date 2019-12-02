(ns aoc-2019.day-2-test
  (:require [clojure.test :refer :all]
            [aoc-2019.day-2 :as day-2]))

;; TODO put inputs in another file

(declare input)

(deftest part-1
  (testing "computer"
    (is (=
          [3500 9 10 70 2 3 11 0 99 30 40 50]
          (day-2/computer [1 9 10 3 2 3 11 0 99 30 40 50])))
    (is (= [2 0 0 0 99] (day-2/computer [1 0 0 0 99])))
    (is (= [2 3 0 6 99] (day-2/computer [2 3 0 3 99])))
    (is (= [2 4 4 5 99 9801] (day-2/computer [2 4 4 5 99 0])))
    (is (= [30 1 1 4 2 5 6 0 99] (day-2/computer [1 1 1 4 99 5 6 0 99])))
    (is (= 5305097 (first (day-2/computer input))))))

(deftest part-2
  (testing "brute-force"
    (is (= [1 49 25] (day-2/brute-force input)))))

(def input [1
            12
            2
            3
            1
            1
            2
            3
            1
            3
            4
            3
            1
            5
            0
            3
            2
            1
            13
            19
            1
            9
            19
            23
            1
            6
            23
            27
            2
            27
            9
            31
            2
            6
            31
            35
            1
            5
            35
            39
            1
            10
            39
            43
            1
            43
            13
            47
            1
            47
            9
            51
            1
            51
            9
            55
            1
            55
            9
            59
            2
            9
            59
            63
            2
            9
            63
            67
            1
            5
            67
            71
            2
            13
            71
            75
            1
            6
            75
            79
            1
            10
            79
            83
            2
            6
            83
            87
            1
            87
            5
            91
            1
            91
            9
            95
            1
            95
            10
            99
            2
            9
            99
            103
            1
            5
            103
            107
            1
            5
            107
            111
            2
            111
            10
            115
            1
            6
            115
            119
            2
            10
            119
            123
            1
            6
            123
            127
            1
            127
            5
            131
            2
            9
            131
            135
            1
            5
            135
            139
            1
            139
            10
            143
            1
            143
            2
            147
            1
            147
            5
            0
            99
            2
            0
            14
            0
            ])
