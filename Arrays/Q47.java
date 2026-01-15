/*Third Maximum Number */

public class Q47 {
    public static int getThirdMax(int[] arr) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for(int x:arr) {
            if(x==first || x==second || x==third) {
                continue;
            }
            else if(x>first) {
                third = second;
                second = first;
                first = x;
            } 
            else if(x>second) {
                third = second;
                second = x;
            } else if(x>third) {
                third = x;
            }
        }
        return third==Long.MIN_VALUE?(int)first:(int)third;
    }
    public static void main(String[] args) {
        int[] a= {80, 80, 43, 50, 38, 63, 58, 80};
        System.out.println("Third max value: "+getThirdMax(a));
    }
}
