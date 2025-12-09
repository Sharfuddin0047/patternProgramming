import java.util.Scanner;

/**
 * WAJP to print and count all prime numbers in a
range where sum of digits is also prime
number.
 */

public class Q9 {
    public static void printDigitSumPrime(int start, int end) {
        for(int i=start; i<=end; i++) {
            if(isPrime(i) && isPrime(digitSum(i))) {
                System.out.print(i+ " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n<2) {
            return false;
        }
        if(n==2 || n==3) {
            return true;
        }
        if(n%2 == 0) {
            return false;
        }
        for(int i=2; i*i<=n; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int digitSum(int n) {
        int sum = 0;
        while(n>0) {
            sum = sum + n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start value: ");
        int start = sc.nextInt();
        System.out.println("Enter the end value: ");
        int end = sc.nextInt();
        printDigitSumPrime(start, end);
        sc.close();
    }
}
