/*
Enter the Number of Rows: 5
E   E   E   E   E   
  D   D   D   D   
    C   C   C   
      B   B   
        A   
*/


import java.util.Scanner;

public class Q105 {
    public static void printPattern(int n) {
        int star = n; int space = 0; int num = 64+n;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++) {
                System.out.printf("%-2s","");
            }
            for(int j=1; j<=star; j++) {
                System.out.printf("%-4c", (char)(num));
            }
            star--; space ++; num--;
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
