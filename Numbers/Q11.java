import java.util.Scanner;

public class Q11 {
    public static void printPalindrome(int start, int end) {
        for(int i=start; i<=end; i++) {
            if(isPalindrome(i)) {
                System.out.print(i+ " ");
            }
        }
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
