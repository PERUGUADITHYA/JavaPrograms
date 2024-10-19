package Arrays.Medium;

import java.util.Scanner;

public class SubArrayGivenSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the Array Elements: ");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the Target : ");
		int target = sc.nextInt();
		findSubArray(array, target);
		System.out.println("Checking only two indexes : ");
		chechTwoIndexes(array, target);
		sc.close();
	}

	public static void findSubArray(int array[], int target) {
		boolean k = false;
		for (int i = 0; i < array.length; i++) {
			int sum = 0;
			for (int j = i; j < array.length; j++) {
				sum += array[j];
				if (sum == target) {
					System.out.print("[");
					System.out.print(i + "," + j);
					System.out.print("]");
					System.out.println();
					k = true;
				}
			}
		}
		if (!k) {
			System.out.println(-1);
		}
	}
	public static void chechTwoIndexes(int array[],int n) {
		boolean k = false;
			for (int j = 0; j < array.length-1; j++) {
				int sum = array[j]+array[j+1];
				if (sum == n) {
					System.out.print("[");
					System.out.print(j + "," + (j+1));
					System.out.print("]");
					System.out.println();
					k = true;
				}
			}
		if (!k) {
			System.out.println(-1);
		}
	}

}

/*

Enter the Size of the Array: 
9
Enter the Array Elements: 
2
1
3
4
2
5
6

2
1
Enter the Target : 
6
[0,2]
[3,4]
[6,6]
Checking only two indexes : 
[3,4]


*/