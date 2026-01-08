/*
WAJP to check array is a palindromic array or
not. Return true or false accordingly.
original array: {10,20,30,40,30,20,10}
*/

public class Q18 {
    public static boolean isPalindrome(int[] nums) {
        for(int i=0; i<nums.length/2; i++) {
            if(nums[i] != nums[nums.length-i-1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,30,20,10};
        System.out.println(isPalindrome(nums));
    }
}
