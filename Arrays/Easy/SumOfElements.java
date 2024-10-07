package Arrays;

import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the Array Elements : ");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		sumOfElements(array);
		sc.close();
	}
	public static void sumOfElements(int array[]) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum +=array[i];
		}
		System.out.println("Sum Of Elements in the Array is : "+sum);
	}

}

/*

Enter the Size of the Array
6
Enter the Array Elements : 
2
34
5
6
7
5
Sum Of Elements in the Array is : 59

*/