/*
Enter the Number of Rows: 7
1                 2  
1  2           3  4
1  2  3     4  5  6
1  2  3  4  5  6  7
1  2  3     4  5  6  
1  2           3  4
1                 2
*/

import java.util.Scanner;

public class Q205 {
    public static void printPattern(int n) {
        int start = 1; int end = n; int mid = n/2+1;
        for(int i=1; i<=n; i++) {
            int num = 1;
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
