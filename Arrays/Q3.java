/*  For the given array of Strings, print the length
of all the Strings. */

public class Q3 {
    public static void main(String[] args) {
        String[] arr = {"Hello", "World", "Java", "Programming"};
        for(String x: arr) {
            System.out.println(x+" length is: "+x.length());
        }
    }
}
