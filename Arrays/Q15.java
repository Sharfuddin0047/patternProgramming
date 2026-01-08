/*
WAJP to swap two index values of the array.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Q15 {
    public static String swapElement(int[] nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
        return Arrays.toString(nums);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {10,20,30,40,50,60,70};
        System.out.println("Enter the value of idx1 from 0 and "+(nums.length-1));
        int idx1 = sc.nextInt();
        System.out.println("Enter the value of idx2 from 0 and "+(nums.length-1));
        int idx2 = sc.nextInt();
        if(idx1>=0 && idx1<nums.length && idx2>=0 && idx2<nums.length) {
            System.out.println("After swap: "+swapElement(nums, idx1, idx2));
        } else {
            System.out.println("Invalid index");
        }
        sc.close();
    }
}
