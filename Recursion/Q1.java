/*
WAJP to generate numbers from 1 to 10 by
using recursion.
*/

class Q1 {
    public static void generateNUmber(int n) {
        if(n==0) {
            return;
        }
        generateNUmber(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        generateNUmber(10);
    }
}