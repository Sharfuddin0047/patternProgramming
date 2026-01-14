/*WAJP to store first n palindrome numbers into
array. */

import java.util.Arrays;
import java.util.Scanner;

public class Q42 {
    public static void storePalindrome(int n) {
        int[] arr=new int[n];
        int count=0; int i = 0; int j=0;
        while(count<n) {
            if(isPalindrome(i)) {
                count++;
                arr[j++]=i;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many palindrome numbers to store: ");
        int n = sc.nextInt();
        storePalindrome(n);
        sc.close();


    }
}
