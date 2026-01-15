/*
WAJP to print Second biggest element of the
array.
int[] a= {80, 80, 43, 50, 38, 63, 58, 80};
o/p
63 */

import java.util.Arrays;

public class Q45 {
    public static int getSecondMax(int[] a) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int x: a) {
            if(x>first) {
                second = first;
                first = x;
            } else if (x>second && x<first) {
                second = x;
            }
        }

        if(second == Integer.MIN_VALUE) {
            return -1;
        }
        return second;
    }
    public static void main(String[] args) {
        int[] a= {80, 80, 43, 50, 38, 63, 58, 80};
        System.out.println("Second Biggest is :"+getSecondMax(a));
    }
}
