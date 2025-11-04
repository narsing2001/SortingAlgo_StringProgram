package J12;
import java.util.Scanner;
//java programme to print unique character(non repetative) in  the given string

public class printuniquechar
{
	public static void PrintUniqueChar(String str) 
	{
		//convert the string to lowercase and remove spaces
		str=str.toLowerCase().replaceAll("\\s","");
		
		//iterate through a each string to check each character uniqueness
		System.out.println("unique character in the string::");
		for(int i=0;i<str.length();i++) 
		{
			char currentchar=str.charAt(i);
			boolean isunique=true;
			
			//check if the character appears more than once
			for(int j=0;j<str.length();j++)
			{
				if(i!=j && currentchar==str.charAt(j))
				{
					isunique=false;
					break;
					
				}
			}
			
			//if the character is unique print it
			if(isunique) 
			{
				System.out.print(currentchar+" ");
			}
		}	
		
	}

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string:");
	String input=sc.nextLine();
	PrintUniqueChar(input);

	}
}
/*-----------------------------------
Enter a string:my name is narsing
unique character in the string::
y e r g
*/
