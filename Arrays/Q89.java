import java.util.Arrays;

public class Q89 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums=new int[m+n];
        int idx1=0, idx2=0, idx=0;
        while(idx1<m && idx2<n) {
            if(nums1[idx1]>nums2[idx2]) {
                nums[idx++]=nums2[idx2++];
            } else {
                nums[idx++]=nums1[idx1++];
            }
        }

        while(idx1<m) {
            nums[idx++]=nums1[idx1++];
        }

        while(idx2<n) {
            nums[idx++]=nums2[idx2++];
        }

        for(int i=0; i<nums.length; i++) {
            nums1[i]=nums[i];
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int n=nums2.length;
        int m=nums1.length-n;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
