/*
Enter the Number of Rows: 7
      A   
    B   B
  C   C   C
D   D   D   D
  C   C   C   
    B   B
      A
*/

import java.util.Scanner;

public class Q143 {
    public static void printPattern(int n) {
        int space = n/2; int star = 1; int rowMid = n/2+1; int num = 65;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++) {
                System.out.printf("%-2s","");
            }
            for(int j=1; j<=star; j++) {
                System.out.printf("%-4c",(char)num);
            }

            if(i<rowMid) {
                space--; star++; num++;
            } else {
                star--; space++; num--;
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
