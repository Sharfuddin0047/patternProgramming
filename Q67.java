/*
Enter the number of rows: 
7
            * 
          * * * 
        * * * * * 
      * * * * * * * 
    * * * * * * * * * 
  * * * * * * * * * * * 
* * * * * * * * * * * * * 
 */

import java.util.Scanner;

public class Q67 {
    public static void printPattern(int n) {
        int star = 1; int space = n-1; 
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++) {
                System.out.print("* ");
            }
            star +=2; space--; 
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        printPattern(n);
    }
}
