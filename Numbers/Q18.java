/*
WAJP to take user input and print whether the
number is dissarium number or not.

A Disarium number is a number in which the sum of its digits powered with their respective positions is equal to the number itself.
- Position is counted starting from 1 (leftmost digit).
- Formula:
For a number n=d_1d_2d_3...d_k,
n=d_1^1+d_2^2+d_3^3+\dots +d_k^k

✨ Examples
- 89 → 8^1+9^2=8+81=89 ✅ (Disarium)
- 135 → 1^1+3^2+5^3=1+9+125=135 ✅
- 80 → 8^1+0^2=8+0=8\neq 80 ❌

*/

import java.util.Scanner;

public class Q18 {
    public static boolean isDissarium(int n) {
        int num = n; int sum = 0;
        int p = getDigitCount(n);
        while(n>0) {
            sum = sum + getPow(n%10, p);
            n/=10; p--;
        }
        return num == sum;
    }

    public static int getPow(int base, int exponent) {
        if(exponent == 0) {
            return 1;
        }
        int val=1;
        for(int i=1; i<=exponent; i++) {
            val = val * base;
        }
        return val;
    }

    public static int getDigitCount(int n) {
        int count=0;
        while(n>0) {
            count++;
            n/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(isDissarium(n)) {
            System.out.println(n+" is a Dissarium Number");
        } else {
            System.out.println(n+" is a NOT a Dissarium Number");
        }
        sc.close();
    }
}
