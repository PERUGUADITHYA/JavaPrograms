import java.util.Scanner;

public class PyramidReverse {

	public static void printPattern(int n)
	{
		int i,j;
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			//n--;
		}
	}


	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		printPattern(n);
	}

}
