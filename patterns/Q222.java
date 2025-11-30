/*
Enter the Number of n: 5
1 2 5 26 677 
*/

import java.util.Scanner;

public class Q222 {
    public static void printPattern(int n) {
        int num = 1; 
        for(int i=1; i<=n; i++) {
            System.out.print(num+ " ");
            num = (int) (1 + Math.pow(num, 2));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of n: ");
        int n = sc.nextInt();
        printPattern(n);
    }
}
