/*
10
9
8
7
6
5
4
3
2
1
*/

public class Q2 {
    public static void generateNUmber(int n) {
        if(n==0) {
            return;
        }
        System.out.println(n);
        generateNUmber(n-1);
    }
    public static void main(String[] args) {
        generateNUmber(10);
    }
}
