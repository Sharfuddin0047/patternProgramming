/*
Enter the Number of Rows: 7
         Y  
      X  W  V  
   U  T  S  R  Q  
P  O  N  M  L  K  J  
   I  H  G  F  E  
      D  C  B  
         A  
*/

import java.util.Scanner;

public class Q176 {
     public static void printPattern(int n) {
        int space = n/2; int star = 1; int rowMid = n/2+1; int num = 64+(rowMid+1)*(rowMid+1);
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++) {
                System.out.printf("%-3s","");
            }
            
            for(int j=1; j<=star; j++) {
               System.out.printf("%-3c",(char)num--);
            }

            if(i<rowMid) {
                space--; star+=2; 
            } else {
                star-=2; space++; 
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
