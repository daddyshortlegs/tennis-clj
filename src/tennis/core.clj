(ns tennis.core
    (:gen-class))

(defn calc-score [points]
      (get {0 "Love", 1 "Fifteen", 2 "Thirty" 3 "Forty"} points)
      )

(defn deuce-or-all [p1points]
      (if (>= p1points 3) "Deuce" (str (calc-score p1points) "-All"))
      )

(defn is-win? [p1points p2points]
      (and (>= (max p1points p2points) 4) (not= p1points p2points))
      )

(defn winning-player [p1points p2points]
      (if (> p1points p2points) "1" "2")
      )

(defn is-advantage? [p1points p2points]
      (and (>= (max p1points p2points) 4) (= 1 (Math/abs (- p1points p2points))))
      )

(defn score [p1points p2points]
      (let [leader (winning-player p1points p2points)]
           (cond
             (is-advantage? p1points p2points) (str "Advantage player " leader)
             (is-win? p1points p2points) (str "Win for player " leader)
             (= p1points p2points) (deuce-or-all p1points)
             :else (str (calc-score p1points) "-" (calc-score p2points))
             )
           )
      )
