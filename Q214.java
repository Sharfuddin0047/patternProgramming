/*
Enter the Number of Rows: 7
A                 A  
A  B           B  A
A  B  C     C  B  A
A  B  C  D  C  B  A
A  B  C     C  B  A
A  B           B  A
A                 A
*/

import java.util.Scanner;

public class Q214 {
    public static void printPattern(int n) {
        int start = 1; int end = n; int mid = n/2+1; 
        for(int i=1; i<=n; i++) {
            int num = 65;
            for(int j=1; j<=n; j++) {
                if(j<=start || j>=end) {
                    System.out.printf("%-3c",(char)num);
                } else {
                    System.out.printf("%-3s","");
                }
                if(j<mid) {
                    num++;
                } else {
                    num--;
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
