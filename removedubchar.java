package J12;
import java.util.*;
// write a java programme to remove Duplicate Character In Words in given sentence and maintain spaces.
import java.util.Scanner;

public class removedubchar 
{
	public static String removeDuplicateCharacterInWords(String sentence)
	{
		// split the sentence into the words
		String[] words=sentence.split("(?<=\\s)|(?<=\\\\s)");
		
		StringBuilder result=new StringBuilder();
		
		//iterate through each word and remove duplicate characters
		for(String word:words) 
		{
			if(word.trim().isEmpty()) 
			{
				// if the word is just spaces ,append them directly
				result.append(word);	
			}
			else 
			{
				//use linkedHashset to maintain order and remove duplicate 
				LinkedHashSet<Character> unique=new LinkedHashSet<>();
				
				// process each character of the word
				for(int i=0;i<word.length();i++)
				{
					unique.add(word.charAt(i));
				}
				//append unique character of the word to result
				for(char ch:unique)
				{
					result.append(ch);	
				}
			}	
		}
		return result.toString();	
	}

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String input=sc.nextLine();
		
		// process the result
		String process=removeDuplicateCharacterInWords(input);
		
		//print the  process string
		System.out.println("Processed Sentence:"+process);
	}
}
/*------------------------------------------------------------------------------------
 Enter a string:java is secure multithreaded and portable programming language
Processed Sentence:jav is secur multihread and portable progamin langue
------------------------------------------------------------------------------------------
C:\Users\Narsing Patil\OneDrive\Desktop>java  removedubchar
Enter a string:learning full stack developer is good thing in programming
Processed Sentence:learnig ful stack devlopr is god thing in progamin
*/
