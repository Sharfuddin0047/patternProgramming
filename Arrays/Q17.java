/*WAJP to reverse 1st half and 2nd half elements
of array.
original array: {10,20,30,40,50,60,70}
Reversed Array: {40,30,20,10,70,60,50}
*/

import java.util.Arrays;

public class Q17 {
    public static String swapHalves(int[] nums) {
        int n=nums.length;
        int[] newNums = new int[n];
        int mid=0;
        if(n%2==0) {
            mid=n/2-1;
        } else {
            mid=n/2;
        }
        int e=n-1;
        int s=mid;
        
        for(int i=0; i<n; i++) {
            if(i<=mid) {
                newNums[i] = nums[s--];
            }
            if(i>mid) {
                newNums[i] = nums[e--];
            }
        }
        return Arrays.toString(newNums);
    }
    public static void main(String[] args) {
        int[] nums1 = {10,20,30,40,50,60,70};     // odd length
        int[] nums2 = {10,20,30,40,50,60,70,80};  // even length

        System.out.println("Odd length:  " + swapHalves(nums1));
        System.out.println("Even length: " + swapHalves(nums2));

    }
}
