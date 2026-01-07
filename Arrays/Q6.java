/*WAJP for below requirements:
Sum except itself:
Original array: {2,5,4,3,6}
resultant array: {18,15,16,17,14}*/

public class Q6 {
    public static void main(String[] args) {
        int[] arr={2,5,4,3,6};
        int[] rarr = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            int sum = 0;
            for(int j=0; j<arr.length; j++) {
                if(i!=j) {
                    sum = sum + arr[j];
                }
            }
            rarr[i] = sum;
        }
        for(int x: rarr) {
            System.out.print(x+" ");
        }
    }
}
