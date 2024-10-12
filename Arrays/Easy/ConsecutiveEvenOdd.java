package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ConsecutiveEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array : ");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the Array Elements : ");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		int count = 0, count1 = 0;
		int []even = new int[5];
		int []odd = new int[5];
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				odd[count] = array[i];
				count++;
			} else {
				count = 0;
			}
			if (array[i] % 2 == 0) {
				even[count1] = array[i];
				count1++;
			} else {
				count1 = 0;
			}
			if (count == 3) {
				System.out.println("In the given Array Consists " + count + " Consecutive Odd Elements");
				System.out.println(Arrays.toString(Arrays.copyOf(odd, count)));
			}
			if (count1 == 3) {
				System.out.println("In the given Array Consists " + count1 + " Consecutive Even Elements");
				System.out.println(Arrays.toString(Arrays.copyOf(even, count1)));
			}
		}
		if (count == 0 && count1 == 0) {
			System.out.println("There is no Consecutive Even And Odd Elements");
		}
		sc.close();
	}
}

/*

Enter the Size of the Array : 
9
Enter the Array Elements : 
5
3
1
2
4
6
8
7
9
In the given Array Consists 3 Consecutive Odd Elements
[5, 3, 1]
In the given Array Consists 3 Consecutive Even Elements
[2, 4, 6]


*/