import java.util.Scanner;

public class Q15 {
    public static void printFib(int n) {
        if(n==0 || n==1) {
            System.out.println(n+" ");
        }
        int fib = printFib(n-1) + printFib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth term: ");
        int n = sc.nextInt();
        printFib(n);
    }
}
