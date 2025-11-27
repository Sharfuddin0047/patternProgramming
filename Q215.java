/*
Enter the Number of n: 7
2 6 12 20 30 42 56 
*/

import java.util.Scanner;

public class Q215 {
    public static void printPattern(int n) {
        int num = 2; int gap = 4;
        for(int i=1; i<=n; i++) {
            System.out.print(num+ " ");
            num = num + gap;
            gap+=2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of n: ");
        int n = sc.nextInt();
        printPattern(n);
    }
}
