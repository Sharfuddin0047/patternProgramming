/*
Enter the Number of Rows: 7
1                 2  
3  4           5  6
7  8  9     10 11 12
13 14 15 16 17 18 19
20 21 22    23 24 25
26 27          28 29
30                31 
*/

import java.util.Scanner;

public class Q207 {
    public static void printPattern(int n) {
        int start = 1; int end = n; int mid = n/2+1;int num = 1;
        for(int i=1; i<=n; i++) {

            for(int j=1; j<=n; j++) {
                if(j<=start || j>=end) {
                    System.out.printf("%-3d",num++);
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
