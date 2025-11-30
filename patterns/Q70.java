/*
Enter the number of rows: 
5
        5 
      4 4 4 
    3 3 3 3 3 
  2 2 2 2 2 2 2 
1 1 1 1 1 1 1 1 1 
 */

import java.util.Scanner;

public class Q70 {
    public static void printPattern(int n) {
        int star = 1; int space = n-1; int num = n;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++) {
                System.out.print(num+" ");
            }
            star +=2; space--; num--;
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
