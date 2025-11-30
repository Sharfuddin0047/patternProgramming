import java.util.Scanner;

public class Q8 {
    public static int pow(int x, int y) {
        if(y==0) {
            return 1;
        }
        return x * pow(x,y-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int x = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int y = sc.nextInt();
        System.out.println(pow(x,y));

        
    }
}
