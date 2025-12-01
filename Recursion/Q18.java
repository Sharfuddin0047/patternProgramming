import java.util.Scanner;

public class Q18 {
    public static void powerofFour(int n) {
        if(n<1) {
            System.out.println("NOT a power of Four");
            return;
        }
        if (n == 1) {
            System.out.println("power of Four");
            return;
        }
        if(n%4 == 0) {
            powerofFour(n/4);
        } else {
            System.out.println("NOT power of Four");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        powerofFour(n);
    }
}
