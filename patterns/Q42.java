/*
Enter the number of rows: 
5
                                15
                        13      14
                10      11      12
        6       7       8       9
1       2       3       4       5
 */

import java.util.Scanner;

public class Q42 {
    public static void printPattern(int n) {
        int star = 1; int space = n-1; int num = n*(n+1)/2;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++) {
                System.out.print("\t");
            }
            for(int j=1; j<=star; j++) {
                System.out.print(num++ +"\t");
            }
            space--; star++; num = num - (2*i+1);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        printPattern(n);
    }
}
