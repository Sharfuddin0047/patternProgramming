public class Q4 {
    public static int add(int n) {
        if(n==1) {
            return 1;
        }
        return n + add(n-1);
    }
    public static void main(String[] args) {
        System.out.println(add(100));
    }
}
