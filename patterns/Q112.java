/*
1  2  3  4  5  6  7  8  9  
   10 11 12 13 14 15 16 
      17 18 19 20 21 
         22 23 24 
            25 
*/

import java.util.Scanner;

public class Q112 {
    public static void printPattern(int n) {
        int star = 2*n-1; int space = 0; int num = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++) {
                System.out.printf("%-3s","");
            }
            for(int j=1; j<=star; j++) {
                System.out.printf("%-3d", num++);
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
