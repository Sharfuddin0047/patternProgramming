/*https://leetcode.com/problems/single-number-ii/ */

import java.util.HashMap;

public class Q71 {
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int x:nums) {
            h1.put(x, h1.getOrDefault(x, 0)+1);
        }
        for(int x:h1.keySet()) {
            if(h1.get(x)==1) {
                return x;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={1,2,1,3,2,5};
        System.out.println(singleNumber(nums)+" has come only once");
    }
}
