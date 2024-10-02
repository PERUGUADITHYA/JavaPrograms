package BasicPrograms;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		printTable(number);
		System.out.println();
		System.out.println("Multiplication Tables Upto "+number);
		printTableUptoNum(number);
		sc.close();
	}
	//Function For One Multiplication Table
	public static void printTable(int num) {
		System.out.println("Multiplication Table of "+num+" is : ");
		for(int i=1;i<=10;i++) {
			 // Formatting the output for better alignment
            System.out.println(String.format("%2d * %2d = %3d", num, i, num * i));
		}
	}
	//Function For Multiplication Tables Upto Given Number
	public static void printTableUptoNum(int num) {
		for(int i=1;i<=num;i++) {
			printTable(i);
		}
	}

}

/*

Enter The Number : 
4
Multiplication Table of 4 is : 
 4 *  1 =   4
 4 *  2 =   8
 4 *  3 =  12
 4 *  4 =  16
 4 *  5 =  20
 4 *  6 =  24
 4 *  7 =  28
 4 *  8 =  32
 4 *  9 =  36
 4 * 10 =  40

Multiplication Tables Upto 4
Multiplication Table of 1 is : 
 1 *  1 =   1
 1 *  2 =   2
 1 *  3 =   3
 1 *  4 =   4
 1 *  5 =   5
 1 *  6 =   6
 1 *  7 =   7
 1 *  8 =   8
 1 *  9 =   9
 1 * 10 =  10
Multiplication Table of 2 is : 
 2 *  1 =   2
 2 *  2 =   4
 2 *  3 =   6
 2 *  4 =   8
 2 *  5 =  10
 2 *  6 =  12
 2 *  7 =  14
 2 *  8 =  16
 2 *  9 =  18
 2 * 10 =  20
Multiplication Table of 3 is : 
 3 *  1 =   3
 3 *  2 =   6
 3 *  3 =   9
 3 *  4 =  12
 3 *  5 =  15
 3 *  6 =  18
 3 *  7 =  21
 3 *  8 =  24
 3 *  9 =  27
 3 * 10 =  30
Multiplication Table of 4 is : 
 4 *  1 =   4
 4 *  2 =   8
 4 *  3 =  12
 4 *  4 =  16
 4 *  5 =  20
 4 *  6 =  24
 4 *  7 =  28
 4 *  8 =  32
 4 *  9 =  36
 4 * 10 =  40


*/