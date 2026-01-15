/*WAJP to develop frequency array for the given
array. */

import java.util.Arrays;

public class Q48 {
    public static int[] freqArr(int[] arr) {
        int max=arr[0];
        int min=arr[0];
        for(int x:arr) {
            if(x>max) {
                max=x;
            } else if (x<min) {
                min=x;
            }
        }
        int[] freq=new int[max-min+1];
        for(int i=0; i<arr.length; i++) {
            freq[arr[i]-min]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        int[] arr= {80, 80, 43, 50, 38, 63, 58, 80};
        int[] result=freqArr(arr);
        System.out.println("Frequency array: "+Arrays.toString(result));
    }
}
