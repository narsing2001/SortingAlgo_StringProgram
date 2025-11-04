package J12;
import java.util.*;

public class ExHandling {

	public static void main(String[] args) {
		String s1=null;
		try 
		{
		System.out.println(s1.length());
		}
		catch(NullPointerException n1) 
		{
		System.out.println(n1.getMessage()+" "+"Pointer Exception");
		}	
		System.out.println("A");
		try 
		{
		System.out.println(5/0);
		}
		catch(ArithmeticException e1)
		{
		System.out.println(e1.getMessage()+" "+"i.e.Arithmetic exception");
		}
		System.out.print("B");
    }
}
//----------------------------------------------------------------------------------
/*Cannot invoke "String.length()" because "s1" is null Pointer Exception
A
/ by zero i.e.Arithmetic exception
B*/