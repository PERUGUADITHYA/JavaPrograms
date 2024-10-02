package BasicPrograms;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		printNatural(number);
		sc.close();
	}
	public static void printNatural(int num) {
		int c=0;
		for(int i=1;i<=num;i++) {
			c +=i;	
		}
		System.out.println("Sum of First "+num+" Namtural Numbers : "+c);
	}

}

/*

Enter The Number : 
10
Sum of First 10 Namtural Numbers : 55

*/