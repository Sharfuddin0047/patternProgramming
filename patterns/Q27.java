/*
Enter the number of rows: 
5
A 
B C 
D E F 
G H I J 
K L M N O 
 */

import java.util.Scanner;

public class Q27 {
    public static void printPattern(int n) {
        int star = 1;
        int num = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print((char)num++ + " ");
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
