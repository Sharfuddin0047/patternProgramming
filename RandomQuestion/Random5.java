class Random5 {
    public static void mergeSort(int[] nums, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;

            mergeSort(nums, start, mid);
            mergeSort(nums, mid + 1, end);
            merge(nums, start, mid, end);
        }
    }

    public static void merge(int[] nums, int start, int mid, int end) {
        int[] arr = new int[end - start + 1];
        int idx1 = start;
        int idx2 = mid + 1;
        int j = 0;
        while (idx1 <= mid && idx2 <= end) {
            if (nums[idx1] < nums[idx2]) {
                arr[j++] = nums[idx1++];
            } else {
                arr[j++] = nums[idx2++];
            }
        }

        while (idx2 <= end) {
            arr[j++] = nums[idx2++];
        }

        while (idx1 <= mid) {
            arr[j++] = nums[idx1++];
        }

        for (int i = 0, k = start; i < arr.length; i++, k++) {
            nums[k] = arr[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = { 42, 7, 19, 3, 88, 15, 60 };
        mergeSort(nums, 0, nums.length-1);
        for (int x : nums) {
            System.out.print(x + " ");
        }
    }
}