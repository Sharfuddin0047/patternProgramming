/*https://leetcode.com/problems/single-number/submissions/1892246383/ */

public class Q69 {
    public static int singleNumber(int[] nums) {
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

        for(int i=0; i<freq.length; i++) {
            if(freq[i]==1) {
                return i+min;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums ={4,1,2,1,2};
        System.out.println(singleNumber(nums)+" comes only once");
    }
}
