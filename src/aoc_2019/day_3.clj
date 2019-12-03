(ns aoc-2019.day-3)

;(defn move-up [track steps]
;  (loop [track track
;         count 1]
;    (if (<= count steps)
;      (recur (conj track [((last track) 0) (+ ((last track) 1) 1)]) (inc count))
;      track)))

(defn move-up [track steps]
  (let [start-x (first (last track))
        start-y (inc (second (last track)))]
    (concat track (partition 2 (interleave (repeat steps start-x) (range start-y (+ start-y steps)))))))

;(defn move-down [track steps]
;  (loop [track track
;         count 1]
;    (if (<= count steps)
;      (recur (conj track [((last track) 0) (- ((last track) 1) 1)]) (inc count))
;      track)))

(defn move-down [track steps]
  (let [start-x (first (last track))
        start-y (dec (second (last track)))]
    (concat track (partition 2 (interleave (repeat steps start-x) (range start-y (- start-y steps) -1))))))

;(defn move-left [track steps]
;  (loop [track track
;         count 1]
;    (if (<= count steps)
;      (recur (conj track [(- ((last track) 0) 1) ((last track) 1)]) (inc count))
;      track)))

(defn move-left [track steps]
  (let [start-x (dec (first (last track)))
        start-y (second (last track))]
    (concat track (partition 2 (interleave (range start-x (- start-x steps) -1) (repeat steps start-y))))))

;(defn move-right [track steps]
;  (loop [track track
;         count 1]
;    (if (<= count steps)
;      (recur (conj track [(+ ((last track) 0) 1) ((last track) 1)]) (inc count))
;      track)))

(defn move-right [track steps]
  (let [start-x (inc (first (last track)))
        start-y (second (last track))]
    (concat track (partition 2 (interleave (range start-x (+ start-x steps)) (repeat steps start-y))))))


(defn get-path-coordinates [path]
  (loop [track [[0 0]]
         path path]
    (if (empty? path)
      (rest track)
      (let [direction (first (first path))
            steps (read-string (clojure.string/join (rest (first path))))]
        (recur (case direction
                 \U (move-up track steps)
                 \D (move-down track steps)
                 \L (move-left track steps)
                 \R (move-right track steps))
               (rest path))))))

(defn get-duplicates [path-1 path-2]
  (let [track-1 (get-path-coordinates path-1)
        track-2 (get-path-coordinates path-2)]
    (for [[coordinates freq] (frequencies (concat track-1 track-2))
          :when (> freq 1)]
      coordinates)))

(defn get-min-distance [path-1 path-2]
  (let [coordinates (get-duplicates path-1 path-2)]
    (apply min (map #(+ (Math/abs (first %)) (Math/abs (second %))) coordinates))))

; start with [[0 0]]
; get to     [[0 0] [1 0] [2 0] [3 0] ... ]

;(defn square-matrix [n p]
;  (->> p (repeat n) vec (repeat n) vec))
