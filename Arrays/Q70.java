/*https://leetcode.com/problems/single-number-iii/ */

import java.util.Arrays;
import java.util.HashMap;

public class Q70 {
    public static int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> h1 = new HashMap<>();
        for(int x:nums) {
            h1.put(x,h1.getOrDefault(x,0)+1);
        }
        int[] unique = new int[2];
        int j=0;
        for(int x: h1.keySet()) {
            if(h1.get(x)==1) {
                unique[j++]=x;
            }
        }
        return unique;
    }
    public static void main(String[] args) {
        int[] nums={1,2,1,3,2,5};
        System.out.println(Arrays.toString(singleNumber(nums)));
    }
}
