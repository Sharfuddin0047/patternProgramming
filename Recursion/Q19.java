import java.util.Scanner;

public class Q19 {
    public static int getHCF(int x, int y) {
        if(y == 0) {
            return x;
        }
        return getHCF(y, x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int HCF = getHCF(x,y);
        System.out.println(HCF);
    }
}
