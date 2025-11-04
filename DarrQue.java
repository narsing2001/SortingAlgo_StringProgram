package J12;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

CirQueue
{
	Scanner sc =new Scanner(System.in);
//	private int MAXSIZE=Math.max(MAXSIZE,queue.size());
	 private int front,rear=-1;
	// private int rear=-1;
	Queue<Integer> queue=new LinkedList<Integer>();	
	int m;
	//------------insert--code------------------------------------------------------------------------------------------------------
		 void insert() 
		 {
			 int n;
			
			 if((rear+1)%(queue.size())==front)
			 {
				 System.out.println("Queue is overflow......!");
			 }
			 else
			 { 
				 
				 System.out.print("Enter an element for insert::");
				  n=sc.nextInt();
				 if(rear==-1 && front==-1) 
				 {
					 front=0;
					 rear=0;
					
				 }
				 else
				 {
					 
					 rear=(rear+1)%(queue.size());
					 queue[rear]=n;
					
					 System.out.println("Inserted element is::"+n);
				 }
				 
			 }
	
}

public class DarrQue {

	public static void main(String[] args) throws Exception
	{
		int choice;
		Scanner sc =new Scanner(System.in);
		CirQueue m=new CirQueue();	
	do 
	{
	  System.out.println("---------------------Circular-Queue-Menu----------------------");
	  System.out.println("1.Insert");
	  System.out.println("2.Delete");
	  System.out.println("3.Display");
	  System.out.println("4.exit");
	  System.out.println("----------------------------------------------------------");
	  System.out.print("Enter your choice::");
	  choice=sc.nextInt();
	  System.out.println("----------------------------------------------------------");
	  switch(choice) 
	  {
	  case 1:m.insert();
	           break;
	  case 2:m.delete();
	           break;
	  case 3:m.display();
	           break;
	  case 4:
		  default:System.out.println("Please enter valid Choice::");
		  break;
	  }
		}
		while(choice!=4);

	}

}
