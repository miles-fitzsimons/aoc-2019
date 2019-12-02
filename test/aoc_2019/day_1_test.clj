(ns aoc-2019.day-1-test
  (:require [clojure.test :refer :all]
            [aoc-2019.day-1 :as day-1]))

(def masses [94794
             58062
             112067
             139512
             147400
             99825
             142617
             107263
             86294
             97000
             140204
             72573
             134981
             111385
             88303
             79387
             129111
             122976
             130685
             75100
             146566
             73191
             107641
             109940
             65518
             102028
             57370
             144556
             64017
             64384
             145114
             115853
             87939
             90791
             133443
             139050
             140657
             85738
             133749
             92466
             142918
             96679
             125035
             127629
             87906
             104478
             105147
             121741
             70312
             73732
             60838
             82292
             102931
             103000
             135903
             78678
             86314
             50772
             115673
             106179
             60615
             105152
             76550
             140591
             120916
             62094
             111273
             63542
             102974
             78837
             94840
             89126
             63150
             52503
             108530
             101458
             59660
             116913
             66440
             83306
             50693
             58377
             62005
             130663
             124304
             79726
             63001
             73380
             64395
             124277
             69742
             63465
             93172
             142068
             120081
             119872
             52801
             100693
             79229
             90365])

(deftest part-1
  (testing "calc-fuel"
    (is (= 2 (day-1/calc-fuel 12)))
    (is (= 2 (day-1/calc-fuel 14)))
    (is (= 654 (day-1/calc-fuel 1969)))
    (is (= 33583 (day-1/calc-fuel 100756))))

  (testing "calc-fuel-requirements-1"
    (is (= 3255932 (day-1/calc-fuel-requirements-1 masses)))))

(deftest part-2
  (testing "calc-fuel-per-module"
    (is (= 2 (day-1/calc-fuel-per-module 12)))
    (is (= 966 (day-1/calc-fuel-per-module 1969)))
    (is (= 50346 (day-1/calc-fuel-per-module 100756))))

  (testing "calc-fuel-requirements-2"
    (is (= 4881041 (day-1/calc-fuel-requirements-2 masses)))))
