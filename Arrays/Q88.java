import java.util.Arrays;

public class Q88 {
    public static int[] mergeTwoArray(int[] num1, int[] num2) {
        int[] merge = new int[num1.length + num2.length];
        int idx1=0,idx2=0,idxNew=0;
        while(idx1<num1.length && idx2<num2.length) {
            if(num1[idx1]<num2[idx2]) {
                merge[idxNew++] = num1[idx1++];
            } else {
                merge[idxNew++] = num2[idx2++];
            }
        }
        while(idx1<num1.length) {
            merge[idxNew++] = num1[idx1++];
        }

        while(idx2<num2.length) {
            merge[idxNew++] = num2[idx2++];
        }

        return merge;
    }

    public static void main(String[] args) {
        int[] num1 = {20, 30, 50, 60};
        int[] num2 = {20, 30, 50, 60};
        int[] res = mergeTwoArray(num1, num2);
        System.out.println("merged array: " + Arrays.toString(res));
    }
}
