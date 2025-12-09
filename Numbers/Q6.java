import java.util.Scanner;

/**
 * WAJP to print and count all the Prime numbers
up to a given range.
 */

public class Q6 {
    public static void printPrime(int start, int end) {
        int count = 0;
        for(int i=start; i<=end; i++) {
            if(isPrime(i)) {
                System.out.print(i+ " ");
                count++;
            }
        }
        if(count == 0){
            System.out.println("NO prime number exist in given range");
        }
        System.out.println("\nTotal prime numbers are: "+count);
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
        System.out.println("Enter the start value: ");
        int start = sc.nextInt();
        System.out.println("Enter the end value: ");
        int end = sc.nextInt();
        printPrime(start, end);
    }
}
