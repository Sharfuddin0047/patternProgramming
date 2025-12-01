import java.util.Scanner;

public class Q13 {
    public static int biggest(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 4 number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("biggest is: "+ biggest(biggest(a, b),biggest(c, d)));
    }
}
