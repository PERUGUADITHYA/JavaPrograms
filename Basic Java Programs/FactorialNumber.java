package BasicPrograms;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		getFactorial(number);
		System.out.println();
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		System.out.println("Enter the Factorial Number : ");
		int f = sc.nextInt();
		// Checking if the second number is the factorial of the first
        checkFactorial(n, f);
        sc.close();
	}
	//Function to print the Factorial of Number
	public static void getFactorial(int num) {
		int result = 1;
		for(int i=1;i<=num;i++) {
			result = result*i;
		}
		System.out.println("Factorial of "+num+" is : "+result);
	}
	//Function For Factorial Number
	 public static int factorial(int number) {
	        int fact = 1;
	        for (int i = 1; i <= number; i++) {
	            fact *= i;
	        }
	        return fact;
	    }
	 // Function to check if 'factValue' is the factorial of 'num'
	    public static void checkFactorial(int num, int factValue) {
	        int calculatedFactorial = factorial(num);

	        // Check if the calculated factorial is equal to the given value
	        if (calculatedFactorial == factValue) {
	            System.out.println(num + " is the factorial of " + factValue);
	        } else {
	            System.out.println(num + " is not the factorial of " + factValue);
	            System.out.println("The correct factorial of " + num + " is " + calculatedFactorial);
	        }
	    }
}

/*

Enter The Number : 
6
Factorial of 6 is : 720

Enter the number : 
4
Enter the Factorial Number : 
24
4 is the factorial of 24

67
5 is not the factorial of 67
The correct factorial of 5 is 120


*/