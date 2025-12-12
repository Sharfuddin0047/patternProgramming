/*
WAJP to calculate combination or total no of ways of selecting r things at a time from n things.
*/

import java.util.Scanner;

public class Q37 {
    public static int getCombination(int n, int r) {
        int com = 1;
        for(int i=0; i<r; i++) {
            com = com*(n-i)/(i+1);
        }
        return com;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = sc.nextInt();
        System.out.println("Enter the r: ");
        int r = sc.nextInt();
        if(r>=0 && r<=n) {
           System.out.println("permutation is: "+getCombination(n,r));
        } else {
            System.err.println(r+" r cannot be greater than n "+n);
        }
        sc.close();
    }
}
