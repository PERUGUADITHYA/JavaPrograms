package Hard;

import java.util.Scanner;

public class Rhombus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		useNumber(number);
		useStar(number);
		useSameNumber(number);
		sc.close();
	}

	public static void useNumber(int n) {
		//For Upper Part
		for (int i = 1; i <= n; i++) {
			//For Loop For Spaces
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			//For Loop For Pattern
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
		//For Lower Part
		for (int i = 1; i <= n; i++) {
			//For Loop For Spaces
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			//For Loop For Pattern
			for (int j = n - i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void useStar(int n) {
		//For Upper Part
		for (int i = 1; i <= n; i++) {
			//For Loop For Spaces
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			//For Loop For Pattern
			for (int j = i; j >= 1; j--) {
				System.out.print("*" + " ");
			}

			System.out.println();
		}
		//For Lower Part
		for (int i = 1; i <= n; i++) {
			//For Loop For Spaces
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			//For Loop For Pattern
			for (int j = n - i; j >= 1; j--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
	
	public static void useSameNumber(int n) {
		//For Upper Part
		for (int i = 1; i <= n; i++) {
			//For Loop For Spaces
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			//For Loop For Pattern
			for (int j = i; j >= 1; j--) {
				System.out.print(i + " ");
			}

			System.out.println();
		}
		//For Lower Part
		for (int i = 1; i <= n; i++) {
			//For Loop For Spaces
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			//For Loop For Pattern
			for (int j = n - i; j >= 1; j--) {
				System.out.print((n-i) + " ");
			}
			System.out.println();
		}
	}

}

/*
 
    1 
   2 1 
  3 2 1 
 4 3 2 1 
5 4 3 2 1 
 4 3 2 1 
  3 2 1 
   2 1 
    1 
     
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 


    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
 4 4 4 4 
  3 3 3 
   2 2 
    1 
    
    
 */