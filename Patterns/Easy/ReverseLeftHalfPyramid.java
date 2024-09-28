package Easy;

import java.util.Scanner;

public class ReverseLeftHalfPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		useNumber(number);
		useStar(number);
		useReverse(number);
	}
	public static void useNumber(int number) {
		for(int i=5;i>=1;i--) {
			//For loop for Spaces
			for(int j=1;j<=number-i;j++) {
				System.out.print(" ");
			}
			//For loop For Pattern
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
		System.out.println();
	}
	
	public static void useStar(int number) {
		for(int i=5;i>=1;i--) {
			//For loop for Spaces
			for(int j=1;j<=number-i;j++) {
				System.out.print(" ");
			}
			//For loop For Pattern
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println();
	}
	
	public static void useReverse(int number) {
		for(int i=5;i>=1;i--) {
			//For loop for Spaces
			for(int j=1;j<=number-i;j++) {
				System.out.print(" ");
			}
			//For loop For Pattern
			for(int j=5;j>number-i;j--) {
				System.out.print(j);
			}
			
			System.out.println();
		}
		System.out.println();
	}
}

/*

12345
 1234
  123
   12
    1

*****
 ****
  ***
   **
    *
 
 54321
  5432
   543
    54
     5


*/
