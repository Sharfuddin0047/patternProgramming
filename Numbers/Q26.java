/*
WAJP to print all the term of Tribonacci series.
*/

import java.util.Scanner;

public class Q26 {
    public static void printTribonacci(int n) {
        if(n == 0) {
            System.out.print("0 ");
            return;
        }
        if(n==1) {
            System.out.print("0 1 ");
            return;
        }
        if(n==2) {
            System.out.print("0 1 1 ");
            return;
        }
        System.out.print("0 1 1 ");
        int n1=0,n2=1,n3=1,n4=0;
        for(int i=3; i<=n; i++) {
            n4=n1+n2+n3;
            System.out.print(n4+" ");
            n1=n2; n2=n3; n3=n4;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        printTribonacci(n);
        sc.close();
    }
}
