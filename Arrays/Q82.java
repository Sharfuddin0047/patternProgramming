public class Q82 {
    public static int trap(int[] height) {
        int start =0, end=height.length-1,water=0;
        int startMax=height[0], endMax=height[end];
        while(start<end) {
            if(height[start]<= height[end]) {
                if(height[start] > startMax) {
                    startMax=height[start];
                } else {
                    water = water + startMax - height[start];
                }
                start++;
            } else {
                if(height[end] >endMax) {
                    endMax=height[end];
                } else {
                    water = water + endMax - height[end];
                }
                end--;
            }
        }
        return water;
    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
