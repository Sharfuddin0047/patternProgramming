/*
WAJP find missing element from a given array
which has a missing element in a range of n.
N=7
i/p: [7, 4,3, 0, 5, 1, 6]
o/p: 2
*/

import java.util.Arrays;

public class Q28 {
    public static int findMissing(int[] arr) {
        Arrays.sort(arr);
        int i=0;
        while(i == arr[i]) {
            i++;
        }
        return i;
    }
    public static void main(String[] args) {
        int[] arr = {7, 4,3, 0, 5, 1, 6};
        System.out.println("Missing value: "+findMissing(arr));
    }
}
