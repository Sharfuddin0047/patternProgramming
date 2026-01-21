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
Output: -1

https://leetcode.com/problems/majority-element/

*/

import java.util.HashMap;

public class Q66 {
     public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> h1 = new HashMap<>();
        for(int x:nums) {
            h1.put(x,h1.getOrDefault(x,0)+1);
        }

        for(Integer key:h1.keySet()) {
            if(h1.get(key)>nums.length/2) {
                return key;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println("Majority Element is: "+majorityElement(nums));
    }
}
