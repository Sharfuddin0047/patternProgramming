/*
Enter the number of rows: 
5
A 
A B 
A B C 
A B C D 
A B C D E 
 */

import java.util.Scanner;

public class Q30 {
    public static void printPattern(int n) {
        int star = 1;

        for (int i = 1; i <= n; i++) {
            int num = 65;
            for (int j = 1; j <= star; j++) {
                System.out.print((char) num++ + " ");
            }
            star++;
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
