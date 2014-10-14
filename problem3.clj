(comment
Largest prime factor
Problem 3

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
)

(defn prime?
  ([]
   false)
  ([number]
   (if (= number 2)
     true
   (if (= (count
           (filter
            (fn [x]
              (if (= (mod number x) 0)
                true
                false))
             (range 1 (+ (Math/sqrt number) 1)))) 1)
     true
     false
     ))))

(first
 (reverse
  (filter
   prime?
   (filter
    (fn [x]
      (if (= (mod 600851475143 x) 0)
        true
        false))
    (range 2 (Math/sqrt 600851475143))))))
