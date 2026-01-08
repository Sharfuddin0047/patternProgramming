/*
WAJP to check two arrays are palindromic array
or not. Return true or false accordingly.
1st array: {10,20,30,40,80,70,25}

2nd array: {25,70,80,40,30,20,10}
Output: true
*/

public class Q19 {
    public static boolean areBothPalindromic(int[] arr1 , int[] arr2) {
        if(arr1.length != arr2.length) {
            return false;
        }
        for(int i=0; i<arr1.length; i++) {
            if(arr1[i] != arr2[arr2.length-i-1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,80,70,25};
        int[] arr2 = {25,70,80,40,30,20,10};

        System.out.println("Are both arrays palindromic? " + areBothPalindromic(arr1, arr2));
    }
}
