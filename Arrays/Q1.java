// WAJP to swap two arrays.

class Q1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {5,6,7,8,9};

        int[] temp = a;
        a = b;
        b = temp;

        // Print to verify
        System.out.println("Array a:");
        for(int x : a) System.out.print(x + " ");
        System.out.println("\nArray b:");
        for(int x : b) System.out.print(x + " ");
    }
}