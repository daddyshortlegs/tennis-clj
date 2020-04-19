(ns tennis.core-test
    (:require [clojure.test :refer :all]
      [tennis.core :refer :all]))

(deftest tennis-scoring
         (testing "simple cases"
                  (is (= "Fifteen-Love" (score 1 0)))
                  (is (= "Love-Fifteen" (score 0 1)))
                  (is (= "Thirty-Love" (score 2 0)))
                  (is (= "Love-Thirty" (score 0 2)))
                  (is (= "Forty-Love" (score 3 0)))
                  (is (= "Love-Forty" (score 0 3)))
                  )

         (testing "draws"
                  (is (= "Love-All" (score 0 0)))
                  (is (= "Fifteen-All" (score 1 1)))
                  (is (= "Thirty-All" (score 2 2)))
                  (is (= "Deuce" (score 3 3)))
                  (is (= "Deuce" (score 4 4)))
                  )


         (testing "winner"
                  (is (= "Win for player 1" (score 4 0)))
                  (is (= "Win for player 2" (score 0 4)))
                  (is (= "Win for player 1" (score 4 1)))
                  (is (= "Win for player 2" (score 1 4)))
                  (is (= "Win for player 1" (score 4 2)))
                  (is (= "Win for player 2" (score 2 4)))

                  )
         )
