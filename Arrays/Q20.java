/*
WAJP to rotate each element of an array by one
position in right side.
original array: {10,20,30,40,50,60,70}
rotated array: {70,10,20,30,40,50,60}
*/

import java.util.Arrays;

public class Q20 {
    public static String rotatedArray(int[] arr) {
        int n = arr.length;
        int temp = arr[n-1];
        for(int i=n-2; i>=0; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
        return Arrays.toString(arr);
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        System.out.println("Rotated Array: " + rotatedArray(arr));
    }
}
