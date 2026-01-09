/*
WAJP to rotate each element of an array by one
position in left side.
Original array: {10,20,30,40,50,60,70}
Rotated array: {20,30,40,50,60,70,10}
*/

import java.util.Arrays;

public class Q23 {
    public static String rotateLeft(int[] nums) {
        int n = nums.length;
        int left = nums[0];
        for(int i=0; i<n-1; i++) {
            nums[i] = nums[i+1];
        }
        nums[n-1] = left;
        return Arrays.toString(nums);
    }
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60,70};
        System.out.println("Rotated Array: "+rotateLeft(nums));
    }
}
