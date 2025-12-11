/*
WAJP to print all the term of Fibonacci series.
*/

import java.util.Scanner;

public class Q24 {
    public static void printFibonacci(int n) {
        if(n == 0) {
            System.out.print("0 ");
            return;
        }
        if(n==1) {
            System.out.print("0 1 ");
            return;
        }
        System.out.print("0 1 ");
        int n1=0,n2=1,n3=0;
        for(int i=2; i<=n; i++) {
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2; n2=n3;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        printFibonacci(n);
        sc.close();
    }
}
