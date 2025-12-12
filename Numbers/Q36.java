/*
WAJP to calculate permutation or total number
of ways of arrangements of n things taken r at a
time.
*/

import java.util.Scanner;

public class Q36 {
    public static int getPermutation(int n, int r) {
        int per = 1;
        for(int i=0; i<r; i++) {
            per = per*(n-i);
        }
        return per;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = sc.nextInt();
        System.out.println("Enter the r: ");
        int r = sc.nextInt();
        if(r>=0 && r<=n) {
           System.out.println("permutation is: "+getPermutation(n,r));
        } else {
            System.err.println(r+" r cannot be greater than n "+n);
        }
        sc.close();
    }
}
