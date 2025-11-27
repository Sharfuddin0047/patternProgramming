/*
Enter the Number of n: 6
1 3 7 13 21 31 
*/

import java.util.Scanner;

public class Q227 {
    public static void printPattern(int n) {
        int num = 1;
        for(int i=1; i<=n; i++) {
            System.out.print(num+ " ");
            num = num + 2*i;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of n: ");
        int n = sc.nextInt();
        printPattern(n);
    }
}
