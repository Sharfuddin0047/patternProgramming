package Numbers;

import java.util.Scanner;

/*
WAJP to take user input and print and count all the factors of the numbers.
*/
public class Q1 {
    public static void printFactor(int n) {
        if (n==1) {
            System.out.println("1 ");
        }
        System.out.print(1+" "+n+" ");
        int count = 2;
        for(int i=2; i*i<=n; i++) {
            if(n%i==0) {
                int factor1=i;
                int factor2=n/i;
                if(factor1 != factor2) {
                    System.out.print(factor1+" "+factor2+" ");
                    count +=2;
                } else {
                    System.out.println(factor1+" ");
                    count +=1;
                }
            }
        }
        System.out.println("\nTotal factors are: "+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        printFactor(n);
        sc.close();
    }
}
