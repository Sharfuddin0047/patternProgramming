import java.util.Scanner;

public class Q25 {
    public static int fib(int n) {
        if(n <= 1) {
            return n;
        }
        int n1=0,n2=1,n3=0;
        for(int i=2; i<=n; i++) {
            n3=n1+n2;
            n1=n2; n2=n3;
        }
        return n3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value: ");
        int n = sc.nextInt();
        System.out.println(n+"th Fibonacci term is: "+fib(n));
        sc.close();
    }
}
