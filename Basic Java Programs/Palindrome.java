package BasicPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		//Function To check a number is Palindrome or Not
		if (checkPalindrome(number)) {
			System.out.println(number + " is a Palindrome Number");
		} else {
			System.out.println(number + " is a Not Palindrome Number");
		}
		//To Print Palindrome Numbers Upto a Series
		System.out.println("Enter the Starting Number : ");
		int start = sc.nextInt();
		System.out.println("Enter the ending Number : ");
		int end = sc.nextInt();
		System.out.println("Palindrome numbers Between "+start+" and "+end+" is :");
		for(int i=start;i<=end;i++) {
			if(printPalindromeSeries(i)) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}

	public static boolean checkPalindrome(int n) {
		int originalNumber = n;
		int reversedNumber = 0;

		// Reversing the number
		while (n != 0) {
			int digit = n % 10;
			reversedNumber = reversedNumber * 10 + digit;
			n /= 10;
		}

		// Checking if the original number and the reversed number are the same
		return originalNumber == reversedNumber;
	}

	public static boolean printPalindromeSeries(int n) {
		int k = n;
		int b = 0;
		while (n > 0) {
			int r = n % 10;
			b = b * 10 + r;
			n /= 10;
		}
		return k == b;
	}

}


/*

Enter The Number : 
34543
34543 is a Palindrome Number
Enter the Starting Number : 
10
Enter the ending Number : 
230
Palindrome numbers Between 10 and 230 is :
11 22 33 44 55 66 77 88 99 101 111 121 131 141 151 161 171 181 191 202 212 222 

*/
