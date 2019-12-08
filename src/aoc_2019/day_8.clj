(ns aoc-2019.day-8)

;(defn build-layer
;  [in width height]
;  (loop [layer []
;         in in
;         n 0]
;    (if (> height n)
;      (recur (conj layer (take width in)) (drop width in) (inc n))
;      layer)))
;;; can probably just partition

(def width 3)
(def height 2)

;(defn build-layer
;  [in]
;  (partition width in))
;
;
;
;(defn build-image
;  [in]
;  (for [layer-input (partition (* width height) in)]
;    (build-layer layer-input)))
;; can this just be a map?
(defn build-image
  [in]
  (partition (* width height) in))


(defn count-zeros
  [layer]
  ((frequencies layer) \0))




(defn get-low-zero-layer
  [in]
  (let [image (build-image in)
        zeros (map #(count-zeros %) image)]
    (nth (build-image in) (.indexOf zeros (apply min zeros)))))

(defn multiply-sums
  [in]
  (let [layer (get-low-zero-layer in)
        ones ((frequencies layer) \1)
        twos ((frequencies layer) \2)]
    (* ones twos)))








