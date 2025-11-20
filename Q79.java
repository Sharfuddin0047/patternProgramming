/*
Enter the Number of Rows: 5
              1
           2  1  2
        3  2  1  2  3
     4  3  2  1  2  3  4
  5  4  3  2  1  2  3  4  5
*/


import java.util.Scanner;

public class Q79 {
    public static void printPattern(int n) {
        int space = n - 1;
        int star = 1;

        for (int i = 1; i <= n; i++) {
            int num = i;

            for (int j = 1; j <= space; j++) {
                System.out.printf("%3s", "");  
            }

            int colMid = (star / 2) + 1;
            for (int j = 1; j <= star; j++) {
                if (j < colMid) {
                    System.out.printf("%3d", num--);
                } else {
                    System.out.printf("%3d", num++);
                }
            }

            space--;
            star += 2;
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