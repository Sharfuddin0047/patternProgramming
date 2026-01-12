/*WAJP to check if an array is strictly increasing.
i/p: [2, 3, 7, 8, 9]
o/p: Array is strictly increasing */

public class Q30 {
    public static void isStrictlyInc(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i]>arr[i+1]) {
                System.out.println("Array is NOT strictly increasing");
                return; 
            }
        }
        System.out.println("Array is strictly increasing");
    }
    public static void main(String[] args) {
        int[] arr={2, 3, 7, 8, 9};
        isStrictlyInc(arr);
    }
}
