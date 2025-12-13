package RandomQuestion;

/* 
Given an N*N matrix , find the sum of both diagonals. if N is odd, subtract the center element once (as It's counted twice)

*/
public class Random4 {
    public static int diagonalSum(int[][] arr) {
        int sum =0; int n = arr.length;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i == j || i+j == n-1) { //even if both condition is true the center element will be added only once so no need to subtract
                    sum = sum+arr[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Diagonal sum is: "+diagonalSum(arr));
    }
}
