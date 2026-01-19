/*WAJP to check whether all elements in array
are unique or not? */

public class Q52 {
    public static boolean getFreq(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int x:nums) {
            if(max<x){
                max=x;
            } else if(min > x) {
                min = x;
            }
        }

        int[] freq = new int[max-min+1];
        for(int x: nums) {
            freq[x-min]++;
        }
        for(int i=0; i<freq.length; i++) {
            if(freq[i]>1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {1,23,34,34,56,47,23,43};
        System.out.println(getFreq(nums));
    }
}
