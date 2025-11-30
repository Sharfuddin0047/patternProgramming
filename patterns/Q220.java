/*
Enter the Number of n: 9
2 5 11 23 47 95 191 383 767 
*/

import java.util.Scanner;

public class Q220 {
    public static void printPattern(int n) {
        int num = 2; 
        for(int i=1; i<=n; i++) {
            System.out.print(num+ " ");
            num = 2*num+1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of n: ");
        int n = sc.nextInt();
        printPattern(n);
    }
}
