package J12;
import java.util.*;
// implementation of the Circular Queue using Array Data structure

class CirQueue
{
	Scanner sc =new Scanner(System.in);
	
	 private final int MAXSIZE=10;
	 private int queue[]=new int[MAXSIZE];
	 private int front=0;
	 private int rear=-1;
	 int m;
//------------insert--code------------------------------------------------------------------------------------------------------
	 void insert() 
	 {
		 int n;
		
		 if((rear+1)%MAXSIZE==front)
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
				 
				 rear=(rear+1)%MAXSIZE;
				 queue[rear]=n;
				
				 System.out.println("Inserted element is::"+n);
			 }
			 
		 }
	 }
//------delete code------------------------------------------------------------------------------------------------------------------
	        void delete() 
	        {
	        	if(rear==-1 && front==-1)
	        	{
	        		System.out.println("Queue is empty...?:");
	        	}
	        	else
	        	{
	        		int n=queue[front];
	        		System.out.println("Deleted element is::"+n);
	        		
	        		if(front==rear) 
	        		{
	        			front=-1;
	        			rear=-1;
	        		}
	        		
	        	        		
	        		front=(front+1)%MAXSIZE;
	        			        	  		
	        	}
	        	
	        }
//------display code----------------------------------------------------------------------------------------------------------------------
	        void display() 
	        { 
	        	int i;
	        	if(rear==-1 && front==-1) 
	        	{
	        		System.out.println("Queue is Empty......");
	        	}
	        	else
	           {
	        	System.out.println("Element of queue are::");
	        	for(i=front;i!=rear;i=(i+1)%MAXSIZE)
	        	{
	        	
	        		System.out.println(queue[i]+" ");
	        	}
// this statement will display last element of the queue after before any insertion and deletion operation
	         	System.out.println(queue[i]);
	           }        		
	        }	        
}

public class CircularQueue 
{
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
//===================================================================================================
/*
C:\Users\Narsing Patil\OneDrive\Desktop>java CircularQueue
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element for insert::10
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element for insert::20
Inserted element is::20
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element for insert::30
Inserted element is::30
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element for insert::40
Inserted element is::40
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element for insert::50
Inserted element is::50
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element for insert::60
Inserted element is::60
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
Element of queue are::
0
20
30
40
50
60
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::4
----------------------------------------------------------
Please enter valid Choice::

C:\Users\Narsing Patil\OneDrive\Desktop>javac CircularQueue.java

C:\Users\Narsing Patil\OneDrive\Desktop>java CircularQueue
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element for insert::10
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element for insert::20
Inserted element is::20
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element for insert::30
Inserted element is::30
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element for insert::40
Inserted element is::40
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element for insert::50
Inserted element is::50
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element for insert::60
Inserted element is::60
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element for insert::70
Inserted element is::70
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
Element of queue are::
0
20
30
40
50
60
70
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::2
----------------------------------------------------------
Deleted element is::0
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::2
----------------------------------------------------------
Deleted element is::20
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::4
----------------------------------------------------------
Please enter valid Choice::

C:\Users\Narsing Patil\OneDrive\Desktop>javac CircularQueue.java

C:\Users\Narsing Patil\OneDrive\Desktop>java CircularQueue
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element for insert::10
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element for insert::20
Inserted element is::20
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element for insert::30
Inserted element is::30
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element for insert::40
Inserted element is::40
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element for insert::40
Inserted element is::40
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element for insert::50
Inserted element is::50
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
Element of queue are::
0
20
30
40
40
50
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::2
----------------------------------------------------------
Deleted element is::0
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
Element of queue are::
20
30
40
40
50
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::2
----------------------------------------------------------
Deleted element is::20
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
Element of queue are::
30
40
40
50
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::2
----------------------------------------------------------
Deleted element is::30
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
Element of queue are::
40
40
50
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element for insert::100
Inserted element is::100
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
Element of queue are::
40
40
50
100
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element for insert::60
Inserted element is::60
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
Element of queue are::
40
40
50
100
60
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::2
----------------------------------------------------------
Deleted element is::40
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
Element of queue are::
40
50
100
60
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::4
----------------------------------------------------------
Please enter valid Choice::*/

