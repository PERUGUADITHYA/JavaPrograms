package Easy;

import java.util.Scanner;

public class leftHalfPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		useNumber(number);
		useStar(number);
		//useReverseNumber(number);
	}
	public static void useNumber(int number) {
		for(int i=number;i>=1;i--) {
			//For loop for Spaces
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			//For loop For Pattern
			for(int j=1;j<=number-(i-1);j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void useStar(int number) {
		for(int i=number;i>=1;i--) {
			//For loop for Spaces
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			//For loop For Pattern
			for(int j=1;j<=number-(i-1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
}


/*

     1
    12
   123
  1234
 12345

     *
    **
   ***
  ****
 *****


*/
