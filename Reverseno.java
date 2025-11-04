package J12;
import java.util.Scanner;
// write a java programme to reverse a number and check if the given string is palindrome or not
public class Reverseno 
{
	public static void main(String[] args) 
	{
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter the number:");
	int num=sc.nextInt();
		int rev=0;
		int temp=num;
		int rem;
		while(num!=0) 
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		System.out.println("reverse of  num is:"+rev);
		
		// verify if reverse no and given no are equal for palindrome
		if(rev==temp)
		{
			System.out.println("palindrome ");	
		}
		else 
		{
			System.out.println("Not Palindrome ");	
		}
	}
}
/*------------------------------------------------------------------------------
 C:\Users\Narsing Patil\OneDrive\Desktop>java Reverseno
 
Enter the number:
123456
reverse of  num is:654321
Not Palindrome

C:\Users\Narsing Patil\OneDrive\Desktop>java Reverseno
Enter the number:
12321
reverse of  num is:12321
palindrome
*/