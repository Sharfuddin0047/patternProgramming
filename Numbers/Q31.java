/*
binary to decimal
*/

import java.util.Scanner;

public class Q31 {
    public static int binToDec(int n) {
        int dec=0; int i=0;
        while(n>0) {
            dec = dec+n%10*(int)Math.pow(2,i);
            n/=10;
            i++;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        int n = sc.nextInt();
        System.out.println(n+" Decimal equivalent is: "+binToDec(n));
        sc.close();
    }
}
