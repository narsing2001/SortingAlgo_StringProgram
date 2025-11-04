package J12;

public class ExceptionMod2 {

	public static void main(String[] args) {
		System.out.print("A"+" ");
		String s1=null;
		try {
			System.out.println(5/0);
		}
		catch(ArithmeticException e3) {
			
		}
		finally {
			System.out.println("z");
		}
		try 
		{
		System.out.println(s1.length());
		}
		
		catch(ArrayIndexOutOfBoundsException e2)
		{
		
		}
	 catch(NullPointerException e1) 
		{
		
		}
		finally 
		{
		System.out.print("B"+" ");
		}
		System.out.println("C");
	}
}

//-------------------------------------------------------------------
//A Exception in thread "main" B java.lang.NullPointerException: Cannot invoke "String.length()" because "s1" is null
//at j1/J12.ExceptionMod2.main(ExceptionMod2.java:10)
/* A z
   B C */

