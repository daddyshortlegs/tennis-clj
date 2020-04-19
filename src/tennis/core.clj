(ns tennis.core
    (:gen-class))

(defn calc-score [points]
      (let [scores {0 "Love"
                    1 "Fifteen"
                    2 "Thirty"
                    3 "Forty"}]
           (get scores points)
           )
      )

(defn deuce-or-all [p1score p1points]
      (if (>= p1points 3)
        "Deuce"
        (str p1score "-All")
        )
      )

(defn score [p1points p2points]
      (let [p1score (calc-score p1points)
            p2score (calc-score p2points)
            ]

           (cond
             (and (= 4 p1points) (> p1points p2points)) "Win for player 1"
             (= p1score p2score) (deuce-or-all p1score p1points)
             :else (str p1score "-" p2score)

             )

           )
      )