/*
Enter the number of rows: 
7
            1 
          2 2 
        3 3 3 
      4 4 4 4 
    5 5 5 5 5 
  6 6 6 6 6 6 
7 7 7 7 7 7 7 
 */

import java.util.Scanner;

class Q33 {
    public static void printPattern(int n) {
        int star = 1; int space = n-1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++) {
                System.out.print(i+" ");
            }
            space--; star++;
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