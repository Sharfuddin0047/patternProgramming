/*
Enter number of Rows:
5
(1,1)   (1,2)   (1,3)   (1,4)   (1,5)
(2,1)   (2,2)   (2,3)   (2,4)   (2,5)
(3,1)   (3,2)   (3,3)   (3,4)   (3,5)
(4,1)   (4,2)   (4,3)   (4,4)   (4,5)
(5,1)   (5,2)   (5,3)   (5,4)   (5,5)

*/


import java.util.Scanner;
class Q7 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Rows: ");
		int n=sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
					System.out.print("("+i+","+j+")\t");
			}
		System.out.println();
		}
	}
}