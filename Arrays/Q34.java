/*

For the given array of 0’s, 1’s and 2’s
Sort the elements(Without Sorting).
i/p: [0, 2, 0, 1, 2, 1, 0, 2]
o/p: [0, 0, 0, 1, 1, 2, 2, 2]
*/

import java.util.Arrays;

public class Q34 {
    public static void shiftZerosOnesTwos(int[] arr) {
        int zero=0,one=0;
        for(int x: arr) {
            if(x==0) {
                zero++;
            } else if(x==1) {
                one++;
            }
        }
        for(int i=0; i<arr.length; i++) {
            if(i<zero) {
                arr[i]=0;
            } else if(i>=zero && i<(zero+one)) {
                arr[i] = 1;
            } else {
                arr[i] = 2;
            }
        }
        System.out.println("Array: "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={0, 2, 0, 1, 2, 1, 0, 2};
        shiftZerosOnesTwos(arr);
    }
}
