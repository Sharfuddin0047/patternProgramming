
/*
convert decimal to binary
*/

import java.util.Scanner;

public class Q30 {
    public static String toBinary(int n) {
        String bin = "";

        while(n>0) {
            bin = n%2+bin;
            n/=2;
        }
        return bin;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal number:");
        int n = sc.nextInt();
        System.out.println(n+" binary equivalent is "+toBinary(n));
        sc.close();
    }
}
