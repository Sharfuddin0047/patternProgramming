import java.util.Arrays;

public class Q75 {
    public static int[] countBits(int n) {
        int[] res=new int[n+1];
        for(int i=0; i<=n; i++) {
            res[i] = getSetBit(i);
        }
        return res;
    }

    public static int getSetBit(int n) {
        int count=0;
        while(n>0) {
            if(n%2==1) {
                count++;
            }
            n/=2;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] n = countBits(5);
        System.out.println(Arrays.toString(n));
    }
}
