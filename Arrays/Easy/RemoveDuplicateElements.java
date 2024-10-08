package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the Array Elements : ");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Unique elements using HashSet: ");
		removeDuplicate(array);
		System.out.println();

		System.out.println("Unique elements using custom method: ");
		removeDuplicate1(array, size);
		sc.close();

	}

	// Method using HashSet to remove duplicates and print in array format
	public static void removeDuplicate(int array[]) {
		// HashSet maintains the insertion order and removes duplicates
		HashSet<Integer> unique = new HashSet<Integer>();
		for (int num : array) {
			unique.add(num);
		}

		// Printing in array format
		System.out.print("[");
		int i = 0;
		for (int n : unique) {
			System.out.print(n);
			if (i < unique.size() - 1) {
				System.out.print(", ");
			}
			i++;
		}
		System.out.print("]");
		/*  // Convert HashSet to array and use Arrays.toString() to print in array format
        Integer[] uniqueArray = unique.toArray(new Integer[0]);
        System.out.println(Arrays.toString(uniqueArray));
        */
	}

	// Custom method to remove duplicates and print in array format
	public static void removeDuplicate1(int array[], int size) {
		// Array to store unique elements
		int unique[] = new int[size];
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			boolean exists = false;

			// Check if the element is already in unique array
			for (int j = 0; j < count; j++) {
				if (array[i] == unique[j]) {
					exists = true;
					break;
				}
			}

			// If not duplicate, add to unique array
			if (!exists) {
				unique[count] = array[i];
				count++;
			}
		}

		// Printing in array format
		System.out.print("[");
		for (int i = 0; i < count; i++) {
			System.out.print(unique[i]);
			if (i < count - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		/*
		  // Create a trimmed array to avoid unused positions
        int[] trimmedUnique = Arrays.copyOf(unique, count);

        // Use Arrays.toString() to print the unique elements in array format
        System.out.println(Arrays.toString(trimmedUnique));
		 */
	}
}

/*

Enter the Size of the Array
6
Enter the Array Elements : 
22
1
2
2
1
22
Unique elements using HashSet: 
[1, 2, 22]
Unique elements using custom method: 
[22, 1, 2]

*/