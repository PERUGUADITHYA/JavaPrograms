package Arrays;

import java.util.Scanner;

public class EvenOddNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the Array Elements : ");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		evenOdd(array, size);
		System.out.println("Enter the Size of the Array");
		int size1 = sc.nextInt();
		int array1[] = new int[size1];
		System.out.println("Enter the Array Elements : ");
		for (int i = 0; i < size1; i++) {
			array1[i] = sc.nextInt();
		}
		evenOdd1(array1, size1);
		sc.close();
	}

	public static void evenOdd(int array[], int size) {
		StringBuilder even = new StringBuilder();
		StringBuilder odd = new StringBuilder();
		for (int i = 0; i < size; i++) {
			if (array[i] % 2 == 0) {
				even.append(array[i]).append(" ");
			} else {
				odd.append(array[i]).append(" ");
			}
		}
		// Check if even or odd numbers exist and print appropriate messages
		if (even.length() == 0) {
			System.out.println("No Even Numbers found.");
		} else {
			System.out.println("Even Numbers: \n" + even);
		}

		if (odd.length() == 0) {
			System.out.println("No Odd Numbers found.");
		} else {
			System.out.println("Odd Numbers: \n" + odd);
		}
	}

	public static void evenOdd1(int array1[], int size1) {
		boolean evenExists = false;
		boolean oddExists = false;
		// Printing Even Numbers First
		System.out.println("Even Numbers : ");
		for (int i = 0; i < size1; i++) {
			if (array1[i] % 2 == 0) {
				System.out.print(array1[i] + " ");
				evenExists = true;
			}
		}
		if (!evenExists) {
			System.out.println("No Even Numbers found.");
		}
		// Print odd numbers after even numbers
		System.out.println("\nOdd Numbers : ");
		for (int i = 0; i < size1; i++) {
			if (array1[i] % 2 != 0) {
				System.out.print(array1[i] + " ");
				oddExists = true;
			}
		}
		if (!oddExists) {
			System.out.println("No Odd Numbers found.");
		}
	}

}

/*

Enter the Size of the Array
10
Enter the Array Elements : 
0
1
2
3
4
5
6
7
8
9
Even Numbers: 
0 2 4 6 8 
Odd Numbers: 
1 3 5 7 9 
Enter the Size of the Array
5
Enter the Array Elements : 
4
4
4
4
4
Even Numbers : 
4 4 4 4 4 
Odd Numbers : 
No Odd Numbers found.

*/