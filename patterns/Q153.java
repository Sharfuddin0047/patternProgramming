/*
Enter the Number of Rows: 7
         25 
      24 23 22
   21 20 19 18 17
16 15 14 13 12 11 10
   9  8  7  6  5  
      4  3  2
         1
*/

import java.util.Scanner;

public class Q153 {
    public static void printPattern(int n) {
        int space = n/2; int star = 1; int rowMid = n/2+1; int num = (rowMid+1)*(rowMid+1);
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++) {
                System.out.printf("%-3s","");
            }
            for(int j=1; j<=star; j++) {
                System.out.printf("%-3d",num--);
            }

            if(i<rowMid) {
                space--; star+=2; 
            } else {
                star-=2; space++; 
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
