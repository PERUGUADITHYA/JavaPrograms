package Medium;

import java.util.Scanner;

public class pascalsTraingle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		useNumber(number);
	}
	public static void useNumber(int number) {
		for (int i = 1; i <= number; i++) {
			// For loop for Spaces
			for (int j = 1; j <=(number - i); j++) {
				System.out.print(" ");
			}
			// For loop For Pattern
			int a=1;
			for (int j = 1; j <= i; j++) {
				System.out.print(a + " ");
				a = a*(i-j)/j;
			}
			System.out.println();
		}
		System.out.println();
	}

}

/*

         1 
        1 1 
       1 2 1 
      1 3 3 1 
     1 4 6 4 1 
    1 5 10 10 5 1 
   1 6 15 20 15 6 1 
  1 7 21 35 35 21 7 1 
 1 8 28 56 70 56 28 8 1 
1 9 36 84 126 126 84 36 9 1 


*/
