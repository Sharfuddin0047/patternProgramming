/*WAJP to rotate all the elements of array k
position to its left.
array[] = {1, 2, 3, 4, 5, 6, 7}
k = 2
Output: {3, 4, 5, 6, 7, 1, 2} */

import java.util.Arrays;
import java.util.Scanner;

public class Q24 {
    public static String rotateKPositionLeft(int[] arr, int k) {
       int n=arr.length;
       for(int i=0; i<k; i++) {
            int begin = arr[0];
            for(int j=0; j<n-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[n-1] = begin;
       }
        return Arrays.toString(arr);
    } 
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.println("Rotated Array: "+rotateKPositionLeft(arr, k));
        sc.close();
    }
}
