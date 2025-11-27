/*
Enter the Number of n: 5
25 24 23 22 21 
14 15 16 17 18 
15 14 13 12 11 
4  5  6  7  8  
5  4  3  2  1  
*/

import java.util.Scanner;

public class Q243 {
    public static void printPattern(int n) {
        int num = n*n;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(i%2 == 1) {
                    System.out.printf("%-3d",num--);
                } else {
                    System.out.printf("%-3d",num++);
                }
            }
            if(i%2 == 1) {
                num = num - n-1;
            } else {
                num = num - n+1;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of n: ");
        int n = sc.nextInt();
        printPattern(n);
    }
}
