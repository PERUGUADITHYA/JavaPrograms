package Arrays;

import java.util.Scanner;

public class MaximumAndMinimumElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the Array Elements : ");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		maximumElement(array);
		minimumElement(array);
		System.out.println();
		int array1[]= {3,1,23,44,321,45,654,32,233,2,34,55,4};
		maximumMinimum(array1);
		sc.close();

	}
	public static void maximumElement(int array[]) {
		int max  = array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		System.out.println("Maximum Element in the Array : "+max);
	}
	public static void minimumElement(int array[]) {
		int min  = array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		System.out.println("Minimum Element in the Array : "+min);
	}
	public static void maximumMinimum(int array[]) {
		int max = array[0];
		int min = array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]<min) {
				min = array[i];
			}
			if(array[i]>max) {
				max = array[i];
			}
		}
		System.out.println("Maximum Element in the Array : "+max);
		System.out.println("Minimum Element in the Array : "+min);
	}

}

/*

Enter the Size of the Array
6
Enter the Array Elements : 
1
23
45
67
5
4
Maximum Element in the Array : 67
Minimum Element in the Array : 1

Maximum Element in the Array : 654
Minimum Element in the Array : 1

*/