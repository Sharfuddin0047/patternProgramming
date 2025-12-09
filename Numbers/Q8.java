import java.util.Scanner;

/**
 * WAJP to print all the alternate Prime numbers
up to a given range.
o/p:
2 5 11 17....
Or
3 7 13 19
 */

public class Q8 {
    public static void printAlternatePrime(int start, int end) {
        int count = 0;
        for(int i=start; i<=end; i++) {
            if(isPrime(i)) {
                count++;
                if(count%2 == 1) {
                    System.out.print(i+" ");
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n<2) {
            return false;
        }
        if(n == 2 || n == 3) {
            return true;
        }
        if(n%2==0) {
            return false;
        }
        for(int i=2; i*i<=n; i++) {
            if(n%i==0) {
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
        printAlternatePrime(start, end);
        sc.close();
    }
}
