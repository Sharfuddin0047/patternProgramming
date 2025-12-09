import java.util.Scanner;
/**
 * WAJP to print and count all the Strong numbers
up to n. 
 */
public class Q15 {
    public static void printStrongNumber(int start, int end) {
        int count=0;
        for(int i=start; i<=end; i++) {
            if(isStrongNumber(i)) {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("\nTotal Strong Numbers in given range are: "+count);
    }
    public static boolean isStrongNumber(int n) {
        int sum = 0; int num =n;
        while(n>0) {
            sum = sum + getFactorial(n%10);
            n/=10;
        }
        return sum == num;
    }

    public static int getFactorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for(int i=1; i<=n; i++) {
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int start = sc.nextInt();
        System.out.println("Enter the number: ");
        int end = sc.nextInt();
        printStrongNumber(start, end);
        sc.close();
    }
}
