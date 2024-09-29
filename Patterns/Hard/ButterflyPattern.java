package Hard;

import java.util.Scanner;

public class ButterflyPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		useNumber(number);
		useStar(number);
	}

	public static void useNumber(int number) {
		//For Upper Part
		for (int i = 1; i <= number; i++) {
			//For Left Side Pattern
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			//For Spaces
			for (int j = 1; j <= 2 * (number - i); j++) {
				System.out.print(" ");
			}
			//For Right Side Pattern
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		//For Lower Part
		for (int i = number; i >= 1; i--) {
			//For Left Side Pattern
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			//For Spaces
			for (int j = 1; j <= 2 * (number -i); j++) {
				System.out.print(" ");
			}
			//For Right Side Pattern
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void useStar(int number) {
		//For Upper Part
		for (int i = 1; i <= number; i++) {
			//For Left Side Pattern
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			//For Spaces
			for (int j = 1; j <= 2 * (number - i); j++) {
				System.out.print(" ");
			}
			//For Right Side Pattern
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//For Lower Part
		for (int i = number; i >= 1; i--) {
			//For Left Side Pattern
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			//For Spaces
			for (int j = 1; j <= 2 * (number -i); j++) {
				System.out.print(" ");
			}
			//For Right Side Pattern
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*

1          1
12        21
123      321
1234    4321
12345  54321
123456654321
123456654321
12345  54321
1234    4321
123      321
12        21
1          1


*          *
**        **
***      ***
****    ****
*****  *****
************
************
*****  *****
****    ****
***      ***
**        **
*          *


*/
