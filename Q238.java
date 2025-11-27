/*
Enter the Number of n: 7
      A 
    B   B
  C       C
D           D
  C       C
    B   B
      A
*/

import java.util.Scanner;

public class Q238 {
    public static void printPattern(int n) {
        int start=n/2+1; int end = n/2+1; int num = 65;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=end; j++) {
                if(j == start || j == end) {
                    System.out.print((char)num+" ");
                } else {
                    System.out.print("  ");
                }
            }
            if(i<n/2+1) {
                start--; end++; num++;
            } else {
                start++; end--; num--;
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
