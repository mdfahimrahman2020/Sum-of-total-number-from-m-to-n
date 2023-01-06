import java.util.Scanner;
public class series{
	public static void main(String[] args)
	{
		System.out.print("\n\n\n\t\"Summation of Total Number\"");
		Scanner input = new Scanner(System.in);
		int m,n, sum = 0;

		System.out.print("\n\nEnter the Starting number : ");
		m = input.nextInt();
		System.out.print("\nEnter the Ending number : ");
		n = input.nextInt();

		for(int i = m; i <= n; i++)
		{
			sum = sum + i;
		    System.out.print(i+" ");

		}

		System.out.print("\nThe Summation of total numbers is : " +sum);
	






	}

}