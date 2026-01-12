/*WAJP to move all zeroes of an array to the end.
i/p: [7, 0, 2, 6, 0, 4]
o/p: [7, 2, 6, 4, 0, 0] */

import java.util.Arrays;

public class Q32 {
    public static void moveZeroes(int[] arr) {
        int idx=0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                arr[idx++] = arr[i];
            }
        }

        while(idx<arr.length) {
            arr[idx++]=0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 0, 2, 6, 0, 4};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

}