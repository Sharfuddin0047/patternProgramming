/*
WAJP to remove an element from the certain
position of the array.

Original array: {10,20,30,40,50,60,70}
Updated array: {10,20,40,50,60,70}
*/

import java.util.Arrays;
import java.util.Scanner;

public class Q26 {
    public static int removeEleAtIdx(int[] nums, int n) {
        int temp = nums[n];
        int [] arr=new int[nums.length-1];
        int j=0;
        for(int i=0; i<nums.length; i++) {
            if(i != n) {
                arr[j++] = nums[i];
            }
        }
        System.out.println("updated Array: "+Arrays.toString(arr));
        return temp;
    }

    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60,70};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index value: ");
        int n = sc.nextInt();
        System.out.println("removed element: "+removeEleAtIdx(nums, n));
    }
}
