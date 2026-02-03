import java.util.Arrays;

public class Q83 {
    public static int[] sortArray(int[] nums) {
        int n = nums.length; 
        for(int i=0; i<n; i++) {
            boolean flag = true;
            for(int j=0; j<n-i-1; j++) {
                if(nums[j] > nums[j+1]) {
                    flag = false;
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            if(flag) return nums;
        }
        return nums;
    } 
    public static void main(String[] args) {
        int[] nums = {5,1,1,2,0,0};
        int[] res = sortArray(nums);
        System.out.println("Sorted Array: "+Arrays.toString(res));
    }
}
