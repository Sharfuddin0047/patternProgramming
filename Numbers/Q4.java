package Numbers;

import java.util.Scanner;

public class Q4 {
    public static int getKthPerfectNumber(int k) {
        
        int count = 0;
        int i=6; //perfect number startt from 6
        while(count <= k){
            if(checkPerfectNumber(i)){
                count++;
            }
            i++;
        }
        return i;
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
        System.out.println("Enter kth number: ");
        int k = sc.nextInt();
        System.out.println(getKthPerfectNumber(k));
        sc.close();
    }
}
