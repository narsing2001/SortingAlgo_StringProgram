package J12;
import java.util.Scanner;

public class Swappingtwo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first no:");
		int a=sc.nextInt();
		System.out.println("ente second no");
		int b=sc.nextInt();
		System.out.println("before swapping are a="+a+"and b"+b);
// using two variable swapping using add and sub-------------------------------------------------------------------------------------------------------
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("addition substraction two variable start");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after add and sub swapping a="+a+"and b="+b);
		System.out.println("addition substraction two variable end");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
//two variable swapping using XOR------------------------------------------------------------------------------------------------------------
		System.out.println("XOR swapping start");
		a=a^b;
		b=a^b;
		a=a^b;
	    System.out.println("after XOR swapping a="+a+"and b="+b);
		System.out.println("XOR swapping end");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
//two variable swap using multi and division-----------------------------------------------------------------------------------------------------------
		System.out.println("multi division two variable swap start");
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("after add and sub swapping a="+a+"and b="+b);
		System.out.println("multi division two variable swap end");		
	}
}
/*---------------------------------------------------------------------------------------------------------------------------------
enter first no:
	10
	ente second no
	20
	before swapping are a=10and b20
	-------------------------------------------------------------------------------------------------------------
	addition substraction two variable start
	after add and sub swapping a=20and b=10
	addition substraction two variable end
	-------------------------------------------------------------------------------------------------------------
	XOR swapping start
	after XOR swapping a=10and b=20
	XOR swapping end
	-------------------------------------------------------------------------------------------------------------
	multi division two variable swap start
	after add and sub swapping a=20and b=10
	multi division two variable swap end
*/
