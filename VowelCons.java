package J12;
// java programme  to find total no of vowel and consonant in the given string 
import java.util.Scanner;

public class VowelCons 
{
  static void VowelConsonantCount(String str1) 
	{
		int vowel=0;
		int consonant=0;
		str1=str1.toLowerCase();
		for(char ch:str1.toCharArray()) 
		{
			if(ch>='a' && ch<='z' ) 
			{
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') 
				{
					vowel++;
				}
				else 
				{
				consonant++;	
				}
		   }
		}
		System.out.println("count of vowels in the given string="+vowel);
		System.out.println("count of consonant in the given string="+consonant);
	}
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a string=");
		String str=sc.nextLine();
		VowelConsonantCount(str);
	}
}
/*----------------------------------------------------------------------------------------------
Enter a string=my name is narsing patil
count of vowels in the given string=7
count of consonant in the given string=13
------------------------------------------------------------------------------------------

C:\Users\Narsing Patil\OneDrive\Desktop>java  VowelCons
Enter a string=are you stupid man
count of vowels in the given string=7
count of consonant in the given string=8

*/
