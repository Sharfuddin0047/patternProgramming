public class Q6 {
    public static int addCube(int n) {
        if(n==1) {
            return 1;
        }
        return n*n*n + addCube(n-1);
    }
    public static void main(String[] args) {
        System.out.println(addCube(100));
    }
}
