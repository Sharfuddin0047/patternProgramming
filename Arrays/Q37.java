/*WAJP to get sum of all the prime number
elements from array. */

public class Q37 {
    public static void primeSum(int[] arr) {
        int sum=0;
        for(int i=0; i<arr.length; i++) {
            if(isPrime(arr[i])) {
                sum += arr[i];
            }
        }
        System.out.print("\nTotal prime sum: "+sum);
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
        primeSum(arr);
    }
}
