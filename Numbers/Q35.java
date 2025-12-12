import java.util.Scanner;

public class Q35 {
    public static int toHex(String n) {
        int dec=0; int hexMul=1;
        for(int i=n.length()-1; i>=0; i--) {
            if(n.charAt(i)>='0' && n.charAt(i)<='9') {
                    int val = n.charAt(i)-'0';
                    dec = val*hexMul +dec;
                }
            else if(n.charAt(i)>='a' && n.charAt(i)<='f') {
                int val = n.charAt(i)-'a'+10;
                dec = val*hexMul + dec;
            } 
            else if(n.charAt(i)>='A' && n.charAt(i)<='F') {
                int val = n.charAt(i)-'A'+10;
                dec = val*hexMul + dec;
            } 
            hexMul*=16;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hexadecimal number:");
        String n = sc.next();
        System.out.println(n+" decimal equivalent is "+toHex(n));
        sc.close();
    }
}
