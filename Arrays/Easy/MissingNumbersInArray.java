package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class MissingNumbersInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the Array Elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        missingNumber(array);
        System.out.println();
        findMissingNumbers(array);
        sc.close();
    }

    public static void missingNumber(int array[]) {
        // Find the largest number in the array
        int largest = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > largest) {
                largest = num;
            }
        }

        // Use a set to store all the array elements for easy lookup
        HashSet<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }

        // Print missing numbers from 1 to the largest number
        System.out.print("Missing numbers are: ");
        for (int i = 1; i <= largest; i++) {
            if (!set.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void findMissingNumbers(int array[]) {
        // Find the largest number in the array
        int largest = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > largest) {
                largest = num;
            }
        }

        // Create a boolean array to mark the presence of numbers
        boolean[] present = new boolean[largest + 1];

        // Mark the numbers that are present in the array
        for (int num : array) {
            if (num <= largest) {
                present[num] = true;  // Mark this number as present
            }
        }

        // Find and print missing numbers from 1 to the largest number
        System.out.print("Missing numbers are: ");
        for (int i = 1; i <= largest; i++) {
            if (!present[i]) {
                System.out.print(i + " ");
            }
        }
    }
}

/*

Enter the Size of the Array: 
6
Enter the Array Elements: 
4
2
3
7
9
8
Missing numbers are: 1 5 6 
Missing numbers are: 1 5 6 

*/