/*Majority Element
The majority element in an array is defined as the element that appears more than ⌊n/2⌋ times,
where n is the length of the array.
In other words, it is the element that occurs most frequently and makes up more than half of
the array.
Given an array of integers, the task is to find the majority element and return it. If there is no
majority element, return -1.
Example 1:
Input: [3, 3, 4, 2, 4, 4, 2, 4, 4]
Output: 4
Example 3:
Input: [1, 2, 3, 4, 5]
Output: -1 */

public class Q66 {
     public static int majorityElement(int[] nums) {
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
            if(freq[i]>nums.length/2) {
                return i+min;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println("Majority Element is: "+majorityElement(nums));
    }
}
