sort definitions
s2=$2|3|4.
s=$1|2|3 + f($a,$b) * s2+$a.
predicate declarations
p(s).
q(s).
program rules
{p(1);q(2)}.
1<={p(a);q(a)}<=2+3.
(X+1)<={p(a);q(a)}<=1*(X*2+3-5).
(X+1)<={p(X):q(X);q(a)}<=1*(X*2+3-5).
p(a):-(X+1)*3<=#count{X:p(X),p(Y)}<=2+(X+1)*3.
p(a):-(X+1)*3<=#sum{X:p(1),p(2)}<=2+(X+1)*3.
p(X):-(X+1)*3<=#max{X:q(X),p(2);2}<=2+(X+1)*3.

