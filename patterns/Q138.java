/*
Enter the Number of Rows: 7
      7   
    6   6   
  5   5   5   
4   4   4   4   
  3   3   3   
    2   2   
      1   
*/

import java.util.Scanner;

public class Q138 {
    public static void printPattern(int n) {
        int space = n/2; int star = 1; int rowMid = n/2+1; int num = n;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++) {
                System.out.printf("%-2s","");
            }
            for(int j=1; j<=star; j++) {
                System.out.printf("%-4d",num);
            }

            if(i<rowMid) {
                space--; star++; 
            } else {
                star--; space++; 
            }
            num--;
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
