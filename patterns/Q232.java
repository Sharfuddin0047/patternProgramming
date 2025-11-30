/*
Enter the Number of n: 7
* * * * * * * * * * * * * 
  *                   *
    *               *
      *           *
        *       *
          *   *
            *
*/

import java.util.Scanner;

public class Q232 {
    public static void printPattern(int n) {
        int start=1; int end = 2*n-1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=end; j++) {
                if(j == start || j == end || i == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            start++; end--;
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
