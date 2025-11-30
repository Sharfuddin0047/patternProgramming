/*
Enter the Number of Rows: 7
*   *   *   *   *   *   *   
  *   *   *   *   *   *   
    *   *   *   *   *   
      *   *   *   *   
        *   *   *   
          *   *   
            * 
*/

import java.util.Scanner;

public class Q94 {
    public static void printPattern(int n) {
        int star = n; int space = 0;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++) {
                System.out.print("*   ");
            }
            star--; space ++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();
        printPattern(n);
    }
}
