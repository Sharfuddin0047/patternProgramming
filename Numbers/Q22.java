/*
WAJP to take user input and print whether the
number is Automorphic number or not.

An Automorphic number (also called a Circular number) is a number whose square ends with the same digits as the number itself.
- In other words:
If n^2 ends with n, then n is automorphic.

✨ Examples
- 5 → 5^2=25 → ends with 5 ✅
- 6 → 6^2=36 → ends with 6 ✅
- 25 → 25^2=625 → ends with 25 ✅
- 76 → 76^2=5776 → ends with 76 ✅
- 7 → 7^2=49 → does not end with 7 ❌

*/

import java.util.Scanner;

public class Q22 {
    public static boolean isAutomorphic(int n) {
        int a = getDigit(n);
        int NewN = (int)Math.pow(n, 2);

        return (NewN%(int)Math.pow(10,a)) == n;
    }

    public static int getDigit(int n) {
        int count=0;
        while(n>0) {
            n/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(isAutomorphic(n)) {
            System.out.println(n+" is Automorphic number");
        } else {
            System.out.println(n+" is NOT a Automorphic number");
        }
        sc.close();
    }
}
