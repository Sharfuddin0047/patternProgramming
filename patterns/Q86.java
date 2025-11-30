/*
Enter the Number of Rows: 
5
        Y 
      X W V 
    U T S R Q 
  P O N M L K J 
I H G F E D C B A 
*/


import java.util.Scanner;

public class Q86 {
    public static void printPattern(int n) {
        int space = n-1; int star = 1; int num = 64+n*n;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++) {
                System.out.print((char)num-- +" ");
            }

            star+=2; space--;
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
