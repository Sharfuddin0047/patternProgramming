/*
Enter the Number of n: 9
1 2 6 7 21 22 66 67 201 
*/

import java.util.Scanner;

public class Q223 {
    public static void printPattern(int n) {
        int num = 1; 
        for(int i=1; i<=n; i++) {
            System.out.print(num+ " ");
            if(i%2 == 1) {
                num = num+1;
            } else {
                num = 3*num;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of n: ");
        int n = sc.nextInt();
        printPattern(n);
    }
}
