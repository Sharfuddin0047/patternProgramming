import java.util.Scanner;

public class Q34 {
    public static String toHex(int n) {
        String hex = "";
        char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

        while(n>0) {
            hex = map[n%16]+hex;
            n/=16;
        }
        return hex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal number:");
        int n = sc.nextInt();
        System.out.println(n+" hexadecimal equivalent is "+toHex(n));
        sc.close();
    }
}
