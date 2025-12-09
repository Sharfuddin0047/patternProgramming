import java.util.Scanner;

/**
 * WAJP to take user input and check the number
is palindrome or not.
 */

public class Q10 {
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
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(isPalindrome(n)) {
            System.out.println(n+" is Palindrome");
        } else {
            System.out.println(n+" is NOT a Palindrome");
        }
        sc.close();
    }
}
