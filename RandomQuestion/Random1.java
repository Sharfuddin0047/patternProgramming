package RandomQuestion;

/**
Enter the value of n:
4
    *
   * *
  * * *
 * * * *



 eeeeeee
   @ @
   @ @
   @ @
   @ @
 */
import java.util.Scanner;

public class Random1 {
    public static void printPattern(int n) {
        int space = n;
        int star = 1;

        for (int i = 1; i <= 2 * n; i++) {
            if (i <= n) {
                for (int j = 1; j <= space; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= star; j++) {
                    System.out.print("* ");
                }
            }
            if (i > n) {
                for (int j = 1; j <= 2 * n; j++) {
                    if (i == 2 * n && j > 1 && j <= 2 * n) {
                        System.out.print("e");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            space--;
            star++;
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j == n || j == ((2 * n + 1)- (n-1))) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of n:");
       int n = sc.nextInt();
       printPattern(n);
       sc.close();
    }
}
