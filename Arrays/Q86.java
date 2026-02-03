import java.util.Arrays;

public class Q86 {
    public static int[] mergeTwoArray(int[] num1, int[] num2) {
        int[] merge=new int[num1.length+num2.length];
        int j=0;
        for(int i=0; i<num1.length; i++) {
            merge[j++] = num1[i];
        }

        for(int i=0; i<num2.length; i++) {
            merge[j++] = num2[i];
        }
        return merge;
    }
    public static void main(String[] args) {
        int[] num1 = {5,1,1,2,0,0};
        int[] num2 = {4,3,5,2,0,0};
        int[] res = mergeTwoArray(num1, num2);
        System.out.println("merged array: "+Arrays.toString(res));
    }
}
