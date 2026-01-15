/*WAJP to print nth term of Fibonacci series by
memoization technique. */

import java.util.Arrays;
import java.util.Scanner;

public class Q44 {
    static int[] mem;

    public static int memFib(int n) {
        if(n<=1) {
            mem[n]=n;
            return n;
        }

        if(mem[n] != -1) {
            return mem[n];
        } 

        mem[n] = memFib(n-1) + memFib(n-2);
        return mem[n];

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term n: ");
        int n = sc.nextInt();
        mem = new int[n+1];
        Arrays.fill(mem, -1);

        System.out.println(n+"th fibonacci is "+memFib(n));
    }
}