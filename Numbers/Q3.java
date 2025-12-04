package Numbers;

import java.util.Scanner;

public class Q3 {
    public static void printPerfectNumber(int start, int end) {
        for(int i=start; i<=end; i++) {
            if(checkPerfectNumber(i)) {
                System.out.print(i+" ");
            }
        }
    }
    public static boolean checkPerfectNumber(int n) {
        if(n==1) {
            return false;
        }
        int sum = 1;
        for(int i=2; i*i<=n; i++) {
            if(n%i==0) {
                int factor1=i;
                int factor2=n/i;
                if(factor1 != factor2) {
                    sum = sum + factor1 + factor2;
                } else {
                    sum = sum + factor1;
                }
            }
        }
        return sum==n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting value: ");
        int start = sc.nextInt();
        System.out.println("Enter End value: ");
        int end = sc.nextInt();
        printPerfectNumber(start, end);
        sc.close();
    }
}
