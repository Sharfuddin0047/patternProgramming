import java.util.Scanner;

/**
 * WAJP to take user input and print nth
palindrome number.
 */

public class Q12 {
    public static int getPalindrome(int n) {
        int count = 0;
        int i = 1;
        while(count<n) {
            if(isPalindrome(i)) {
                count++;
            }
            i++;
        }
        return i-1;
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
        System.out.println("Enter the nth value: ");
        int n = sc.nextInt();
        System.out.println(n+"th palindrome is "+ getPalindrome(n));
        sc.close();
    }
}
