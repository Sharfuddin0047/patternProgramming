import java.util.Scanner;

public class Q17 {
    public static void powerofThree(int n) {
        if(n<1) {
            System.out.println("NOT a power of Three");
            return;
        }
        if (n == 1) {
            System.out.println("power of Three");
            return;
        }
        if(n%3 == 0) {
            powerofThree(n/3);
        } else {
            System.out.println("NOT power of Three");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        powerofThree(n);
    }
}
