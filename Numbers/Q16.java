/*
WAJP to take user input and print whether the
number is an Armstrong number or not.

An Armstrong Number of n digits is a number that is equal to the sum of its digits raised to the power n.
For example:
- 153=1^3+5^3+3^3 → Armstrong
- 9474=9^4+4^4+7^4+4^4 → Armstrong
- 123\neq 1^3+2^3+3^3 → Not Armstrong

*/

import java.util.Scanner;

public class Q16 {
    public static boolean isArmstrong(int n) {
        int p = getDigitCount(n);
        int num = getSum(n,p);
        return num == n;
    }

    public static int getDigitCount(int n) {
        int count = 0;
        while(n>0) {
            count++;
            n/=10;
        }
        return count;
    }

    public static int getSum(int n, int p) {
        int sum = 0;
        while (n>0) {
            sum = sum + (int)Math.pow(n%10, p);
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(isArmstrong(n)) {
            System.out.println(n+" is Armstrong Number");
        } else {
            System.out.println(n+" is NOT a Armstrong Number");
        }
        sc.close();
    }
}
