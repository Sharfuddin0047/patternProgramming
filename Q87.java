/*
Enter the Number of Rows: 5
        A 
      B B B 
    C C C C C 
  D D D D D D D 
E E E E E E E E E 
*/

import java.util.Scanner;

public class Q87 {
    public static void printPattern(int n) {
        int space = n-1; int star = 1; 
        for(int i=1; i<=n; i++) {
            int num = 64+i;
            for(int j=1; j<=space; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++) {
                System.out.print((char)num +" ");
            }

            star+=2; space--;
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
