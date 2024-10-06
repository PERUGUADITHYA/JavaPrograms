package Arrays;

import java.util.Scanner;

public class PositiveNegativeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the Array Elements : ");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		checkNumber(array, size);
		sc.close();

	}
	public static void checkNumber(int array[], int size) {
	    System.out.println("\nChecking the numbers in the array:\n");
	    for(int i = 0; i < array.length; i++) {
	        // Use String.format to ensure proper spacing
	        if(array[i] > 0) {
	            System.out.println(String.format("%2d is a Positive Number", array[i]));
	        } else if(array[i] < 0) {
	            System.out.println(String.format("%2d is a Negative Number", array[i]));
	        } else {
	            System.out.println(String.format("%2d is Zero", array[i]));
	        }
	    }
	    System.out.println();  // Adds a blank line at the end for spacing
	}

}

/*

Enter the Size of the Array
6
Enter the Array Elements : 
1
34
54
0
-6
-8

Checking the numbers in the array:

 1 is a Positive Number
34 is a Positive Number
54 is a Positive Number
 0 is Zero
-6 is a Negative Number
-8 is a Negative Number

*/