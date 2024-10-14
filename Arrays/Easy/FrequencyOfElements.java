package Arrays;

import java.util.Scanner;

public class FrequencyOfElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array : ");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the Array Elements : ");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		frequencyElements(array, size);
		sc.close();

	}

	public static void frequencyElements(int array[], int size) {
		int count = 0;
		int unique[] = new int[size];
		int count1 = 0;

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
		for (int k = 0; k < count; k++) {
			for (int j = 0; j < array.length; j++) {
				if (unique[k] == array[j]) {
					count1++;
				}
			}
			System.out.println(unique[k] + " : " + count1);
			count1 = 0;
		}
	}

}

/*

Enter the Size of the Array : 
9
Enter the Array Elements : 
2
3
4
1
2
3
2
6
7
2 : 3
3 : 2
4 : 1
1 : 1
6 : 1
7 : 1

*/