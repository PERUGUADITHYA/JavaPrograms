package Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddPlacesExchange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the Array Elements: ");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		evenOddExchange(array, size);
		zeros();
		zerosmiddle(array, size);
		sc.close();

	}
	public static void evenOddExchange(int array[],int n) {
		int []check = new int[n];
		int count=0,c1=n;
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				check[count]=array[i];
				count++;
			}
			if(array[i]%2!=0) {
				check[c1-1]=array[i];
				c1--;
			}
		}
		System.out.println("Odd Numbers at the last of the Array : ");
		System.out.println(Arrays.toString(check));
	}
	public static void zeros() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the Array Elements: ");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		int []check = new int[size];
		int count=0,c1=size;
		for(int i=0;i<array.length;i++) {
			if(array[i]!=0) {
				check[count]=array[i];
				count++;
			}
			if(array[i]==0) {
				check[c1-1]=array[i];
				c1--;
			}
		}
		System.out.println("Zeros at the last of the Array : ");
		System.out.println(Arrays.toString(check));
		sc.close();
	}
	public static void zerosmiddle(int array[],int n) {
		int []check = new int[n];
		int count=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0 && array[i]!=0) {
				check[count]=array[i];
				count++;
			}
			}
		int c1 = count;
		for(int i=0;i<array.length;i++) {
			if(array[i]==0) {
				check[c1]=array[i];
				c1++;
			}
			}
		int c2 = c1;
		for(int i=0;i<array.length;i++) {
			if(array[i]%2!=0) {
				check[c2]=array[i];
				c2++;
			}
			}
		
		System.out.println("Zeros in the Middle Of Array : ");
		System.out.println(Arrays.toString(check));
	}
	

}

/*

Enter the Size of the Array: 
9
Enter the Array Elements: 
2
0
0
7
9
2
4
6
0
Odd Numbers at the last of the Array : 
[2, 0, 0, 2, 4, 6, 0, 9, 7]
Enter the Size of the Array: 
6
Enter the Array Elements: 
9
8
0
0
7
8
Zeros at the last of the Array : 
[9, 8, 7, 8, 0, 0]
Zeros in the Middle Of Array : 
[2, 2, 4, 6, 0, 0, 0, 7, 9]

*/
