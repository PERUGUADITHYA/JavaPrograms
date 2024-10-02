package BasicPrograms;

import java.util.Scanner;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers : ");
		int number = sc.nextInt();
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		System.out.println("Among Numbers "+number+","+number1+" and "+number2);
		checkNumber(number, number1, number2);
		sc.close();
	}
	public static void checkNumber(int a,int b,int c) {
		//find the Largest Number
		if(a>b && a>c) {
			System.out.println(a +" is the Largest Number");
		} else if(b>a && b>c) {
			System.out.println(b + " is the Largest Number");
		} else {
			System.out.println(c + " is the Largest Number");
		}
		// Find the smallest number
        if (a <= b && a <= c) {
            System.out.println(a + " is the Smallest Number");
        } else if (b <= a && b <= c) {
            System.out.println(b + " is the Smallest Number");
        } else {
            System.out.println(c + " is the Smallest Number");
        }
	}

}

/*

Enter the Numbers : 
34
21
2
Among Numbers 34,21 and 2
34 is the Largest Number
2 is the Smallest Number

*/