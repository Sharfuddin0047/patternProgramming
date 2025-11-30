/*
I  H  G  F  E  D  C  B  A  
   G  F  E  D  C  B  A  
      E  D  C  B  A  
         C  B  A  
            A
*/

import java.util.Scanner;

public class Q125 {
    public static void printPattern(int n) {
        int star = 2 * n - 1;
        int space = 0;
        for (int i = 1; i <= n; i++) {
            int num = 64+star;
            for (int j = 1; j <= space; j++) {
                System.out.printf("%-3s", "");
            }
            for (int j = 1; j <= star; j++) {
                System.out.printf("%-3c", (char)(num--));
            }
            star -= 2;
            space++; num--;;
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
