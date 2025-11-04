package J12;
import java.util.Arrays;
import java.util.Scanner;
/*two string are anagram if:
------------------------------------------------------------------------
 1)two string have same length
 2)contain the same character
 3)have the same number of occurrences of each character 
*/
public class Anagram 
{
public static void main(String[] args) 
	{
		// create object of scanner class
		Scanner sc=new Scanner(System.in);
		
		//take input from user
		System.out.print("Enter first string:");
		String str1=sc.nextLine();
		System.out.print("Enter second string:");
		String str2=sc.nextLine();
		
		//converting both string to lowercase
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.length()!=str2.length())
		{
			System.out.println(str1+" "+"and"+" "+str2+" "+"are not Anagram");
		}
		else {
		
		//convert string to character array
		char[] charArray1=str1.toCharArray();
		char[]charArray2=str2.toCharArray();
		
		//sort the char array
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		//if sorted char array are same than string is anagram
		
		boolean result=Arrays.equals(charArray1, charArray2);
		
		if(result==true)
		{
			System.out.println(str1+" "+"and"+" "+str2+" "+"are Anagram");
		}
		else 
		{
			System.out.println(str1+" "+"and"+" "+str2+" "+"are not Anagram");
		}
	}
   
	}

}
