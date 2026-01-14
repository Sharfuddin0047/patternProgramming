/*WAJP to store first n prime numbers into array. */

import java.util.Arrays;
import java.util.Scanner;

public class Q39 {
     public static void storePrime(int n) {
        if(n<1){
            System.out.println("NO sprime number");
            return;
        } else if (n == 1){
            int[] arr={2};
            System.out.println(Arrays.toString(arr));
            return;
        }
        int count=1;
        int[] arr=new int[n];
        arr[0]=2;
        int i=3; int j=1;
        while(count<n) {
            if(isPrime(i)) {
                count++;
                arr[j++]=i;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
     }

     public static boolean isPrime(int n) {
        if(n<=1) {
            return false;
        }
        if(n == 2) {
            return true;
        }
        for(int i=2; i*i<=n; i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();
        storePrime(n);
    }
}
