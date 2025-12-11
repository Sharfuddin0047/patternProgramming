/*
WAJP to print and count all the Automorphic
numbers up to 100.
*/

import java.util.Scanner;

public class Q23 {
    public static void printAutomorphic(int start, int end) {
        int count=0;
        for(int i=start; i<=end; i++) {
            if(isAutomorphic(i)) {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("\nTotal such numbers are: "+count);
    }

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
        int start = sc.nextInt();
        System.out.println("Enter the number: ");
        int end = sc.nextInt();
        printAutomorphic(start,end);
        sc.close();
    }
}
