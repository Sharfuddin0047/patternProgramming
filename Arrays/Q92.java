/*WAJP to sort the array elements in ascending
order by implementing Quick sort algorithm */

import java.util.Arrays;

public class Q92 {
    public static void quickSort(int[] a, int low, int high) {
        if(low<high) {
            int pi = partition(a,low,high);
            quickSort(a,low,pi-1);
            quickSort(a, pi+1, high);
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp= a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int partition(int[] a,int low, int high) {
        int pivot=a[high];
        int i = low-1;
        for(int j=low; j<high; j++) {
            if(a[j]<=pivot) {
                i++;
            swap(a,i,j);
            }
        }
        swap(a, i+1, high);
        return i+1;
    }
    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 1, 5, 6};
        System.out.println("Original array: " + Arrays.toString(nums));
        quickSort(nums, 0, nums.length-1);
        System.out.println("Sorted array: " + Arrays.toString(nums));
    }
}
