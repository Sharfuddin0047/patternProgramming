/*For the given array of Strings, print the largest
string. */

public class Q4 {
    public static void main(String[] args) {
        String[] arr = {"Hello", "World", "Java", "Programming"};
        int max = Integer.MIN_VALUE;
        String str="";
        for(String x: arr) {
            if(x.length()>max) {
                max = x.length();
                str = x;
            }
        }
        System.out.println("largest String is: "+str);
    }
}
