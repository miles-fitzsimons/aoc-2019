(ns aoc-2019.day-4-test
  (:require [clojure.test :refer :all])
  (:require [aoc-2019.day-4 :refer :all]))

(deftest adjacent-digits?-test
  (is (true? (adjacent-digits? 33444)))
  (is (false? (adjacent-digits? 12342))))

(deftest only-two-adjacent-digits?-test
  (is (true? (only-two-adjacent-digits? 112222333345)))
  (is (nil? (only-two-adjacent-digits? 5556666))))

(deftest increasing?-test
  (is (true? (increasing? 11122333445567)))
  (is (false? (increasing? 111223334345567)))
  )

(deftest is-password?-test
  (is (true? (is-password? 111111)))
  (is (false? (is-password? 123456)))
  (is (false? (is-password? 1123245))))

(deftest count-passwords-test
  (is (= (count-passwords 236491 713787) 1169))
  )
