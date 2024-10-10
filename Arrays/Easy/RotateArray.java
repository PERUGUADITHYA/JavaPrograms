package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size : ");
		int n = sc.nextInt();
		System.out.println("Enter the Number of Rotations : ");
		int r = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the Array Elements : ");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		rotateArray(array, r, n);
		System.out.println();
		arrayList( n, r);
		sc.close();
	}

	public static void rotateArray(int array[], int k, int n) {
		k = k % n; // To handle rotations greater than n
		int[] rotate = new int[n];
		for (int i = 0; i < n; i++) {
			rotate[(i + k) % n] = array[i];
		}
		System.out.println("Array After " + k + " Rotations : ");
		System.out.print("[");
		for (int i = 0; i < rotate.length; i++) {
			System.out.print(rotate[i]);
			if (i != rotate.length - 1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}

	public static void arrayList(int n, int k) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Emter the Array Elements");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		k = k % n;
		Collections.rotate(list, k);
		System.out.println("Array After " + k + " Rotations : ");
		// Convert the list to an array
		Integer[] rotatedArray = list.toArray(new Integer[0]);

		// Print the rotated array in array format using Arrays.toString()
		System.out.println(Arrays.toString(rotatedArray));
		sc.close();
	}

}

/*

Enter the Size : 
5
Enter the Number of Rotations : 
1
Enter the Array Elements : 
2
3
4
5
5
Array After 1 Rotations : 
[5,2,3,4,5]
Emter the Array Elements
2
3
4
5
67
Array After 1 Rotations : 
[67, 2, 3, 4, 5]
 
 
 
 */