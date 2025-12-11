/*
decimal to octal
*/

import java.util.Scanner;

public class Q32 {
    public static String toOct(int n) {
        String oct = "";

        while(n>0) {
            oct = n%8+oct;
            n/=8;
        }
        return oct;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal number:");
        int n = sc.nextInt();
        System.out.println(n+" octal equivalent is "+toOct(n));
        sc.close();
    }
}
