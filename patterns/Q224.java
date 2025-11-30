/*
Enter the Number of n: 9
0 1 1 2 3 5 8 13 21 
*/

import java.util.Scanner;

public class Q224 {
    public static void printPattern(int n) {
        int num = 0; 
        int num2 = 1;
        for(int i=1; i<=n; i++) {
            System.out.print(num+ " ");
            int temp = num +num2;
            num = num2;
            num2 = temp;
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of n: ");
        int n = sc.nextInt();
        printPattern(n);
    }
}
