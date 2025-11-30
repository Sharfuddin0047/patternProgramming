/*
Enter the number of rows: 
5
        A 
      B A
    C B A
  D C B A
E D C B A
 */


import java.util.Scanner;

public class Q48 {
    public static void printPattern(int n) {
        int star = 1; int space = n-1; 
        for(int i=1; i<=n; i++) {
            int alpha = 64 + i;
            for(int j=1; j<=space; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++) {
                System.out.print((char)(alpha--) +" ");
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
