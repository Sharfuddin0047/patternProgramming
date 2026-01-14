/*WAJP to print all the prime numbers up to n by
using Sieve of Eratosthenes
mechanism. */

import java.util.Arrays;
import java.util.Scanner;

public class Q40 {
    public static void sievePrime(int n) {
        boolean[] arr = new boolean[n+1]; //in the sieve, we want to check all numbers up to  inclusive.For example, if , we need to mark primes/non-primes for numbers .
        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;

        for(int i=2; i*i<=n; i++) {
            if(arr[i]) {
                for(int j=i*i; j<arr.length; j+=i) {
                    arr[j]=false;
                }
            }
        }

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == true) {
                System.out.print(i+" ");
            }
        }
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();
        sievePrime(n);
        sc.close();
    }
}
