package Easy;

import java.util.Scanner;

public class NumberIncreasingPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		useNumber(number);
		useStar(number);
		useSameNumber(number);
	}
	public static void useNumber(int number) {
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void useStar(int number) {
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void useSameNumber(int number) {
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}

/*

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6  

* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 

1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
6 6 6 6 6 6 

*/
