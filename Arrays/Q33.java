/*
WAJP the shift all 0’s to left and all 1’s to the
right(Without Sorting).
i/p: [0, 1, 1, 0, 0, 1, 0, 0]
o/p: [0, 0, 0, 0, 0, 1, 1, 1]
*/

import java.util.Arrays;

public class Q33 {
    public static void shiftZeroesOnes(int[] arr) {
        int zeroCount=0;
        for(int x: arr) {
            if(x==0) {
                zeroCount++;
            }
        }
        for(int i=0; i<arr.length; i++) {
            if(i<zeroCount) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        System.out.println("updated Arrays: "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 0, 1, 0, 0};
        shiftZeroesOnes(arr);
    }
}
