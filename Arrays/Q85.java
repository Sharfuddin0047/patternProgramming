import java.util.Arrays;

class Q85{
    public static int[] insertionSort(int[] nums) {
        for(int i=1; i<nums.length; i++) {
            int pivot=nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>pivot) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = pivot;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {5,1,1,2,0,0};
        int[] res = insertionSort(nums);
        System.out.println("Sorted Array: "+Arrays.toString(res));
    }
}