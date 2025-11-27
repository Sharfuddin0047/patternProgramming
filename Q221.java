/*
Enter the Number of n: 5
3 5 9 17 33 
*/

import java.util.Scanner;

public class Q221 {
    public static void printPattern(int n) {
        int num = 3; 
        for(int i=1; i<=n; i++) {
            System.out.print(num+ " ");
            num = (int) (num + Math.pow(2, i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of n: ");
        int n = sc.nextInt();
        printPattern(n);
    }
}
