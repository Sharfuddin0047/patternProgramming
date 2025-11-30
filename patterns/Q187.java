/*
Enter the Number of Rows: 7
31 30 29 28 27 26 25 
   24 23 22 21 20
      19 18 17
         16
      15 14 13
   12 11 10 9  8  
7  6  5  4  3  2  1
*/

import java.util.Scanner;

public class Q187 {
    public static void printPattern(int n) {
        int space = 0; int star = n; int mid = n/2+1; int num = n*(n+1)/2+(n/2);
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space;j++) {
                System.out.printf("%-3s","");
            }
            for(int j=1; j<=star; j++) {
                System.out.printf("%-3d",num--);
            }
            if(i<mid) {
                space++; star-=2;
            } else {
                space--; star+=2;
            }
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
