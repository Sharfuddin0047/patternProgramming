/*WAJP for below requirements:
original array: {2,5,4,3,6}
resultant array: {360,144,180,240,120}
 */

public class Q10 {
    public static void main(String[] args) {
        int[] arr={2,5,4,3,6};
        int[] ans=new int[arr.length];
        int mul = 1;
        for(int x:arr) {
            mul *= x;
        }

        for(int i=0; i<arr.length; i++) {
            ans[i] = mul/arr[i];
        }
        for(int x: ans) {
            System.out.print(x+" ");
        }
    }
}
