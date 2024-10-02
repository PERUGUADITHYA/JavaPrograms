package BasicPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		printFibonacci(number);
		System.out.println();
		System.out.print(a + " " + b + " ");
		printFibonacciRecur(number - 2);
		sc.close();

	}

	// Without Using Recursion
	public static void printFibonacci(int num) {
		int a = 0;
		int b = 1;
		System.out.print(a + " ");
		System.out.print(b + " ");
		for (int i = 2; i < num; i++) {
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}

	// With Using Recursion
	static int a = 0, b = 1;
	public static void printFibonacciRecur(int num) {
		if (num > 0) {
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
			printFibonacciRecur(num - 1);
		}
	}

}


/*

Enter The Number : 
10
0 1 1 2 3 5 8 13 21 34 
0 1 1 2 3 5 8 13 21 34 

*/