package Numbers;

import java.util.Scanner;

/*
WAJP to check whether a number is perfect numbers or not
*/
public class Q2 {
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
                    System.out.print(factor1+" "+factor2+" ");
                    sum = sum + factor1 + factor2;
                } else {
                    System.out.println(factor1+" ");
                    sum = sum + factor1;
                }
            }
        }
        return sum==n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(checkPerfectNumber(n));
        sc.close();
    }
}
