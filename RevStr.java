package J12;

import java.util.Scanner;
//reverse of string using charAt(i) and char variable
public class RevStr 
{
	public static void main(String[] args) 
	{
		//create a scanner object to take input from user
				Scanner sc=new Scanner(System.in);
				
				//ask the user to enter a string 
				System.out.print("Enter a string for reverse operation:");
				String input=sc.nextLine();
				//initialize an empty string to store the reverse string
				char ch;
				String reverse="";
				//loop through the string in reverse order and append characters to 'reverse'
				for(int i=0;i<=input.length()-1;i++)
				{
					//concatenate character in reverse order
					ch=input.charAt(i);
					reverse=ch+reverse;					
				}
				System.out.println("Reversed String of is::"+reverse);
	}
}

/*===============================================================================
Enter a string for reverse operation:my name is narsing
Reversed String of is::gnisran si eman ym
---------------------------------------------------------------------------

C:\Users\Narsing Patil\OneDrive\Desktop>java RevStr
Enter a string for reverse operation: are you struggling an importance of the reverse of the string
Reversed String of is:: gnirts eht fo esrever eht fo ecnatropmi na gnilggurts uoy era

*/
