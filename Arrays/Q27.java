/*WAJP to insert an element at certain position
of the array.
Original array: {10,20,30,40,50,60,70}
Updated array: {10,20,30,35,40,50,60,70}
*/

import java.util.Arrays;
import java.util.Scanner;

public class Q27 {
    public static void insertEle(int[] arr, int val, int pos) {
        int[] updArr=new int[arr.length+1];
        for(int i=0; i<pos; i++) {
            updArr[i]=arr[i];
        }

        updArr[pos]=val;

        for(int i=pos;i<arr.length;i++) {
            updArr[i+1]=arr[i];
        }

        System.out.println("updated Array: "+ Arrays.toString(updArr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] original = {10, 20, 30, 40, 50, 60, 70};
        System.out.println("Enter position: ");
        int pos = sc.nextInt();
        System.out.println("Enter the value: ");
        int val = sc.nextInt();
        insertEle(original, val, pos);
    }


}
