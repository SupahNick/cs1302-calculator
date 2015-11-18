package cs1302.calc;

/* Implement the Math interface using iteration here. For each method, replace
* the throw statement with your implementation.
*/

/**
* REPLACE ME WITH ACTUAL JAVADOC FOR THIS CLASS.
*
* @author AUTHOR
*/
public class IterativeMath implements Math {

   public int inc(int n) {
       return n + 1;
   } // inc

   public int dec(int n) {
       return n - 1;
   } // dec

   public int add(int lhs, int rhs) {
       while (rhs != 0) {
           lhs = inc(lhs);
           rhs = dec(rhs);
       }
       return lhs;
   } // add

   public int sub(int lhs, int rhs) {
       if (rhs > lhs) {
           return 0;
       }
       while (rhs != 0) {
           lhs = dec(lhs);
           rhs = dec(rhs);
       }
       return lhs;
   } // sub

   public int mul(int lhs, int rhs) {
       int sum = lhs;
       if (rhs == 0) return 0;
       while (rhs > 1) {
           sum = add(sum, lhs);
           rhs = pred(rhs);
       } // while
       return sum;
   } // mul

   public int div(int lhs, int rhs) {
       if (lhs < rhs) {
           return 0;
       }
       if (lhs == rhs) {
           return 1;
       }
       return inc(div(sub(lhs, rhs), rhs));
   } // div

   public int fac(int n) {
       int acc = 1;
       if (n == 0) {
           return 1;
       }
       while (n != 0) {
           acc = n * acc;
           n = n - 1;
       }
       return acc;
   } // fac

   public int pow(int lhs, int rhs) {
       if (rhs == 0) return 1;
       return mul(lhs, pow(lhs, dec(rhs)));
   } // pow

   public int lshift(int lhs, int rhs) {
       if (rhs == 0) {
           return lhs;
       }
       if (lhs == 0) {
           return 0;
       }
       while (rhs != 0) {
           lhs = div(lhs, 2);
           rhs = dec(rhs);
       }
       return lhs;
   } // lshift

   public int rshift(int lhs, int rhs) {
       if (rhs == 0) {
           return lhs;
       }
       if (lhs == 0) {
           return 0;
       }
       while (rhs != 0) {
           lhs = mul(lhs, 2);
           rhs = dec(rhs);
       }
       return lhs;
   } // rshift

} // IterativeMath
