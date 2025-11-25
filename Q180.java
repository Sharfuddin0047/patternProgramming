/*
Enter the Number of Rows: 7
         A  
      B  A  B
   C  B  A  B  C
D  C  B  A  B  C  D
   C  B  A  B  C
      B  A  B
         A
*/

import java.util.Scanner;

public class Q180 {
     public static void printPattern(int n) {
        int space = n/2; int star = 1; int rowMid = n/2+1;  int num = 65;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++) {
                System.out.printf("%-3s","");
            }
            int colMid = star/2+1;
            for(int j=1; j<=star; j++) {
                if(j<colMid) {
                    System.out.printf("%-3c",(char)num--);
                } else {
                    System.out.printf("%-3c",(char)num++);
                }
            }

            if(i<rowMid) {
                space--; star+=2; 
            } else {
                star-=2; space++; num -=2;
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
