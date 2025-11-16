/*
Enter the number of rows: 
7
1
3       2
6       5       4
10      9       8       7
15      14      13      12      11
21      20      19      18      17      16
28      27      26      25      24      23      22
 */

import java.util.Scanner;

public class Q24 {
    public static void printPattern(int n) {
        int star = 1;
        
        for (int i = 1; i <= n; i++) {
            int num = i*(i+1)/2;
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
