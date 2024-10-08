package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the Array Elements : ");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		reverseArray(array);
		System.out.println();
		arrayFormat(array);
		System.out.println();
		int array1[] = {2,4,1,3,5,655,4,3,4,6};
		int n = array1.length;
		// Reversing the array
		 for (int i = 0; i < n / 2; i++) {
	            int temp = array1[i];
	            array1[i] = array1[n - i - 1];
	            array1[n - i - 1] = temp;
	        }

        // Using Arrays.toString() to print the array in reverse
        System.out.println(Arrays.toString(array1));
        //[6, 4, 3, 4, 655, 5, 3, 1, 4, 2]
		sc.close();
	}

	public static void reverseArray(int array[]) {
		System.out.println("Reverse Order Of Array Elements : ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}
	 // Printing the array in reverse order in array format
	public static void arrayFormat(int array[]) {
		System.out.print("[");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]);
			if(i!=0) {
				System.out.print(",");
			}
		}
		System.out.print("]");

	}

}
/*

Enter the Size of the Array
5
Enter the Array Elements : 
3
2
3
4
5
Reverse Order Of Array Elements : 
5 4 3 2 3 
[5,4,3,2,3]

*/