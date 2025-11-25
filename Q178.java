/*
Enter the Number of Rows: 7
         D  
      C  C  C  
   B  B  B  B  B  
A  A  A  A  A  A  A  
   B  B  B  B  B  
      C  C  C  
         D  
*/

import java.util.Scanner;

public class Q178 {
    public static void printPattern(int n) {
        int space = n/2; int star = 1; int rowMid = n/2+1; int num = 64+rowMid;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++) {
                System.out.printf("%-3s","");
            }
            
            for(int j=1; j<=star; j++) {
               System.out.printf("%-3c",(char)num);
            }

            if(i<rowMid) {
                space--; star+=2; num--;
            } else {
                star-=2; space++; num++;
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
