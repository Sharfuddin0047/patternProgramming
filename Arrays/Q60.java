/*WAJP to print all the elements of array whose
frequency are odd. */
public class Q60 {
    public static void oddOccurence(int[] nums) {
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
            if(freq[i] !=0 && freq[i]%2==1) {
                System.out.print((i+min)+ " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,23,34,34,56,47,47,23,43,43,56};
        oddOccurence(nums);
    }
}
