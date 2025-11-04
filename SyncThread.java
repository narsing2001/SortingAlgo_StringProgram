package J12;
import java.util.Scanner;
//Java programme to implement a thread to show the thread is synchronised (multiple multiple thread acces to same resources but one proceed and commit at time
//can lead to consistancies in data use synchronization method to remove conflict
class Account{
	int currbal;
	Account(int b)
	{
	currbal=b;
		
	}
	public boolean isSufficientBal(int wb)
	{
	if(currbal>wb) 
	return true;
	  else 
	return false;
    
	}
	public void withdraw(int wb)
	{
	 currbal=currbal-wb;
	 System.out.println("withdraw Sucessfully");
	 System.out.println("Current Balance is:"+currbal);		
}
	}
class Customer implements Runnable
{
	Account h1;// Account class structure member can be accessed by structure member name dot function name
	
	String name;
	Customer(Account g1,String s1)
	{
	h1=g1;
	name=s1;
	}

	public void run() 
	{	
	
	Scanner sc=new Scanner(System.in);
	System.out.println(name+" "+"Enter Your withdraw Amount::");
	int amt=sc.nextInt();
	synchronized(h1) 
	{
	if(	h1.isSufficientBal(amt)) 
	{
	   System.out.println(name+" ");
		h1.withdraw(amt);
		
	}
	else 
	{
		System.out.println(name+"::"+"Insufficient Balance:");		
	}
	}
	}
	}
public class SyncThread {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter first Customer Name::");	
		String str1=sc.nextLine();
	    System.out.println("Enter second Customer Name::");	
		String str2=sc.nextLine();
		Account a1=new Account(12000);
		Customer c1=new Customer(a1,str1);
	    Customer c2=new Customer(a1,str2);
		Thread t1=new Thread(c1);
		Thread t2=new Thread(c2);
		t1.start();
		t2.start();
		}
}
//----------------------------------------------------------------
/* Achieved Synchronization through  using synchronization()  method-keyword and write change invoked code
 --------------------------------------------------------------------------------
C:\Users\Narsing Patil\OneDrive\Desktop>java SyncThread
Enter first Customer Name::
Narsing
Enter second Customer Name::
Patil
Narsing Enter Your withdraw Amount::
500
Narsing
withdraw Sucessfully!
Current Balance is:11500
Patil Enter Your withdraw Amount::
3000
Patil
withdraw Sucessfully!
Current Balance is:8500
------------------------------------------------------------------
--------------------------------
C:\Users\Narsing Patil\OneDrive\Desktop>java SyncThread
Enter first Customer Name::
Narsing
Enter second Customer Name::
Shubham
Narsing Enter Your withdraw Amount::
700
Narsing
withdraw Sucessfully!
Current Balance is:11300
Shubham Enter Your withdraw Amount::
3300
Shubham
withdraw Sucessfully!
Current Balance is:8000
------------------------------------------------------
Enter first Customer Name::
Narsing
Enter second Customer Name::
Patil
Narsing Enter Your withdraw Amount::
Patil Enter Your withdraw Amount::
4000
5500
withdraw Sucessfully!
Current Balance is:2500
withdraw Sucessfully!
Current Balance is:2500
------------------------------------------------------
Enter first Customer Name::
Narsing
Enter second Customer Name::
Umeshrao
Narsing Enter Your withdraw Amount::
5500
Narsing
withdraw Sucessfully!
Current Balance is:6500
Umeshrao Enter Your withdraw Amount::
3500
Umeshrao
withdraw Sucessfully!
Current Balance is:3000
*/
