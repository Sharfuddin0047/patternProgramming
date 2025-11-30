/*
Enter the Number of Rows: 5
A  B  C  D  E  D  C  B  A  
   A  B  C  D  C  B  A
      A  B  C  B  A
         A  B  A
            A
*/


import java.util.Scanner;

public class Q127 {
     public static void printPattern(int n) {
        int star = 2*n-1; int space = 0; int num = 65;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++) {
                System.out.printf("%-3s","");
            }
            int colMid = star/2+1;
            for(int j=1; j<=star; j++) {
                if(j<colMid)
                    System.out.printf("%-3c", (char)num++);
                else
                    System.out.printf("%-3c", (char)num--);
            }
            star-=2; space ++; num++;
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
