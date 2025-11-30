/*
Enter the Number of Rows: 7
* * * * * * * 
  * * * * * 
    * * * 
      * 
    * * * 
  * * * * * 
* * * * * * * 
*/

import java.util.Scanner;

public class Q181 {
    public static void printPattern(int n) {
        int space = 0; int star = n; int mid = n/2+1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space;j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++) {
                System.out.print("* ");
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
