/*
Enter the number of rows: 
5
        E 
      D D 
    C C C 
  B B B B 
A A A A A 
 */


import java.util.Scanner;

public class Q47 {
    public static void printPattern(int n) {
        int star = 1; int space = n-1; int alpha = 64 + n;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++) {
                System.out.print((char)(alpha) +" ");
            }
            space--; star++; alpha--;
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
