/*
Enter the Number of Rows: 5
1 1 1 1 1 1 1 1 1 
  0 0 0 0 0 0 0
    1 1 1 1 1
      0 0 0
        1 
*/

import java.util.Scanner;

public class Q108 {
    public static void printPattern(int n) {
        int star = 2*n-1; int space = 0; 
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++) {
                System.out.printf("%-2s","");
            }
            for(int j=1; j<=star; j++) {
                System.out.printf("%-2d", i%2);
            }
            star-=2; space ++; 
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
