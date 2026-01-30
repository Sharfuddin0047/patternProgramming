/*https://leetcode.com/problems/kth-missing-positive-number/description/ */

public class Q77 {
    public static int kthMissingPositive(int[] nums, int k) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] - mid - 1 < k) {
                left = mid + 1;
            } else {
                right= mid;
            }

        }
        return left+k;

    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,7,11};
        int k = 5;
        System.out.println(kthMissingPositive(nums, k));
    }
}
