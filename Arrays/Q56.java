/*WAJP to print each element of the array which
has appeared only once/Unique elements in
the array. */

public class Q56 {
    public static void uniqueElement(int[] nums) {
        int min=nums[0];
        int max=nums[0];

        for(int x:nums) {
            if(x>max)
                max=x;
            else if(x<min)
                min=x;
        }

        int[] freq=new int[max-min+1];
        for(int x:nums) {
            freq[x-min]++;
        }

        for(int i=0; i<freq.length; i++) {
            if(freq[i]==1) {
                System.out.print((i+min)+ " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,23,34,34,56,47,23,43};
        uniqueElement(nums);
    }
}
