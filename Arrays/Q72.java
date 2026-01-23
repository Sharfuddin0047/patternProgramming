import java.util.ArrayList;
import java.util.List;

public class Q72 {
    public static List<Integer> lonelyNumber(int[] nums) {
        int min=nums[0];
        int max=nums[0];

        for(int x:nums) {
            if(x>max)
                max=x;
            else if(x<min)
                min=x;
        }

        int[] freq=new int[max-min+1];
        for(int x:nums) {
            freq[x-min]++;
        }
        ArrayList<Integer> newFreq=new ArrayList<>();
        for(int i=0; i<freq.length; i++) {
            int mi=i-1;
            int ma=i+1;
            if(freq[i]==1 && (mi<0 || freq[mi]==0) && (ma==freq.length || freq[ma]==0)) {
                newFreq.add(i+min);
            }
        }
        return newFreq;
    }
    public static void main(String[] args) {
        int[] nums ={10,6,5,8};
        System.out.println("lonely numbers: "+lonelyNumber(nums));
        
    }
}
