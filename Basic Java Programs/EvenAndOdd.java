package BasicPrograms;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		evenOdd(number);
		System.out.println();
		printevenOdd(number);
		sc.close();

	}
	public static void evenOdd(int num) {
		//Printing Even Numbers First
		System.out.println("Even Numbers : ");
		for(int i=0;i<=num;i++) {
			if(i%2==0) {
				System.out.print(i+" ");	
			}
		}
		 // Print odd numbers after even numbers
        System.out.println("\nOdd Numbers : ");
        for (int i = 0; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
	}
	//Printing Even And odd numbers in One For Loop
	public static void printevenOdd(int num) {
		StringBuilder even = new StringBuilder();
		StringBuilder odd = new StringBuilder();
		for(int i=0;i<=num;i++) {
			if(i%2==0) {
				even.append(i).append(" ");
			} else {
				odd.append(i).append(" ");
			}
		}
		System.out.println("Even Numbers : "+even);
		System.out.println("Odd Numbers : "+odd);
	}

}


/*


Enter The Number : 
24
Even Numbers : 
0 2 4 6 8 10 12 14 16 18 20 22 24 
Odd Numbers : 
1 3 5 7 9 11 13 15 17 19 21 23 
Even Numbers : 0 2 4 6 8 10 12 14 16 18 20 22 24 
Odd Numbers : 1 3 5 7 9 11 13 15 17 19 21 23 

*/