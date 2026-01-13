/*WAJP to print and count all the prime number
elements from array. */

public class Q36 {
    public static void primeCount(int[] arr) {
        int count=0;
        for(int i=0; i<arr.length; i++) {
            if(isPrime(arr[i])) {
                count++;
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("\nTotal prime count: "+count);
    }
    public static boolean isPrime(int n) {
        if(n<=1) {
            return false;
        }
        if(n==2) {
            return true;
        }
        for(int i=2; i*i<=n; i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        primeCount(arr);
    }
}
