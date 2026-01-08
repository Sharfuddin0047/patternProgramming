/*Max consecutive n in any array */

import java.util.Scanner;

public class Q14 {
    public static int maxConsecutiveN(int[] nums, int n) {
        int count=0; int maxCount=0;
        for(int x: nums) {
            if(x == n) {
                count++;
                maxCount = Math.max(count, maxCount);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();
        int[] nums = {6,1,1,1,7,7,1,7,1,1};
        System.out.println(n+" comes: "+maxConsecutiveN(nums, n)+ " times");
        sc.close();
    }
}
