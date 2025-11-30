/*
1   2   3   4   5   
  6   7   8   9
    10  11  12  
      13  14
        15
*/

import java.util.Scanner;

public class Q99 {
    public static void printPattern(int n) {
        int star = n; int space = 0; int num = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++) {
                System.out.printf("%-2s","");
            }
            for(int j=1; j<=star; j++) {
                System.out.printf("%-4d", num++);
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
