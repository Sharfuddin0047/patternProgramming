/*
WAJP to print nth term of Tribonacci series.

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
*/

import java.util.Scanner;

public class Q27 {
    public static int tribonacci(int n) {
        if(n <=1) {
            return n;
        }
        if(n==2) {
            return 1;
        }
        int n1=0,n2=1,n3=1,n4=0;
        for(int i=3; i<=n; i++) {
            n4=n1+n2+n3;
            n1=n2; n2=n3; n3=n4;
        }
        return n4;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value: ");
        int n = sc.nextInt();
        System.out.println(n+"th Fibonacci term is: "+tribonacci(n));
        sc.close();
    }
}
