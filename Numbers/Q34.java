import java.util.Scanner;

public class Q34 {
    public static String toHex(int n) {
        String hex = "";

        while(n>0) {
            if(n%16 == 10) {
                hex = 'a'+hex;
            }
            else if(n%16 == 11) {
                hex = 'b'+hex;
            }
            else if(n%16 == 12) {
                hex = 'c'+hex;
            }
            else if(n%16 == 13) {
                hex = 'd'+hex;
            }
            else if(n%16 == 14) {
                hex = 'e'+hex;
            }
            else if(n%16 == 15) {
                hex = 'f'+hex;
            }
            else {
                hex = n%16+hex;
            }
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
