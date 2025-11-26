/*
Enter the Number of Rows: 7
1  2  3  4  5  6  7  
   8  9  10 11 12 
      13 14 15 
         16 
      17 18 19 
   20 21 22 23 24 
25 26 27 28 29 30 31 
*/

import java.util.Scanner;

public class Q186 {
    public static void printPattern(int n) {
        int space = 0; int star = n; int mid = n/2+1; int num = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space;j++) {
                System.out.printf("%-3s","");
            }
            for(int j=1; j<=star; j++) {
                System.out.printf("%-3d",num++);
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
