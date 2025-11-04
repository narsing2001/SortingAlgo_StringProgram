package J12;
import java.util.*;
// using combine of string builder and string buffer
public class StrBuild {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
// enter a string want to reverse using string builder---------------------------------------------------------------
		System.out.print("Enter a first string using string builder::");
		String str1=sc.nextLine();
		StringBuilder sB=new StringBuilder(str1);
		String reverse1=sB.reverse().toString();
		System.out.println("reversed of Stringbuilder:"+reverse1);
		System.out.println("--------------------------------------------------------------------------------------------------");
		
//reverse a string using string buffer----------------------------------------------------------------------------------------------	
		System.out.print("Enter a second string using string buffer::");
		String str2=sc.nextLine();
	    StringBuffer sb=new StringBuffer(str2);
	    String reverse2=sb.reverse().toString();
	    System.out.println("reversed of StringBuffer is:"+reverse2);
	
	
	
	}
}

/*
 -------------------------------------------------------------------------------------
 Enter a string::GNISRAN SI EMAN YM
reversed of String is:MY NAME IS NARSING
-------------------------------------------------------------------------
Enter a string::Friends
reversed of String is:sdneirF
-------------------------------------------------------------------------
Enter a first string using string builder::Narsing
reversed of Stringbuilder:gnisraN
--------------------------------------------------------------------------------------------------
Enter a second string using string buffer::Patil
reversed of StringBuffer is:litaP
------------------------------------------------------------------------------------------

C:\Users\Narsing Patil\OneDrive\Desktop>java StrBuildBuff
Enter a first string using string builder::My Name is Narsing
reversed of Stringbuilder:gnisraN si emaN yM
--------------------------------------------------------------------------------------------------
Enter a second string using string buffer::My Name is Patil
reversed of StringBuffer is:litaP si emaN yM

*/