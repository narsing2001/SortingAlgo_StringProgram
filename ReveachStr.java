package J12;
import java.util.Scanner;

public class ReveachStr {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		String word[]=str.split("\\s");
		String rev="";
		for(String s:word)
		{
			StringBuffer sb=new StringBuffer(s);
			sb.reverse();
			rev+=sb.toString()+" ";
			
		}
   System.out.println("Reverse each word in given string:"+rev.trim());
	}
}
/*------------------------------------------------------------
Enter the String:
my nam eis narsing patil And
Reverse each word in given string:ym man sie gnisran litap dnA
*/
