/*https://leetcode.com/problems/sum-of-unique-elements/description/ */

public class Q73 {
    public static int sumOfUnique(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        int sum=0;
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
                sum += (i+min);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums ={4,1,2,2};
        System.out.println("sum of unique: "+sumOfUnique(nums));
    }
}
