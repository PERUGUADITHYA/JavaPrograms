package Medium;

import java.util.Scanner;

public class PalindromeTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		useNumber(number);
		useStar(number);
	}

	public static void useNumber(int number) {
		for (int i = 1; i <= number; i++) {
			// For loop for Spaces
			for (int j = 1; j <= 2* (number - i); j++) {
				System.out.print(" ");
			}
			// For loop For Left Pattern
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			// For loop For Right Pattern
			for (int j = 2; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void useStar(int number) {
		for (int i = 1; i <= number; i++) {
			// For loop for Spaces
			for (int j = 1; j <= 2* (number - i); j++) {
				System.out.print(" ");
			}
			// For loop For Left Pattern
			for (int j = i; j >= 1; j--) {
				System.out.print("*" + " ");
			}
			// For loop For Right Pattern
			for (int j = 2; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}

/* 

          1 
        2 1 2 
      3 2 1 2 3 
    4 3 2 1 2 3 4 
  5 4 3 2 1 2 3 4 5 
6 5 4 3 2 1 2 3 4 5 6 

          * 
        * * * 
      * * * * * 
    * * * * * * * 
  * * * * * * * * * 
* * * * * * * * * * * 


*/
