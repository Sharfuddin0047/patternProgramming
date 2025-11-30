import java.util.Scanner;

public class Q9 {
    public static int countDigit(int n) {
        if(n<9) {
            return 1;
        }
        return 1 + countDigit(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(countDigit(n));
    }
}
