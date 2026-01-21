/*WAJP to return the element which has highest
frequency in the array. */

public class Q62 {
    public static int maxOccurence(int[] nums) {
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

        int maxFreq=0;
        for(int i=0; i<freq.length; i++) {
            if(freq[i] > freq[maxFreq]) {
                maxFreq=i;
            }
        }
        return maxFreq+min;
    }
    public static void main(String[] args) {
        int[] nums = {1,23,34,34,56,47,47,23,43,43,56};
        System.out.println(maxOccurence(nums)+" has come maximum times");
    }
}
