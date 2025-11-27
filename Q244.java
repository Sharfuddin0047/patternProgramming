/*
Enter the Number of n: 5
1  10 11 20 21 
2  9  12 19 22 
3  8  13 18 23 
4  7  14 17 24 
5  6  15 16 25 
*/

import java.util.Scanner;

public class Q244 { 
    public static int getNumber(int i, int j, int n) {
        int num = 0;
        num = n*(j-1);
        if(j%2 == 1) {
            num = num +i;
        } else {
            num = num + n-i+1;
        }

        return num;
    }
    public static void printPattern(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n ;j++) {
                System.out.printf("%-3d", getNumber(i,j,n));
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
