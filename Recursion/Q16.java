import java.util.Scanner;

public class Q16 {
    public static void powerofTwo(int n) {
        if(n<1) {
            System.out.println("NOT power of two");
            return;
        }
        if(n == 1) {
            System.out.println("power of two");
            return ;
        }
        if(n%2 == 0) {
            powerofTwo(n/2);
        } else {
            System.out.println("NOT power of Two");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        powerofTwo(n);
    }
}
