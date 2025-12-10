import java.util.Scanner;
/*
WAJP to print and count all the Happy numbers
in range
*/
public class Q21 {
    public static void printHappyNumber(int start, int end) {
        int count=0;
        for(int i=start; i<=end; i++) {
            if(isHappyNumber(i)) {
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println("\nTotal such numbers are: "+count);
    }
    public static boolean isHappyNumber(int n) {
        while(n>9) {
            int sum = 0;
            while(n>0) {
                sum = sum + (int)Math.pow(n%10, 2);
                n/=10;
            }
            n = sum;
        }
        return n==1 || n==7;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start value: ");
        int start=sc.nextInt();
        System.out.println("Enter the end value: ");
        int end=sc.nextInt();
        printHappyNumber(start,end);
        sc.close();
    }
}
