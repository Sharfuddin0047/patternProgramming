/*
Enter the Number of Rows: 7
3  3  3  3  3  3  3  
   2  2  2  2  2  
      1  1  1  
         0  
      1  1  1  
   2  2  2  2  2  
3  3  3  3  3  3  3  
*/

import java.util.Scanner;

public class Q192 {
    public static void printPattern(int n) {
        int space = 0; int star = n; int mid = n/2+1; int num = mid-1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space;j++) {
                System.out.printf("%-3s","");
            }
            for(int j=1; j<=star; j++) {
                System.out.printf("%-3d",num);
            }
            if(i<mid) {
                space++; star-=2; num--;
            } else {
                space--; star+=2; num++;
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
