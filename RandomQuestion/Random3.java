package RandomQuestion;

import java.util.Scanner;

/*
Given a string , compress it by replacing consecutive duplicate characters with the character followed by its count. if a character appears only once , do not include the count 

example:
input: aaabbbccddddee
output: a3b3c2d4e2
*/
public class Random3 {
    public static String getEncoding(String n) {
        String enc = "";
        for(int i=0; i<n.length();) {
            int count = 1;
            int j = i+1;
            while(j<n.length() && n.charAt(i) == n.charAt(j)) {
                count++;
                j++;
            }
            if(count == 1) {
                enc=enc+n.charAt(i);
            } else {
                enc=enc+n.charAt(i)+count;
            }

            i=j;
        }
        return enc;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String n = sc.next();
        System.out.println("Encoded string is: "+getEncoding(n));
        sc.close();
    }
}
