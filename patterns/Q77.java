/*
Enter the number of rows: 
5
              5
           5  4  3
        5  4  3  2  1
     5  4  3  2  1  2  3
  5  4  3  2  1  2  3  4  5
 */

import java.util.Scanner;

public class Q77 {
    public static void printPattern(int n) {
        int star = 1; int space = n - 1; 
        for (int i = 1; i <= n; i++) {
            int num = n;
            for (int j = 1; j <= space; j++) {
                System.out.printf("%3s", "");  
            }
        
            for (int j = 1; j <= star; j++) {
                if (j < n) {
                    System.out.printf("%3d", num--);
                } else {
                    System.out.printf("%3d", num++);
                }
            }
            
            star += 2; space--; 
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
