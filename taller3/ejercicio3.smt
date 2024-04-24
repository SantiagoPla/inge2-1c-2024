(declare-const a1 Real)
(declare-const a2 Real)
(declare-const a3 Real)

(assert (= a1 (mod 16 2)))
(assert (= a2 (div 16 4)))
(assert (= a3 (rem 16 5)))

(check-sat)
(get-model)

;OUTPUT: 
;sat
;(model 
;  (define-fun a2 () Real
;    4.0)
;  (define-fun a1 () Real
;    0.0)
;  (define-fun a3 () Real
;    1.0)
;)