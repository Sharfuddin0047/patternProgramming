/*
Enter the Number of Rows: 5
E   D   C   B   A   
  D   C   B   A   
    C   B   A   
      B   A   
        A  
*/


import java.util.Scanner;

public class Q106 {
    public static void printPattern(int n) {
        int star = n; int space = 0; 
        for(int i=1; i<=n; i++) {
            int num = 65+n-i;
            for(int j=1; j<=space; j++) {
                System.out.printf("%-2s","");
            }
            for(int j=1; j<=star; j++) {
                System.out.printf("%-4c", (char)(num--));
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
