import java.util.Arrays;

public class Q76 {
    public static int[] evenOddBit(int n) {
        int[] res= new int[2];
        StringBuilder sb = new StringBuilder();

        while(n > 0){
            sb.append(n % 2);
            n = n / 2;
        }

        for(int i=0; i<sb.length();i++) {
            if(sb.charAt(i)=='1') {
                if(i%2 == 0)
                    res[0]++;
                else
                    res[1]++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] n = evenOddBit(5);
        System.out.println(Arrays.toString(n));
    }
}
