import java.util.Scanner;

public class Q22 {
    public static boolean isUglyNUmber(int n){
        if(n == 0) {
            return false;
        }
        if(n == 1){
            return true;
        }
        return n%2==0 && isUglyNUmber(n/2) || n%3==0 && isUglyNUmber(n/3) || n%5==0 && isUglyNUmber(n/5);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(isUglyNUmber(n)){
            System.out.println(n+" is ugly number");
        } else {
            System.out.println(n+" is NOT a ugly number");
        }
    }
}
