/*
Enter the number of rows: 
3
    1  
  2  3  4
5  6  7  8  9
 */

import java.util.Scanner;

public class Q74 {
    public static void printPattern(int n) {
        int star = 1; int space = n-1; int num = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++){
                System.out.printf("  ");
            }
            for(int j=1; j<=star; j++) {
                System.out.printf(num++ +"  ");
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
