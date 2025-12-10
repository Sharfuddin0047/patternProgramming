/*
WAJP to print and count all the dissarium
numbers in a range.
*/

import java.util.Scanner;

public class Q19 {
    public static void printDissarium(int start, int end) {
        int count=0;
        for(int i=start; i<=end; i++) {
            if(isDissarium(i)) {
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println("\nTotal Dissarium count is: "+count);
    }

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
        System.out.println("Enter the start value: ");
        int start = sc.nextInt();
        System.out.println("Enter the end value: ");
        int end = sc.nextInt();
        printDissarium(start, end);
        sc.close();
    }
}
