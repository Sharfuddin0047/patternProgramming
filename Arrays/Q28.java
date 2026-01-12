/*
WAJP find missing element from a given array
which has a missing element in a range of n.
N=7
i/p: [7, 4,3, 0, 5, 1, 6]
o/p: 2
*/

/*https://leetcode.com/problems/missing-number/ */

import java.util.Arrays;

public class Q28 {
    public static int findMissing(int[] arr, int n) {
        int sum = n*(n+1)/2;
        for(int i=0; i<arr.length; i++) {
            sum = sum-arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {7, 4,3, 0, 5, 1, 6};
        int n =7;
        System.out.println("Missing value: "+findMissing(arr,n));
    }
}
