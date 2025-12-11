/*
WAJP to print nth term of Tribonacci series.
*/

import java.util.Scanner;

public class Q28 {
    public static int getLCM(int a, int b, int c) {
        int big = (a>b&&a>c)?a:(b>c?b:c);       //LCM will be either equal to biggest number or multiple of bigest number
        
        for(int i=big;;i+=big){
            if(i%a==0 && i%b==0 && i%c==0) {
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
        System.out.println("LCM of "+a+", "+b+", "+c+" is "+getLCM(a, b, c));
        sc.close();
    }
}
