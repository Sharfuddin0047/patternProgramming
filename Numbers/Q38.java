import java.util.Scanner;

public class Q38 {
    public static void getPascalRow(int n) {
        int com= 1;
        System.out.print(com+" ");
        for(int i=0; i<n; i++) {
            com = com*(n-i)/(i+1);
            System.out.print(com+" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number: ");
        int n = sc.nextInt();
        getPascalRow(n);
        sc.close();
    }
}
