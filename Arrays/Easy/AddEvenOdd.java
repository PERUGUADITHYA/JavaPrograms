package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the Array Elements : ");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		addEvenOdd(array);
		int []array1 = {1,2,3,4,5,6,7,8,9};
		changeEven(array1);
		sc.close();
	}
	 public static void addEvenOdd(int array[]) {
	        for(int i = 0; i < array.length; i++) {
	            if(array[i] % 2 == 0) {
	                array[i] += 2;  // Add 2 to even numbers
	            } else {
	                array[i] += 4;  // Add 4 to odd numbers
	            }
	        }

	        // Output the modified array in array format using Arrays.toString()
	        System.out.println(Arrays.toString(array));
	    }
	 public static void changeEven(int array[]) {
		 for(int i = 0; i < array.length; i++) {
	            if(array[i] % 2 == 0) {
	                array[i] *= 2;  // Add 2 to even numbers
	            }
		 }
		 System.out.println("Changing Only Even Numbers");
		 System.out.println(Arrays.toString(array));
	 }

}

/*

Enter the Size of the Array
5
Enter the Array Elements : 
1
2
3
4
5
[5, 4, 7, 6, 9]
Changing Only Even Numbers
[1, 4, 3, 8, 5, 12, 7, 16, 9]

*/