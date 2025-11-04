package J12;
import java.util.Scanner;
public class ReverseString 
{
// reverse of the string using FOR Loop
	public static void main(String[] args)
	{
		
		//create a scanner object to take input from user
		Scanner sc=new Scanner(System.in);
		
		//ask the user to enter a string 
		System.out.print("Enter a string for reverse operation:");
		String input=sc.nextLine();
		//initialize an empty string to store the reverse string
		String reverse="";
		//loop through the string in reverse order and append characters to 'reverse'
		for(int i=input.length()-1;i>=0;i--)
		{
			//concatenate character in reverse order
			reverse+=input.charAt(i);
		}
		System.out.println("Reversed String of"+" "+input+" "+"is::"+reverse);
	}

}
/*===========================================================================================================
C:\Users\Narsing Patil\OneDrive\Desktop>java ReverseString
Enter a string for reverse operation:GNISRAN
Reversed String of GNISRAN is::NARSING

C:\Users\Narsing Patil\OneDrive\Desktop>java ReverseString
Enter a string for reverse operation:REFER
Reversed String of REFER is::REFER

C:\Users\Narsing Patil\OneDrive\Desktop>java ReverseString
Enter a string for reverse operation:++c
Reversed String of ++c is::c++*/