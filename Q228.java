/*
Enter the Number of n: 
5
        * 
      *   * 
    *       * 
  *           * 
*               * 
*/

import java.util.Scanner;

public class Q228 {
    public static void printPattern(int n) {
        int start=n; int end = n;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=end; j++) {
                if(j == start || j == end) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            start--; end++;
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
