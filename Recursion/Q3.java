/*
Enter no to generate table: 2
2
4
6
8
10
12
14
16
18
20
*/

import java.util.Scanner;

public class Q3 {
    public static void table(int n, int m){
        if(m == 0) {
            return;
        }
        table(n, m-1);
        System.out.println(n*m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no to generate table: ");
        int n = sc.nextInt();
        table(n,10);
    }
}
