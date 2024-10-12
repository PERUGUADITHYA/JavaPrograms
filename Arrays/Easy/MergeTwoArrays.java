package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Size of the Array : ");
		int size = sc.nextInt();
		int []array= new int[size];
		System.out.println("Enter the Array Elements : ");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Enter the Size of the Second Array : ");
		int size1 = sc.nextInt();
		int []array1= new int[size1];
		System.out.println("Enter the Array Elements : ");
		for(int i=0;i<size1;i++) {
			array1[i]=sc.nextInt();
		}
		System.out.println("Merging Two Arrays into a Single Array : ");
		int []merge = new int[array.length+array1.length];
		for(int i=0;i<array.length;i++) {
			merge[i]=array[i];
		}
		for(int j=0;j<array1.length;j++) {
			merge[array.length+j]=array1[j];
		}
		System.out.println(Arrays.toString(merge));
		System.out.println();
		mergeArrays(array, array1);
		System.out.println();
		normalSort(array, array1);
		sc.close();
	}
	public static void mergeArrays(int array[],int array1[]) {
		int []merge = new int[array.length+array1.length];
		for(int i=0;i<array.length;i++) {
			merge[i]=array[i];
		}
		for(int j=0;j<array1.length;j++) {
			merge[array.length+j]=array1[j];
		}
		Arrays.sort(merge);
		System.out.println("Merged Array in Sorting Order : ");
		System.out.println(Arrays.toString(merge));
	}
	public static void normalSort(int array[],int array1[]) {
		int []merge = new int[array.length+array1.length];
		for(int i=0;i<array.length;i++) {
			merge[i]=array[i];
		}
		for(int j=0;j<array1.length;j++) {
			merge[array.length+j]=array1[j];
		}
		bubbleSort(merge);
		System.out.println("Merged Array in Sorting Order : ");
		System.out.println(Arrays.toString(merge));
		System.out.println();
		bubbleSortDesc(merge);
		System.out.println("Merged Array in Sorting in Descending Order : ");
		System.out.println(Arrays.toString(merge));	
	}
	public static void bubbleSort(int []array) {
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					int t= array[j];
					array[j]= array[j+1];
					array[j+1]=t;
				}
			}
		}
	}
	public static void bubbleSortDesc(int []array) {
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]<array[j+1]) {
					int t= array[j];
					array[j]= array[j+1];
					array[j+1]=t;
				}
			}
		}
	}

}

/*

Enter the Size of the Array : 
5
Enter the Array Elements : 
4
2
3
1
5
Enter the Size of the Second Array : 
5
Enter the Array Elements : 
6
8
7
9
0
Merging Two Arrays into a Single Array : 
[4, 2, 3, 1, 5, 6, 8, 7, 9, 0]

Merged Array in Sorting Order : 
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

Merged Array in Sorting Order : 
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

Merged Array in Sorting in Descending Order : 
[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

*/