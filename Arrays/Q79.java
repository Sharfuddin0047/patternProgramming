/*You are given an integer n that consists of exactly 3 digits.

We call the number n fascinating if, after the following modification, the resulting number contains all the digits from 1 to 9 exactly once and does not contain any 0's:

Concatenate n with the numbers 2 * n and 3 * n.
Return true if n is fascinating, or false otherwise.

Concatenating two numbers means joining them together. For example, the concatenation of 121 and 371 is 121371.

  */

import java.util.Arrays;

public class Q79 {
    public static boolean isFascinating(int n) {
        String str = "" + n + (2*n) + (3*n);
        if (str.length() != 9) return false;
        char[] num=str.toCharArray();
        Arrays.sort(num);
        for(int i=0;i<9;i++) {
            if(num[i] != (char)(i+'1') ) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 192;
        System.out.println(isFascinating(n));
    }
}
