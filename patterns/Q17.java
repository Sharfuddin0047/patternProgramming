/*
Enter number of Rows:
7
1
2       2
3       3       3
4       4       4       4
5       5       5       5       5
6       6       6       6       6       6
7       7       7       7       7       7       7
 */

import java.util.Scanner;

class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows: ");
        int n = sc.nextInt();
        printPattern(n);
    }

    public static void printPattern(int n) {
        int star = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= star; j++)
                System.out.print(i + "\t");
            star++;
            System.out.println();
        }
    }
}