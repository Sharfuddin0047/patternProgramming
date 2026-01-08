/*https://leetcode.com/problems/max-consecutive-ones/description/ */

public class Q12 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0; int maxCount=0;
        for(int x: nums) {
            if(x==1) {
                count++;
                maxCount = Math.max(count,maxCount);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
