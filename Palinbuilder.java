package J12;

import java.util.Scanner;

public class Palinbuilder {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("enter the string:");
		String str=sc.nextLine();
        str=str.toLowerCase();
		StringBuilder rev=new StringBuilder(str);
		rev.reverse();
		if(rev.toString().equals(str)) 
		{
			System.out.print("String is Palindrome");
			
		}else 
		{
			System.out.print("String is not Palindrome:");	
		}
	}

}
