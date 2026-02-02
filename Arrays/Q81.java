/*You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container. */

public class Q81 {
    public static int maxArea(int[] height) {
        int start = 0, end = height.length - 1;
        int area = 0;
        while (start < end) {
            if (height[start] < height[end]) {
                int newArea = height[start] * (end - start);
                area = Math.max(area, newArea);
                start++;
            } else {
                int newArea = height[end] * (end - start);
                area = Math.max(area, newArea);
                end--;
            }
        }
        return area;

    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height));
    }
}
