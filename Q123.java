/*
Enter the Number of Rows: 5
Y  X  W  V  U  T  S  R  Q  
   P  O  N  M  L  K  J  
      I  H  G  F  E  
         D  C  B  
            A  
*/

import java.util.Scanner;

public class Q123 {
    public static void printPattern(int n) {
        int star = 2 * n - 1;
        int space = 0;
        int num = 64+n*n;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++) {
                System.out.printf("%-3s", "");
            }
            for (int j = 1; j <= star; j++) {
                System.out.printf("%-3c", (char)(num--));
            }
            star -= 2;
            space++;
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
