package J12;
import java.util.Scanner;
public class PalindromeChecker 
{
	// declare a method to check if string is palindrome
	public static boolean isPalindrome(String str)
	{
		int left=0;
		int right=str.length()-1;
		
		//convert the string to lowercase to ignore case sensitivity
	    // str=str.toLowerCase();
	     
		while(left<right) 
		{
			//if character at both ends does not match,it's not a palindrome
			if(str.charAt(left)!=str.charAt(right)) 
			{
				return false;
			}
			// move the left pointer towards the center
			left++;
			//move the right pointer towards center
			right--;	
		}
		return true;
		}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//ask the user to enter a string 
		System.out.print("enter the string::");
		String input=sc.nextLine();
		//call the method to check if the string is palindrome
		if(isPalindrome(input))
		{
			System.out.println("The string"+" "+input+" "+"is a palindrome.");
		}
		else 
		{
			System.out.println("The string"+" "+input+" "+"is a not palindrome.");
		}
	}
}
/*=========================================================================================
 the condition==> str=str.toLowerCase();  must to check to ignore case sensitivity
 ------------------------------------------------------------------------------------
suppose string is case sensitive than::----------------------
enter the string::Refer
The string Refer is a not palindrome.
 ---------------------------------------------------------------------------------
suppose ignore case sensitive  using str=str.toLowerCase(); than::----------------------
enter the string::Refer
The string Refer is a palindrome.

-------------------------------------------------------------------------------------
above string is palindrome if str=str.toLowerCase(); is used

C:\Users\Narsing Patil\OneDrive\Desktop>javac PalindromeChecker.java

C:\Users\Narsing Patil\OneDrive\Desktop>java PalindromeChecker
enter the string::Racecar
The string Racecar is a palindrome.

C:\Users\Narsing Patil\OneDrive\Desktop>java PalindromeChecker
enter the string::refer
The string refer is a palindrome.

C:\Users\Narsing Patil\OneDrive\Desktop>my name is narsing
'my' is not recognized as an internal or external command,
operable program or batch file.

C:\Users\Narsing Patil\OneDrive\Desktop>java PalindromeChecker
enter the string::my name is narsing
The string my name is narsing is a not palindrome.*/
