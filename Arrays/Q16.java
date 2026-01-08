/*WAJP to reverse each element of the array. */

import java.util.Arrays;

public class Q16 {
    public static String reverse(int[] nums) {
        for(int i=0 ;i<nums.length/2; i++) {
            int temp = nums[i];
        nums[i] = nums[nums.length-i-1];
        nums[nums.length-i-1] = temp;
        }
        return Arrays.toString(nums);
    }
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60,70};
        System.out.println("reverse is: "+reverse(nums));
    }
}
