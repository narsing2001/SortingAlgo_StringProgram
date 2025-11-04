package J12;

import java.util.*;
//Java programme to implement a thread to show the thread is Asynchronised(multiple multiple thread acces to same resources 
//can lead to inconsistancies in data use synchronization method to overcome conflict
class Account{
	int currbal;
	Account(int b)
	{
	currbal=b;
		
	}
	public boolean isSufficientBal(int wb) {
	if(currbal>wb) 
	return true;
	  else 
	return false;
      
	}
	public void withdraw(int wb)
	{
	 currbal=currbal-wb;
	 System.out.println("withdraw Sucessfully!");
	 System.out.println("Current Balance is:"+currbal);		
}
	}
class Customer implements Runnable
{
	Account h1;// Account class structure member can be accessed by structure member name dot function name
	
	String name;
	Customer(Account g1,String s1){
	h1=g1;
	name=s1;
	}
	public void run() {	
	Scanner sc=new Scanner(System.in);
	System.out.println(name+" "+"Enter Your withdraw Amount::");
	int amt=sc.nextInt();
	if(	h1.isSufficientBal(amt)) {
	h1.withdraw(amt);
	}
	else {
		System.out.println(name+"::"+"Insufficient Balance:");		
	}
	}
	}
public class AsyncThread {
public static void main(String[] args) {
/*	Scanner sc=new Scanner(System.in);
	Account a1=new Account(12000);
	System.out.print("Enter first Customer Name::");	
	String str1=sc.nextLine();
	Customer c1=new Customer(a1,str1);
	System.out.print("Enter Second Customer Name::");	
	String str2=sc.nextLine();
	Customer c2=new Customer(a1,str2);
	Thread t2=new Thread(c1);
	Thread t1=new Thread(c2);
	t1.start();
	t2.start();
	*/
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
	}}

/*C:\Users\Narsing Patil\OneDrive\Desktop>java AsyncThread
Enter first Customer Name::Narsing
Enter second Customer Name::Umeshrao
Narsing Enter Your withdraw Amount::
Umeshrao Enter Your withdraw Amount::
200
300
withdraw Sucessfully!
withdraw Sucessfully!
Current Balance is:11500
Current Balance is:11500

C:\Users\Narsing Patil\OneDrive\Desktop>javac AsyncThread.java

C:\Users\Narsing Patil\OneDrive\Desktop>java AsyncThread
Enter first Customer Name::Narsing
Enter second Customer Name::Patil
Narsing Enter Your withdraw Amount::
Patil Enter Your withdraw Amount::
200
withdraw Sucessfully!
Current Balance is:11800
4000
withdraw Sucessfully!
Current Balance is:7800
---------------------------------------------------------------------
---------------------------------------------------------------------
Enter first Customer Name::Narsing
Enter second Customer Name::Patil
Patil Enter Your withdraw Amount::
Narsing Enter Your withdraw Amount::
200                                             //best output for the Parallel access of same resouce i.e Asynchronization method
300
withdraw Sucessfully!
Current Balance is:11500
withdraw Sucessfully!
Current Balance is:11500
----------------------------------------------------------------------
Enter first Customer Name::Narsing Umeshrao Patil
Enter second Customer Name::Umeshrao Patil
Umeshrao Patil Enter Your withdraw Amount::
Narsing Umeshrao Patil Enter Your withdraw Amount::
400
500
withdraw Sucessfully!
Current Balance is:11100
withdraw Sucessfully!
Current Balance is:11100
----------------------------------------------------------------------
C:\Users\Narsing Patil\OneDrive\Desktop>java AsyncThread
Enter first Customer Name::Narsing Umeshrao Patil
Enter second Customer Name::Umeshrao Laxmanrao Patil
Narsing Umeshrao Patil Enter Your withdraw Amount::
Umeshrao Laxmanrao Patil Enter Your withdraw Amount::
2000
withdraw Sucessfully!
Current Balance is:10000
--------------------------------------------------------
Enter first Customer Name::
Narsing
Enter second Customer Name::
Patil
Narsing Enter Your withdraw Amount::
Patil Enter Your withdraw Amount::
400
300
withdraw Sucessfully!
Current Balance is:11300
withdraw Sucessfully!
Current Balance is:11300


*/
