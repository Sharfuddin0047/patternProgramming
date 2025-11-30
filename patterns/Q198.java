/*
Enter the Number of Rows: 7
A  B  C  D  C  B  A  
   A  B  C  B  A  
      A  B  A  
         A  
      A  B  A  
   A  B  C  B  A  
A  B  C  D  C  B  A  
*/


import java.util.Scanner;

public class Q198 {
    public static void printPattern(int n) {
        int space = 0; int star = n; int mid = n/2+1; 
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space;j++) {
                System.out.printf("%-3s","");
            }
            int num = 65;
            int colMid = star/2+1;
            for(int j=1; j<=star; j++) {
                if(j<colMid) {
                    System.out.printf("%-3c",(char)num++);
                } else {
                    System.out.printf("%-3c",(char)num--);
                }
            }
            if(i<mid) {
                space++; star-=2; 
            } else {
                space--; star+=2; 
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
