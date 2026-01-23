/*https://leetcode.com/problems/find-all-lonely-numbers-in-the-array/description/ */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q72 {
    public static List<Integer> lonelyNumber(int[] nums) {
        HashMap<Integer,Integer> h1 = new HashMap<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int x:nums) {
            h1.put(x, h1.getOrDefault(x, 0)+1);
        }
        for(int x:h1.keySet()) {
            if(h1.get(x)==1 && !h1.containsKey(x-1) && !h1.containsKey(x+1)) {
                a1.add(x);
            }
        }
        return a1;
    }
    public static void main(String[] args) {
        int[] nums ={10,6,5,8};
        System.out.println("lonely numbers: "+lonelyNumber(nums));
        
    }
}
