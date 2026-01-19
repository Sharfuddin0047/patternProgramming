/*WAJP to print the frequency of each element of
the array if all given elements are in range from
0 to 100. */

public class Q50 {
    public static int[] countFreq(int[] nums) {
        int[] freq = new int[101];
        for(int x: nums) {
            freq[x]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        int[] nums = {1,23,34,34,56,47,23,43};
        int[] freq = countFreq(nums);

        for(int i=0; i<101; i++) {
            if(freq[i]!=0) {
                System.out.println(i+" comes "+freq[i]+" times");
            }
        }
    }
}
