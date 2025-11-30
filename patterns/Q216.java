/*
Enter the Number of rows: 5
2   
6   12  
20  30  42  
56  72  90  110 
132 156 182 210 240 
*/

import java.util.Scanner;

public class Q216 {
    public static void printPattern(int n) {
        int num = 2; int gap = 4; int star =1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=star; j++) {
                System.out.printf("%-4d",num);
                num = num + gap;
                gap+=2;
            }
            star++;
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of rows: ");
        int n = sc.nextInt();
        printPattern(n);
    }
}
