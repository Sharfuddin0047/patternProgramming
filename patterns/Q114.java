/*
Enter the Number of Rows: 5
5  5  5  5  5  5  5  5  5  
   4  4  4  4  4  4  4  
      3  3  3  3  3  
         2  2  2  
            1  
*/


import java.util.Scanner;

public class Q114 {
    public static void printPattern(int n) {
        int star = 2*n-1; int space = 0; int num = n;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++) {
                System.out.printf("%-3s","");
            }
            for(int j=1; j<=star; j++) {
                System.out.printf("%-3d", num);
            }
            star-=2; space ++; num--;
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
