/*
Enter the Number of Rows: 5
              1
           1  1  2
        3  4  1  5  6
     7  8  9  1 10 11 12
 13 14 15 16  1 17 18 19 20
*/

import java.util.Scanner;

public class Q84 {
    public static void printPattern(int n) {
        int space = n - 1;
        int star = 1;
        int num = 1;

        for (int i = 1; i <= n; i++) {


            for (int j = 1; j <= space; j++) {
                System.out.printf("%3s", "");  
            }

            int colMid = (star / 2) + 1;
            for (int j = 1; j <= star; j++) {
                if (j == colMid) {
                    System.out.printf("%3d", 1);
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
