(ns tennis.core-test
  (:require [clojure.test :refer :all]
            [tennis.core :refer :all]))

(deftest tennis-scoring
  (testing "tennis scores"
    (is (= "Fifteen-Love" (score 1 0)))
    (is (= "Love-Fifteen" (score 0 1)))
    ;(is (= "Thirty-Love" (score 2 0)))
           ))
