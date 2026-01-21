/*Design a method to return the index of the first
non-repeating element in an array otherwise
return -1 if no such element is found. */

public class Q65 {
    public static int firstNonRepeating(int[] nums) {
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
            if(freq[i]==1) {
                return i+min;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,23,34,34,56,47,23,43};
        System.out.println("first non repeating "+ firstNonRepeating(nums));
    }
}
