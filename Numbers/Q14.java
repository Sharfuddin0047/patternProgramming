import java.util.Scanner;

/**
 * WAJP to take user input and print whether the
number is Strong number or not.

A Strong Number (also called a Factorial Sum Number) is a number in which the sum of the factorials of its digits equals the number itself.
Examples
- 145
- Digits: 1,4,5
- Factorials: 1!=1,4!=24,5!=120
- Sum = 1+24+120=145 → ✔ Strong Number

- 2
- Digits: 2
- Factorials: 2!=2
- Sum = 2 → ✔ Strong Number

- 123
- Digits: 1,2,3
- Factorials: 1!=1,2!=2,3!=6
- Sum = 9 ≠ 123 → ✘ Not a Strong Number

 */

public class Q14 {
    public static boolean isStrongNumber(int n) {
        int sum = 0; int num =n;
        while(n>0) {
            sum = sum + getFactorial(n%10);
            n/=10;
        }
        return sum == num;
    }

    public static int getFactorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for(int i=1; i<=n; i++) {
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(isStrongNumber(n)) {
            System.out.println(n+" is a Strong Number");
        } else {
            System.out.println(n+" is NOT a Strong Number");
        }
        sc.close();
    }
}
