/*
Enter the Number of n: 7
      1 
    2   2 
  3       3 
4           4 
  5       5 
    6   6 
      7 
*/

import java.util.Scanner;

public class Q235 {
    public static void printPattern(int n) {
        int start=n/2+1; int end = n/2+1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=end; j++) {
                if(j == start || j == end) {
                    System.out.print(i+" ");
                } else {
                    System.out.print("  ");
                }
            }
            if(i<n/2+1) {
                start--; end++;
            } else {
                start++; end--;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of n: ");
        int n = sc.nextInt();
        printPattern(n);
    }
}
