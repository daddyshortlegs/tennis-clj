(ns tennis.core
    (:gen-class))

(defn calc-score [points]
      (if (= points 1)
        "Fifteen"
        "Love"
        )
      )

(defn score [p1points p2points]
      (let [p1score (calc-score p1points)
            p2score (calc-score p2points)
            ]

           (str p1score "-" p2score)
           )

      )