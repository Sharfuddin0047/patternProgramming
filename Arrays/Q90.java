/*WAJP to sort the array elements in ascending
order by implementing Merge sort algorithm */

import java.util.Arrays;

public class Q90 {
    public static void mergeSort(int[] nums, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(nums, start, mid);
            mergeSort(nums, mid + 1, end);
            merge(nums, start, mid, end);
        }
    }

    public static void merge(int[] nums, int start, int mid, int end) {
        int[] newArr = new int[end - start + 1];
        int idx1 = start, idx2 = mid+1, idx = 0;
        while (idx1 <= mid && idx2 <= end) {
            if (nums[idx1] > nums[idx2]) {
                newArr[idx++] = nums[idx2++];
            } else {
                newArr[idx++] = nums[idx1++];
            }
        }

        while (idx1 <= mid) {
            newArr[idx++] = nums[idx1++];
        }

        while (idx2 <= end) {
            newArr[idx++] = nums[idx2++];
        }

        for(int i=0,j=start; i<newArr.length; i++,j++) {
            nums[j] = newArr[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 1, 5, 6};
        System.out.println("Original array: " + Arrays.toString(nums));

        mergeSort(nums, 0, nums.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(nums));

    }
}
