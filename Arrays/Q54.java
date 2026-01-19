/*WAJP to print all the elements of array exactly
once. */

public class Q54 {
    public static void getFreq(int[] nums) {
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
            if(freq[i]!=0) {
                System.out.print(i+min+ " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,23,34,34,56,47,23,43};
        getFreq(nums);
    }
}
