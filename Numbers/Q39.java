import java.util.Scanner;

public class Q39 {
    public static void printPascalTriangle(int n) {
        int space = n; 
        for(int i=0; i<=n; i++) {
            for(int j=0; j<=space; j++) {
                System.out.printf("%-3s","");
            }
                printPascalRow(i);
            
            space--;
            System.out.println();
        }
    }
    public static void printPascalRow(int n) {
        int comb = 1;
        System.out.printf("%-6d",comb);
        for(int i=0; i<n; i++) {
            comb = comb*(n-i)/(i+1);
            System.out.printf("%-6d",comb);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number: ");
        int n = sc.nextInt();
        printPascalTriangle(n);
        sc.close();
    }
}
