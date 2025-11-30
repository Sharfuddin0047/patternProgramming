/*
Enter the Number of Rows: 5
Q           P  
O  N     M  L
K  J  I  H  G
F  E     D  C
B           A
*/

import java.util.Scanner;

public class Q212 {
    public static void printPattern(int n) {
        int start = 1; int end = n; int mid = n/2+1; int num = 64+n*(n+1)/2+(n/2);
        for(int i=1; i<=n; i++) {
            
            for(int j=1; j<=n; j++) {
                if(j<=start || j>=end) {
                    System.out.printf("%-3c",(char)num--);
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
