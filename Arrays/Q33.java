/*
WAJP the shift all 0’s to left and all 1’s to the
right(Without Sorting).
i/p: [0, 1, 1, 0, 0, 1, 0, 0]
o/p: [0, 0, 0, 0, 0, 1, 1, 1]
*/

public class Q33 {
    public static void swap(int[] arr) {
        int[] newArr=new int[arr.length];
        int idx=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) {
                idx++;
            }
        }
        while(idx<arr.length){
            newArr[idx++] = 1;
        }

        for(int x: newArr) {
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 0, 1, 0, 0};
        swap(arr);
    }
}
