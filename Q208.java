/*
Enter the Number of Rows: 7
31                30 
29 28          27 26 
25 24 23    22 21 20
19 18 17 16 15 14 13
12 11 10    9  8  7
6  5           4  3  
2                 1
*/

import java.util.Scanner;

public class Q208 {
    public static void printPattern(int n) {
        int start = 1; int end = n; int mid = n/2+1; int num = n*(n+1)/2+(n/2);
        for(int i=1; i<=n; i++) {

            for(int j=1; j<=n; j++) {
                if(j<=start || j>=end) {
                    System.out.printf("%-3d",num--);
                } else {
                    System.out.printf("%-3s","");
                }
            }
            if(i<mid) {
                start++; end--;
            } else {
                start--; end++;
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
