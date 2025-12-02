import java.util.Scanner;

public class Q21 {
    public static void toh(int n, char from, char aux, char to){
        if(n==1) {
            System.out.println("Move Disk from "+from+" to "+to);
            return;
        }
        toh(n-1, from, to, aux);
        System.out.println("Move Disk from "+from+" to "+to);
        toh(n-1, aux, from, to);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Disk: ");
        int n = sc.nextInt();
        toh(n,'A','B','c');
    }
}
