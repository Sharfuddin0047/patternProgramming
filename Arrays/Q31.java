/*WAJP to check whether a given array is in
sorted order or not.
i/p: [2, 7, 7, 8, 9]
o/p: Array is sorted */

public class Q31 {
    public static void isSorted(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i]>arr[i+1]) {
                System.out.println("Array is NOT sorted");
                return; 
            }
        }
        System.out.println("Array is sorted");
    }
    public static void main(String[] args) {
        int[] arr={2, 7, 7, 8, 9};
        isSorted(arr);
    }
}
