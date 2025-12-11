/*
WAJP to take user input and print GCD/HCF of three numbers
*/

import java.util.Scanner;

public class Q29 {
    public static int getHCF(int a, int b, int c) {
        int small = (a<b&&a<c)?a:(b<c?b:c);       //HCF will be either equal to smallest number or less than that
        
        for(int i=small;;i--){
            if(a%i==0 && b%i==0 && c%i==0) {
                return i;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a,b and c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("LCM of "+a+", "+b+", "+c+" is "+getHCF(a, b, c));
        sc.close();
    }
}
