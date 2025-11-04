package J12;
//java programme to find fibonacci series take input from the user
import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the no want to  find fibonacci series:");
		int num=sc.nextInt();
		int num1=0;
		int num2=1;
		for(int i=0;i<=num;i++) 
		{
		System.out.print(num1+" ");
		int num3=num1+num2;
		num1=num2;
		num2=num3;
		
		}
	}
}
/*------------------------------------------------------------------------------------------------
Enter the no want to  find fibonacci series:
10
0 1 1 2 3 5 8 13 21 34 55 
*/