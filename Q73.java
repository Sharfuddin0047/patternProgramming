/*
Enter the number of rows: 
5
        1 
      3 2 1
    5 4 3 2 1
  7 6 5 4 3 2 1
9 8 7 6 5 4 3 2 1
 */

import java.util.Scanner;

public class Q73 {
    public static void printPattern(int n) {
        int star = 1; int space = n-1;
        for(int i=1; i<=n; i++) {
            int num = star;
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++) {
                System.out.print(num-- +" ");
            }
            star +=2; space--; num = star+2;
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
