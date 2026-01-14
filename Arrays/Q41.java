/*WAJP to count all prime numbers up to n. */

import java.util.Arrays;
import java.util.Scanner;

public class Q41 {
    public static int countPrime(int n) {
        if(n<=1) {
            return 0;
        }
        int count=0;
        boolean[] arr = new boolean[n]; //in the sieve, we want to check all numbers up to  inclusive.For example, if , we need to mark primes/non-primes for numbers .
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
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();
        System.out.println("Total prime number: "+countPrime(n));
        sc.close();
    }
}
