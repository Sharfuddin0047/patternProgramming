/*
Enter the Number of Rows:
5
        5 
      4 5 4 
    3 4 5 4 3 
  2 3 4 5 4 3 2 
1 2 3 4 5 4 3 2 1 
 */ 

import java.util.Scanner;

public class Q78 {
    public static void printPattern(int n) {
        for (int i = n; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }

            // Print increasing numbers from i to n
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }

            // Print decreasing numbers from n-1 to i
            for (int j = n - 1; j >= i; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows:");
        int n = sc.nextInt();
        printPattern(n);
    }
}