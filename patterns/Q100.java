/*
Enter the Number of Rows: 5
15  14  13  12  11  
  10  9   8   7   
    6   5   4   
      3   2   
        1   
*/

import java.util.Scanner;

public class Q100 {
    public static void printPattern(int n) {
        int star = n; int space = 0; int num = n*(n+1)/2;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++) {
                System.out.printf("%-2s","");
            }
            for(int j=1; j<=star; j++) {
                System.out.printf("%-4d", num--);
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
