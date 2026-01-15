/*WAJP to print Second Smallest element of the
array.
int[] a= {80, 80, 43, 50, 38, 63, 58, 80};
o/p
43 */
public class Q46 {
    public static int getsecondSmallest(int[] a) {
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        for(int x:a) {
            if(x<small) {
                secondSmall = small;
                small = x;
            } else if(x<secondSmall && x>small) {
                secondSmall=x;
            }
        }
        if(secondSmall == Integer.MAX_VALUE) {
            return -1;
        }

        return secondSmall;
    }
    public static void main(String[] args) {
        int[] a= {80, 80, 43, 50, 38, 63, 58, 80};
        System.out.println("second smallest is: "+getsecondSmallest(a));
    }

}
