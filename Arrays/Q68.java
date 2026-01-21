/*WAJP to print true if all the elements in the
array are unique otherwise false. */

public class Q68 {
    public static boolean containsDuplicate(int[] nums) {
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

        for(int i=0; i<freq.length; i++) {
            if(freq[i]>1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,23,34,34,56,47,23,43};
        if(containsDuplicate(nums)) {
            System.out.println("does not contain duplicate");
        } else {
            System.out.println("contains duplicate elements");
        }
    }
}
