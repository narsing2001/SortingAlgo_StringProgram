package J12;
//java programme to reverse each word in the given string sentence

import java.util.Scanner;
public class ReverseEachWord 
{
public static String reverseword(String str)
{
	//split the string into words
	String[] words=str.split(" ");
	
	//string builder to store the final result
	StringBuilder reversedString=new StringBuilder();
			
	
	//loop through each words in the array
	for(String word:words) 
	{
		//reverse the current word 
		StringBuilder reverseword=new StringBuilder(word);
		reverseword.reverse();
		
		//append the reverse word to the result
		reversedString.append(reverseword).append(" ");
	}
	
	//convert stringbuilder to string and return	
	return reversedString.toString().trim();
}
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a Sentencial string::");
		String sentence=sc.nextLine();
		String result=reverseword(sentence);
		System.out.println("original sentence:"+sentence);
		System.out.println("reverse words:"+result);
	}
}
/*-------------------------------------------------------------
Enter a Sentencial string::java is good thing in life
original sentence:java is good thing in life
reverse words:avaj si doog gniht ni efil
----------------------------------------------------------------

C:\Users\Narsing Patil\OneDrive\Desktop>javac ReverseEachWord.java
C:\Users\Narsing Patil\OneDrive\Desktop>java ReverseEachWord

Enter a Sentencial string::my name is narsing patil  and i am a BE graduate student from dr dy patil college of engineering and innovation

original sentence:my name is narsing patil  and i am a BE graduate student from dr dy patil college of engineering and innovation

reverse words:ym eman si gnisran litap  dna i ma a EB etaudarg tneduts morf rd yd litap egelloc fo gnireenigne dna noitavonni

*/
