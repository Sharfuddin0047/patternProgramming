/*
Enter the Number of Rows: 5
        A 
      B C B 
    C D E D C 
  D E F G F E D 
E F G H I H G F E 
*/

import java.util.Scanner;

public class Q92 {
    public static void printPattern(int n) {
        int space = n-1; int star = 1; 
        for(int i=1; i<=n; i++) {
            int num = 64+i;
            for(int j=1; j<=space; j++) {
                System.out.print("  ");
            }
            int colMid = star/2+1;
            for(int j=1; j<=star; j++) {
                if(j<colMid)
                    System.out.print((char)num++ +" ");
                else 
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
