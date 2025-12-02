import java.util.Scanner;

public class Q20 {
    public static int LCM(int n, int m){
        if (m==0) {
            return n;
        }
        return LCM(m,n%m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("LCM is: " +(n*m)/LCM(n, m));
    }
}
