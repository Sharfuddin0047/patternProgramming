/*WAJP to store n terms of Fibonacci series into
an array. */

import java.util.Arrays;
import java.util.Scanner;

public class Q43 {
    public static void storeFib(int n) {
        if(n<=0) {
            throw new IllegalStateException("Enter a positive value greater than 0");
        }
        int[] arr = new int[n];

        if(n>1) {
            arr[1]=1;
        }
        for(int i=2; i<n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Fibonacci numbers to store: ");
        int n = sc.nextInt();
        storeFib(n);
        sc.close();

    }
}
