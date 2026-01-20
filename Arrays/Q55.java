/*WAJP to remove all the duplicate elements
from array. */

import java.util.Arrays;
import java.util.HashSet;

public class Q55 {
    public static int[] removeDuplicate(int[] nums) {
        int min=nums[0];
        int max=nums[0];

        for(int x:nums) {
            if(x>max)
                max=x;
            else if(x<min)
                min=x;
        }

        int[] freq=new int[max-min+1];
        for(int x:nums) {
            freq[x-min]++;
        }
        Arrays.fill(nums,0);
        int j=0;
        for(int i=0; i<freq.length; i++) {
            if(freq[i] > 0) {
                nums[j++]=i+min;
            }
        }
        return Arrays.copyOf(nums, j);
    }
    public static void main(String[] args) {
        int[] nums = {1,23,34,34,56,47,23,43};
        System.out.println("unique element: "+Arrays.toString(removeDuplicate(nums)));
    }
}
