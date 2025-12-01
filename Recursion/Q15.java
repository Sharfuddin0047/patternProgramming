import java.util.Scanner;

public class Q15 {
    private static long[] fibonacciCache;

    public static long fib(int n) {
        if(n==0 || n==1) {
            return n;
        }

        if(fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }

        long nthfib = fib(n-1)+fib(n-2);
        fibonacciCache[n] = nthfib;
        return nthfib;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth term: ");
        int n = sc.nextInt();
        fibonacciCache = new long[n+1];
        for(int i=0; i<=n; i++) {
            System.out.print(fib(i)+" ");
        }
        
    }
}
