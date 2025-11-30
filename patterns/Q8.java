/*
Enter number of Rows:
7
*           *
  *       *
    *   *
      *
    *   *
  *       *
*           *

*/


import java.util.Scanner;
class Q8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Rows: ");
		int n=sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==j || i+j==n+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
		System.out.println();
		}
	}
}
