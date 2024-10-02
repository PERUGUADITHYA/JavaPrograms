package BasicPrograms;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number = sc.nextInt();
		checkNumber(number);
		sc.close();
	}
	static void checkNumber(int num) {
		if(num>0) {
			System.out.println(num + " is a Positive Number");
		}
		else if(num==0) {
			System.out.println("Number is Zero");
		} else {
			System.out.println(num + " is a Negative Number");
		}
	}

}

/*

Enter the Number : 
5
5 is a Positive Number

0
Number is Zero

-34
-34 is a Negative Number

*/