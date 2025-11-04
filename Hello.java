package J12;
import java.util.Scanner;

class BankDetails{
	private String accno;
	private String name;
	private String acc_type;
	private long balance;
	Scanner sc=new Scanner(System.in);
	//method to open new account
	public void openAccount() 
	{
		System.out.println("enter Account number:");
		accno=sc.next();
		System.out.println("enter Account type:");
		acc_type=sc.next();
		System.out.println("enter Account holder name:");
		name=sc.next();
		System.out.println("enter balance:");
		balance=sc.nextLong();		
	}
	
	public void showAccount() 
	{	
		System.out.println("Name of Account holder:"+ name);
		System.out.println("Account no:"+ accno);
		System.out.println("Account type:"+ acc_type);
		System.out.println("Account Balance:"+balance);		
	}
	
	public void deposite() {
	long amt;
	System.out.println("Enter Deposite Amount:");
	amt=sc.nextLong();
	balance+=amt;	
	}
// method to withdraw money
	public void withdrawal()
	{
		long amt;
		System.out.println("enter the amount you want to withdraw:");
		amt=sc.nextLong();
		if(balance>=amt) {
			
			balance=balance-amt;
			System.out.println("Balance after withdrawal:"+balance);
		}
			else {
				
				System.out.println("your balance is less than"+amt+"\ttransaction failed....!!");
			}
		}
	
	
//method to search an account no
public boolean search(String ac_no) {
	if(accno.equals(ac_no)) {
		showAccount();
		return (true);
	}
	return (false);
}
	
	
}	

public class Hello {

	public static void main(String[] args) 
	{
		//BankDetails bd=new BankDetails();
		Scanner sc=new Scanner(System.in);
		System.out.print("how many number of customer do you want to input?:");
		int n=sc.nextInt();
		BankDetails c[]=new BankDetails[n];
		for(int i=0;i<c.length;i++) 
		{
			c[i]=new BankDetails();
			c[i].openAccount();	
		}
		
		int ch;
		do {
			System.out.println("Banking System Application:-------------------------------------------------------");
			System.out.println("1.Display all account details:");
			System.out.println("2.Search account no:");
			System.out.println("3.Deposite the amount:");
			System.out.println("4.withdraw the amount:");
			System.out.println("------------------------------------------------------------------------------");
			System.out.print("Enter your choice:");
			ch=sc.nextInt();
			System.out.println("Switch Execution start--------------------------------------------------");
			switch(ch)
			{
			case 1:
				for(int i=0;i<c.length;i++) 
				{
				  c[i].showAccount();	
				}
			    break;
			case 2:
				System.out.print("enter account no want ot search:");
				String ac_no=sc.next();
				boolean found=false;
				for(int i=0;i<c.length;i++) 
				{
				found=c[i].search(ac_no);
				if(found) {
					break;
				}
				
				if(!found) {
					System.out.println("search failed!Account doesn't exist..!!");
				}		
				}
				break;
			case 3:
				System.out.print("enter Account no.:");
				ac_no=sc.next();
				found=false;
				for(int i=0;i<c.length;i++)
				{
					found=c[i].search(ac_no);
					if(found) 
					{
						c[i].deposite();
						break;
					}	
				}
				if(!found)
				{
					System.out.println("search failed!Account doesn't exist..!!");
				}
					break;
			case 4:
				System.out.println("enter account no:");
				ac_no=sc.next();
				found=false;
				for(int i=0;i<c.length;i++)
				{
					found=c[i].search(ac_no);
				
			     if(found) {
			    	 c[i].withdrawal();
			    	 break;
			     }
				}
			
			
				if(!found)
				{
					System.out.println("search failed!Account doesn't exist..!!");
				}
				
				break;
			case 5:System.out.println("see you soon.....");
			           break;
			}	
		}
		while(ch!=5);
	}

}
