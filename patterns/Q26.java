/*
Enter the number of rows: 
5
15
14      13
12      11      10
9       8       7       6
5       4       3       2       1
 */

import java.util.Scanner;

public class Q26 {
    public static void printPattern(int n) {
        int star = 1;
        int num = n*(n+1)/2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print(num-- + "\t");
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
