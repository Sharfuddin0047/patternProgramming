/*WAJP to move all zeroes of an array to the end.
i/p: [7, 0, 2, 6, 0, 4]
o/p: [7, 2, 6, 4, 0, 0] */

import java.util.Arrays;

public class Q32 {
    public static int[] moveZeroes(int[] arr) {
        int[] newArr = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {7, 0, 2, 6, 0, 4};
        int[] result = moveZeroes(arr);
        System.out.println(Arrays.toString(result));
    }
}