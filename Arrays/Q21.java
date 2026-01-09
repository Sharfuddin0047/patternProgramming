/*
WAJP to rotate all the elements of array k
position to its right.
array[] = {1,2,3,4,5,6,7} ,
k=2
Output: {6, 7, 1, 2, 3, 4, 5}
*/

import java.util.Arrays;

public class Q21 {
    public static String rotateKPosition(int[] arr, int k) {
        int n = arr.length; int[] temp = new int[k]; int j=0;
        for(int i=n-k;i<n; i++) { // To secure the values
            temp[j++] = arr[i];
        }
        
        for(int i=n-k-1; i>=0; i--) { //to swap
            arr[i+2]=arr[i];
        }

        for(int i=0; i<k; i++) { // To put values back
            arr[i] = temp[i];
        }
        return Arrays.toString(arr);
    } 
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k=2;
        System.out.println("Rotated Array: "+rotateKPosition(arr, k));
    }
}
