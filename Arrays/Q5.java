/*For the given array of Strings, print and count
all the Strings which has even number of
characters. */

public class Q5 {
    public static void main(String[] args) {
        String[] arr = {"Hello", "World", "Java", "Programming"};
        int count=0;
        for(String x: arr) {
            if(x.length()%2==0) {
                System.out.print(x+" ");
                count++;
            }
        }
        System.out.println("\nTotal even length character String: "+count);
    }
}
