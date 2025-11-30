/*
Enter the Number of Rows: 7
         0  
      1  0  1  
   2  1  0  1  2  
3  2  1  0  1  2  3  
   2  1  0  1  2  
      1  0  1  
         0  
*/

import java.util.Scanner;

public class Q160 {
    public static void printPattern(int n) {
        int space = n/2; int star = 1; int rowMid = n/2+1; int num = 0;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++) {
                System.out.printf("%-3s","");
            }
            int colMid = star/2+1;
            for(int j=1; j<=star; j++) {
                if(j<colMid) {
                    System.out.printf("%-3d",num--);
                } else {
                    System.out.printf("%-3d",num++);
                }
            }

            if(i<rowMid) {
                space--; star+=2; 
            } else {
                star-=2; space++; num-=2;
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
