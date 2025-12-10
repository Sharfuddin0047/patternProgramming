/*
WAJP to print and count all the Armstrong
numbers up to 100.
*/

import java.util.Scanner;

public class Q17 {
    public static void printArmstrong(int start, int end) {
        int count = 0;
        for(int i=start; i<=end; i++) {
            if(isArmstrong(i)) {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("\nTotal Armstrong numbers in given range are: "+count);
    }
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
        System.out.println("Enter the start value: ");
        int start = sc.nextInt();
        System.out.println("Enter the end value");
        int end = sc.nextInt();
        printArmstrong(start, end);
        sc.close();
    }
}
