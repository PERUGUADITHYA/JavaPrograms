package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RotateArrayToLeft {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int n = sc.nextInt();
		System.out.println("Enter the Number Of Rotations : ");
		int r = sc.nextInt();
		int []array = new int[n];
		System.out.println("Enter the Array Elements : ");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		rotateLeft(array, n, r);
		System.out.println();
		array(n, r);
		sc.close();

	}
	public static void rotateLeft(int array[],int n,int k) {
		k = k%n;
		int []rotated = new int[n];
		for(int i=0;i<n;i++) {
			rotated[(i + n - k)%n] = array[i];
		}
		System.out.println("Array After "+k+" Rotations to Left : ");
		for(int num : rotated) {
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(rotated));
	}
	public static void array(int n, int k) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter the Array Elements : ");
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		Collections.rotate(list, -k);
		System.out.println("Array After "+k+" Rotations to Left : ");
		for(int num: list) {
			System.out.print(num+" ");
		}
		Integer []array = list.toArray(new Integer[0]);
		System.out.println();
		System.out.println(Arrays.toString(array));
		sc.close();
	}

}

/*

Enter the size of the Array: 
6
Enter the Number Of Rotations : 
4
Enter the Array Elements : 
3
3
4
5
6
4
Array After 4 Rotations to Left : 
6 4 3 3 4 5 
[6, 4, 3, 3, 4, 5]

Enter the Array Elements : 
5
3
2
4
5
3
Array After 4 Rotations to Left : 
5 3 5 3 2 4 
[5, 3, 5, 3, 2, 4]

*/