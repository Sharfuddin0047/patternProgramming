import java.util.Arrays;

public class Q84 {
    public static int[] selectionSort(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n-1; i++) {
            int min=Integer.MAX_VALUE;
            int x=0;
            for(int j=i+1; j<n; j++) {
                if(nums[j]<min) {
                    min=nums[j];
                    x=j;
                }
            }
            int temp = min;
            nums[x] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {5,1,1,2,0,0};
        int[] res = selectionSort(nums);
        System.out.println("Sorted Array: "+Arrays.toString(res));
    }
}
