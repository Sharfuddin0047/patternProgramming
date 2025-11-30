/*
Enter the Number of Rows: 5
A   B   C   D   E   
  A   B   C   D   
    A   B   C   
      A   B   
        A   
*/


import java.util.Scanner;

public class Q102 {
    public static void printPattern(int n) {
        int star = n; int space = 0; 
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++) {
                System.out.printf("%-2s","");
            }
            for(int j=1; j<=star; j++) {
                System.out.printf("%-4c", (char)(64+j));
            }
            star--; space ++;
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
