package Medium;

import java.util.Scanner;

public class ReverseTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		useNumber(number);
		useStar(number);
		useReverse(number);
	}

	public static void useNumber(int number) {
		for (int i = number; i >= 1; i--) {
			// For loop for Spaces
			for (int j = 1; j <= number - i; j++) {
				System.out.print(" ");
			}
			// For loop For Pattern
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
		System.out.println();
	}

	public static void useStar(int number) {
		for (int i = number; i >= 1; i--) {
			// For loop for Spaces
			for (int j = 1; j <= number - i; j++) {
				System.out.print(" ");
			}
			// For loop For Pattern
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}

			System.out.println();
		}
		System.out.println();
	}

	public static void useReverse(int number) {
		for (int i = number; i >= 1; i--) {
			// For loop for Spaces
			for (int j = 1; j <= number - i; j++) {
				System.out.print(" ");
			}
			// For loop For Pattern
			for (int j = number; j > number - i; j--) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
		System.out.println();
	}

}

/*

1 2 3 4 5 6 
 1 2 3 4 5 
  1 2 3 4 
   1 2 3 
    1 2 
     1 

* * * * * * 
 * * * * * 
  * * * * 
   * * * 
    * * 
     * 

6 5 4 3 2 1 
 6 5 4 3 2 
  6 5 4 3 
   6 5 4 
    6 5 
     6 
     
 */
