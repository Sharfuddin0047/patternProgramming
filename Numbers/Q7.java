import java.util.Scanner;

/**
 * WAJP to take user input and print nth prime
number.
 */

public class Q7 {
    public static int nthPrime(int n) {
        int count = 0;
        int i=1;
        while(count<n) {
            if(isPrime(i)) {
                count++;
            }
            i++;
        }
        return i-1;
    }

    public static boolean isPrime(int i) {
        if(i<2) {
            return false;
        }
        if(i == 2 || i == 3) {
            return true;
        }
        if(i%2==0) {
            return false;
        }
        for(int j=2; j*j<=i; j++ ) {
            if(i%j==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth value: ");
        int n = sc.nextInt();
        System.out.println("nth prime number: "+nthPrime(n));
        sc.close();
    }
}
