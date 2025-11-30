/*
Enter the Number of n: 9
0 0 1 1 2 4 7 13 24 
*/

import java.util.Scanner;

public class Q225 {
    public static void printPattern(int n) {
        int num = 0; 
        int num2 = 0;
        int num3 = 1;
        for(int i=1; i<=n; i++) {
            System.out.print(num+ " ");
            int temp = num + num2 +num3;
            num = num2;
            num2 = num3;
            num3 = temp;
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of n: ");
        int n = sc.nextInt();
        printPattern(n);
    }
}
