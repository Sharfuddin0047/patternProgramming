/*
WAJP to rotate all the elements of array k
position to its right.
array[] = {1,2,3,4,5,6,7} ,
k=2
Output: {6, 7, 1, 2, 3, 4, 5}
*/

import java.util.Arrays;
import java.util.Scanner;

public class Q21 {
    public static String rotateKPosition(int[] arr, int k) {
       int n=arr.length;
       for(int i=0; i<k; i++) {
            int last = arr[n-1];
            for(int j=n-1; j>0; j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = last;
       }
        return Arrays.toString(arr);
    } 
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.println("Rotated Array: "+rotateKPosition(arr, k));
        sc.close();
    }
}
