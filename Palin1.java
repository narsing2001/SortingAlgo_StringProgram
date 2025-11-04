package J12;
import java.util.Scanner;
//check given string is palindrome or not using equals method

public class Palin1 {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("enter the string:");
		String str=sc.nextLine();
		str=str.toLowerCase();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) 
		{
			rev+=str.charAt(i);
		}
		if(rev.equals(str))
		{
			System.out.println("yes,String is palindrome:");
		}else
		{
		System.out.println("string is not Palindrome");
		}
		}

	}

/*=================================================================================================================
C:\Users\Narsing Patil\OneDrive\Desktop>javac Palin1.java

C:\Users\Narsing Patil\OneDrive\Desktop>java Palin1
enter the string:
gahashs
string is not Palindrome

C:\Users\Narsing Patil\OneDrive\Desktop>javac Palin1.java

C:\Users\Narsing Patil\OneDrive\Desktop>java Palin1
enter the string:Refer
string is not Palindrome
----------------------------------------------------------------
string is case sensitivity language  so that conversion of total string into lowe case or upper case is needed
use:str=str.toLowerCase(); or str=str.toupperCase();  is needed as per the above outcomes

C:\Users\Narsing Patil\OneDrive\Desktop>javac Palin1.java

C:\Users\Narsing Patil\OneDrive\Desktop>java Palin1
enter the string:Refer
yes,String is palindrome:
*/