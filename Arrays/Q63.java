/*WAJP to print the smaller element and its
frequency which has appeared for the
maximum time in the array if more than one
elements have maximum frequency. */

public class Q63 {
    public static void maxOccurence(int[] nums) {
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
        System.out.println(min+maxFreq+" comes "+freq[maxFreq]+" times");
    }
    public static void main(String[] args) {
        int[] nums = {1,34,23,34,56,47,47,23,43,43,56};
        maxOccurence(nums);
    }
}
