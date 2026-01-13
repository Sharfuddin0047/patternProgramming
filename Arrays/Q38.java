/*WAJP to print and count all the palindrome
number elements from array. */

public class Q38 {
    public static void printPalindrome(int[] arr) {
        int count=0;
        for(int i=0; i<arr.length; i++) {
            if(isPalindrome(arr[i])) {
                count++;
                System.out.print(arr[i]+" ");
            }
        }
        System.out.print("\nTotal palindrome count: "+count);
    }
    public static boolean isPalindrome(int n) {
        String a=n+"";
        int y=a.length();
        for(int i=0; i<y/2; i++) {
            if(a.charAt(i) != a.charAt(y-i-1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        printPalindrome(arr);
    }
}
