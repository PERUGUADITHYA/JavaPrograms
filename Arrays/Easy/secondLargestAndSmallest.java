package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class secondLargestAndSmallest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int n = sc.nextInt();
	    // Check for at least two elements
        if (n < 2) {
            System.out.println("Array must contain at least two elements.");
        } else {
		int []array = new int[n];
		System.out.println("Enter the Elements to the Array : ");
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();	
		}
		// Sort the array
        Arrays.sort(array);
        System.out.println("Finding the second largest element in the Array: ");

        // Find the second largest unique element
        int secondLargest = -1; // Initialize second largest
        for (int i = n - 2; i >= 0; i--) {
            if (array[i] != array[n - 1]) { // Check if it's different from the largest
                secondLargest = array[i];
                break; // Exit loop once found
            }
        }

        // Check if the second largest was found
        if (secondLargest == -1) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
		System.out.println();
		secondLargest1(array,n);
		secondsmallest(array);
		sc.close();
        }
	}
	public static void secondLargest1(int array[],int n) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		  // Traverse the array to find the largest and second largest elements
        for (int i = 0; i < n; i++) {
            // Update largest and second largest accordingly
            if (array[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = array[i];        // Update largest
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i]; // Update second largest if arr[i] is not equal to largest
            }
        }

        // Check if the second largest was found
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }

	}
	public static void secondsmallest(int array[]) {
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++) {
			if(array[i]<smallest) {
				secondSmallest = smallest;
				smallest = array[i];
			} else if(array[i]<secondSmallest && array[i]!=smallest) {
				secondSmallest = array[i];
			}
		} 
		System.out.println("The Second Smallest Element in the Array is :");
		System.out.println(secondSmallest);
	}
}

/*

Enter the size of the Array: 
5
Enter the Elements to the Array : 
1
2
3
4
4
Finding the second largest element in the Array: 
The second largest element is: 3

The second largest element is: 3

The Second Smallest Element in the Array is :
2
*/