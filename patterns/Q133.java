/*
Enter the Number of Rows: 7
      1   
    1   2   
  1   2   3   
1   2   3   4   
  1   2   3   
    1   2   
      1  
*/

import java.util.Scanner;

public class Q133 {
    public static void printPattern(int n) {
        int star = 1; int rowMid = n/2+1; int space = n/2;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++) {
                System.out.printf("%-2s", "");
            }
            for(int j=1; j<=star; j++){
                System.out.printf("%-4d", j);
            }

            if(i<rowMid) {
                star++; space--;
            } else {
                star--; space++;
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
