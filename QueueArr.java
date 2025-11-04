package J12;
import java.util.Scanner;

class MyQueue
{
	Scanner sc =new Scanner(System.in);
	
	 private final int MAXSIZE=10;
	 private int queue[]=new int[MAXSIZE];
	 private int front=0;
	 private int rear=-1;
	 void insert()
	 {
		 if(rear==MAXSIZE-1) 
		 {
			 System.out.println("Queue is overflow..!");
		 }
		 else 
		 {
			 System.out.print("enter an element to insert::");
			 int n=sc.nextInt();
			 rear++;
			 queue[rear]=n; 
		 }
	 }
	 void delete() 
	 {
		 if(front>rear) 
		 {
			 System.out.println("Queue is empty..?");
			 
		 }
		 else 
		 {
			 int n=queue[front];
			 System.out.println("Deleted element:"+n);
			 
			 if(front==rear)
			 {
				 System.out.println("Queue has only one element::");
			 }
			 
			 front++;
		 }
	 }
	 void display() 
	 {
		 if(front>rear) 
		 {
			 System.out.println("Queue is Empty.");
		 }
		 else 
		 {
			 System.out.println("Queue Element are:");
			 for(int i=rear;i>=front;i--) 
			 {
				 System.out.println(queue[i]);
			 }
		 }
		 
	 } 
	 
}
public class QueueArr 
{
  public static void main(String[] args)
	{
		int choice;
		Scanner sc =new Scanner(System.in);
		MyQueue m=new MyQueue();	
	do 
	{
	  System.out.println("---------------------Queue Menu start----------------------");
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
		  default:System.out.println("Invalid Choice program get Terminated:");
		  break;
	  }
		}
		while(choice!=4);
		}

	}

/*---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
enter an element to insert::10
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
enter an element to insert::20
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
enter an element to insert::30
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
enter an element to insert::40
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
enter an element to insert::50
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
enter an element to insert::60
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
enter an element to insert::70
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
Queue Element are:
70
60
50
40
30
20
10
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::2
----------------------------------------------------------
Deleted element:10
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
Queue Element are:
70
60
50
40
30
20
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::2
----------------------------------------------------------
Deleted element:20
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
Queue Element are:
70
60
50
40
30
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::2
----------------------------------------------------------
Deleted element:30
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::2
----------------------------------------------------------
Deleted element:40
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
Queue Element are:
70
60
50
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::4
----------------------------------------------------------
Invalid Choice program get Terminated:

C:\Users\Narsing Patil\OneDrive\Desktop>java QueueArr
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
enter an element to insert::100
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
enter an element to insert::200
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
enter an element to insert::300
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
enter an element to insert::400
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
enter an element to insert::500
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
enter an element to insert::600
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
enter an element to insert::700
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
Queue Element are:
700
600
500
400
300
200
100
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::2
----------------------------------------------------------
Deleted element:100
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
Queue Element are:
700
600
500
400
300
200
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::2
----------------------------------------------------------
Deleted element:200
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
Queue Element are:
700
600
500
400
300
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::2
----------------------------------------------------------
Deleted element:300
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
Queue Element are:
700
600
500
400
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::2
----------------------------------------------------------
Deleted element:400
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
Queue Element are:
700
600
500
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::2
----------------------------------------------------------
Deleted element:500
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
Queue Element are:
700
600
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
Queue Element are:
700
600
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::2
----------------------------------------------------------
Deleted element:600
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::2
----------------------------------------------------------
Deleted element:700
Queue has only one element::
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
Queue is Empty.
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::2
----------------------------------------------------------
Queue is empty..?
---------------------Queue Menu start----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::4
----------------------------------------------------------
Invalid Choice program get Terminated:
*/

