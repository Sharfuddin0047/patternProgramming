/*
WAJP to print Second biggest element of the
array.
int[] a= {80, 80, 43, 50, 38, 63, 58, 80};
o/p
63 */

import java.util.Arrays;

public class Q45 {
    public static int getSecondMax(int[] a) {
        Arrays.sort(a);
        int first=a[0], second=Integer.MIN_VALUE;
        if(a.length<2) {
            return a[0];
        }
        for(int i=1; i<a.length; i++) {
            if(a[i]>first) {
                second = first;
                first = a[i];
            }
        }
        return second;
    }
    public static void main(String[] args) {
        int[] a= {80, 80, 43, 50, 38, 63, 58, 80};
        System.out.println("Second Biggest is :"+getSecondMax(a));
    }
}
