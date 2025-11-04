package J12;
//java programme to print only non-duplicate character in the given sentence containing word 
import java.util.Scanner;

public class uniqueword 
{
	public static void PrintUniqueChar(String str) 
	{
		String []words=str.split("\\s+");
		
		//iterate through each word
		for(String word:words)
		{
         //create boolean array to store the occurence of the each character	
		 boolean[] charPresent=new boolean[256];
		 boolean[] repeated=new boolean[256];
		 
		 // iterate through character of the word
		
		for(int i=0;i<word.length();i++)
		 {
			char ch=word.charAt(i);
			if(charPresent[ch])
			{
		       //mark character as repeated if they are appear more than once  
				repeated[ch]=true;		
			}
			else 
			{
				//mark character as present 
				charPresent[ch]=true;	
			}
		}
		 //print unique character(not repeated) in the current word
		 System.out.print("Unique character in:"+word+":");
		 for(int i=0;i<word.length();i++) 
		 {
			 char ch=word.charAt(i);
			 if(charPresent[ch] && !repeated[ch] || ch==' ') 
			 {
				 System.out.print(ch);
			}
		 }
		 System.out.println();
	}
}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String input=sc.nextLine();
	
		System.out.println("unique character in\""+input+"\":");
		PrintUniqueChar(input);

	}

}
/*---------------------------------------------------------------------
 Enter a string:java is good programming language
unique character in"java is good programming language":
Unique character in:java:jv
Unique character in:is:is
Unique character in:good:gd
Unique character in:programming:poain
Unique character in:language:lnue
---------------------------------------------------------------
C:\Users\Narsing Patil\OneDrive\Desktop>javac uniqueword.java

C:\Users\Narsing Patil\OneDrive\Desktop>java uniqueword
Enter a string:my name is narsing Patil
unique character in"my name is narsing Patil":
Unique character in:my:my
Unique character in:name:name
Unique character in:is:is
Unique character in:narsing:arsig
Unique character in:Patil:Patil

*/
