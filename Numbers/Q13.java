import java.util.Scanner;

/**
 * WAJP to print and count all the palindrome
numbers in a range which is also a prime
number.
 */

public class Q13 {
    public static void printPalindrome(int start, int end) {
        int count = 0;
        for(int i=start; i<=end; i++) {
            if(isPalindrome(i)) {
                System.out.print(i+ " ");
                count++;
            }
        }
        System.out.println("\nTotal palindrome in given rangee are: "+count);
    }
    public static boolean isPalindrome(int n) {
        int num = n; int rev = 0;
        while(n>0) {
            rev = rev*10 + n%10;
            n/=10;
        }
        return rev == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start value: ");
        int start = sc.nextInt();
        System.out.println("Enter the end value: ");
        int end = sc.nextInt();
        printPalindrome(start,end);
        sc.close();
    }
}
