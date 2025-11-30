/*
Enter the Number of n: 7
1 3 7 15 31 63 127 
*/

import java.util.Scanner;

public class Q226 {
    public static void printPattern(int n) {
        int num = 1;
        for(int i=1; i<=n; i++) {
            System.out.print(num+ " ");
            num = (int) (num+Math.pow(2, i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of n: ");
        int n = sc.nextInt();
        printPattern(n);
    }
}
