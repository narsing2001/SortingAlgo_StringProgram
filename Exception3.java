package J12;
import java.util.*;

public class Exception3 {

	public static void main(String[] args) {
		int cb=10000;
		Scanner sc=new Scanner(System.in);
		int wb=sc.nextInt();
		try 
		{
		if(cb<wb)
		{
			throw new ArithmeticException("Insufficient balance.");
		}
		cb=cb-wb;
		System.out.println("Transaction Sucessful");
		System.out.println("Current Balance is:"+cb);
		}
		catch( ArithmeticException e1)
		{
			System.out.println(e1.getMessage());	
			System.out.println("Current Balance is:"+cb);
		}
	}
	}
//-------------------------------------------------------------------------
/*Enter Withdraw Amount::500
Transaction Sucessful
Current Balance is:9500
----------------------------------------------------------
C:\Users\Narsing Patil\OneDrive\Desktop>javac Exception3.java

C:\Users\Narsing Patil\OneDrive\Desktop>java Exception3
Enter Withdraw Amount::14000
Insufficient balance.
Current Balance is:10000*/