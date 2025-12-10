
/*
 What is a Happy Number?
A Happy Number is defined as:
- Take a positive integer.
- Replace the number by the sum of the squares of its digits.
- Repeat the process until:
- The number becomes 1 → then it’s a Happy Number ✅
- Or it loops endlessly in a cycle that does not include 1 → then it’s NOT a Happy Number ❌

✨ Examples
- 19
1^2+9^2=1+81=82
8^2+2^2=64+4=68
6^2+8^2=36+64=100
1^2+0^2+0^2=1 → ✅ Happy Number

- 20
2^2+0^2=4
4^2=16
1^2+6^2=1+36=37
… eventually loops without reaching 1 → ❌ Not Happy

*/

import java.util.Scanner;

public class Q20 {
    public static boolean isHappyNumber(int n) {
        while(n>9) {
            int sum = 0;
            while(n>0) {
                sum = sum + (int)Math.pow(n%10, 2);
                n/=10;
            }
            n = sum;
        }
        return n==1 || n==7;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        if(isHappyNumber(n)) {
            System.out.println(n+" is a Happy Number");
        } else {
            System.out.println(n+" is a NOT a Happy Number");
        }
        sc.close();
    }
}
