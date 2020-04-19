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

(defn score [p1points p2points]
      (let [p1score (calc-score p1points)
            p2score (calc-score p2points)
            ]

           (if (= p1score p2score)
             (str p1score "-All")
             (str p1score "-" p2score)
             )

           
           )
      )