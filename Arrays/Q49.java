/*Kth Largest Element in an Array: */

import java.util.Arrays;
import java.util.Scanner;

public class Q49 {
    public static int getKthLargest(int[] nums, int k) {
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
        int count=0; int i;
        for(i=freq.length-1; i>=0; i--) {
            while(count<k && freq[i]>0) {
                count++;
                if(count==k){
                    return i+min;
                }
                freq[i]--;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term: ");
        int k = sc.nextInt();
        int[] nums = {1,23,34,34,56,47,23,43};
        System.out.println(getKthLargest(nums,k));
    }
}
