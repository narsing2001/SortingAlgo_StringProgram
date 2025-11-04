
package J12;
//java programme for implementation of linear Dynamic queue 
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;


public class QueueTest {

	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		//given collection i.e class of Queue collection is already inbuilt in the collection framework 
		Queue<Integer> queue=new LinkedList<Integer>();
		do {
		System.out.println("--------------Dyn-Queue-menu -------------------------");
		System.out.println("1.insert");
		System.out.println("2.delete");
		System.out.println("3.display");
		System.out.println("4.Exit");
		System.out.println("---------------------------------------------------------------------------");
		System.out.print("Enter your choice::");
	    choice=sc.nextInt();
		System.out.println("---------------------------------------------------------------------------");
		switch(choice) 
		{
		//insert code
		case 1:
		{
			System.out.print("Enter an element to Enqueue(Add) an element::");
			int n=sc.nextInt();
			queue.add(n);
			break;
		}
		
		//delete code
		case 2:
		{
			int	n;
			if(queue.isEmpty())
			System.out.println("Queue is Underflow..!");
			
			else 
			{
				n=queue.remove();
			System.out.println("Dequeue element is:"+n);
			}
			     break;
		}
	
		//display code
		case 3:
		{
		    if(queue.isEmpty()) 
		    System.out.println("Queue is Underflow..!");		
			
		else
		{
			System.out.println("Display of Queue element using Generic class for next element only Iterator collection::");
 //System.out.println("-------------Queue elements----------------------------------------------------");
//		       Iterator I1=queue.iterator();
//				while(I1.hasNext())
//				{
//					System.out.println(I1.next());
//				}
//				
//System.out.println("---------------------------------------------------------------------------------------------------");
//				System.out.println("Display of element using Listiterator ");
//System.out.println("--------------------------");
//				int n;
//				n=queue.size();
// ListIterator is a raw type. References to generic type ListIterator<E> should be parameterized
//				ListIterator I2=((LinkedList<Integer>) queue).listIterator(n);
//				while(I2.hasPrevious()) 
//				{
//					System.out.println(I2.previous());
//				}	
System.out.println("--------------------------------------------------------------------------------------------------");
// display element using  for-each loop		
						System.out.println("Queue element representation using for each loop::");
System.out.println("---------------------------------------------------------------------------------------------------");
						for(Integer I: queue) 
						{
							System.out.println(I);
						}
						
		}
		       break;
		}	
		case 4:
			default:System.out.println("Invalid choice programe get Terminated");
			break;	
	}
		}
		while(choice!=4);
	}

	}
//=====================================================================================================
/*--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element to Enqueue(Add) an element::10
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element to Enqueue(Add) an element::20
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element to Enqueue(Add) an element::30
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element to Enqueue(Add) an element::40
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element to Enqueue(Add) an element::50
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element to Enqueue(Add) an element::60
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element to Enqueue(Add) an element::70
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element to Enqueue(Add) an element::70
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element to Enqueue(Add) an element::80
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element to Enqueue(Add) an element::80
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element to Enqueue(Add) an element::90
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element to Enqueue(Add) an element::90
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element to Enqueue(Add) an element::100
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------
Enter your choice::3
------------------------------------------
Display of Queue element using Generic class for next element only Iterator collection::
-------------Queue elements----------------------------------------------------------
10
20
30
40
50
60
70
70
80
80
90
90
100
---------------------------------------------------------------------------------------------------
Display of element using Listiterator 
100
90
90
80
80
70
70
60
50
40
30
20
10
--------------------------------------------------------------------------------------------------
Queue element representation using for each loop::
10
20
30
40
50
60
70
70
80
80
90
90
100
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------
Enter your choice::2
------------------------------------------
Dequeue element is:10
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------
Enter your choice::3
------------------------------------------
Display of Queue element using Generic class for next element only Iterator collection::
-------------Queue elements----------------------------------------------------------
20
30
40
50
60
70
70
80
80
90
90
100
---------------------------------------------------------------------------------------------------
Display of element using Listiterator 
100
90
90
80
80
70
70
60
50
40
30
20
--------------------------------------------------------------------------------------------------
Queue element representation using for each loop::
20
30
40
50
60
70
70
80
80
90
90
100
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------
Enter your choice::2
------------------------------------------
Dequeue element is:20
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------
Enter your choice::2
------------------------------------------
Dequeue element is:30
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------
Enter your choice::3
------------------------------------------
Display of Queue element using Generic class for next element only Iterator collection::
-------------Queue elements----------------------------------------------------------
40
50
60
70
70
80
80
90
90
100
---------------------------------------------------------------------------------------------------
Display of element using Listiterator 
100
90
90
80
80
70
70
60
50
40
--------------------------------------------------------------------------------------------------
Queue element representation using for each loop::
40
50
60
70
70
80
80
90
90
100
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------
Enter your choice::4
------------------------------------------
Invalid choice programe get Terminated
------------------------------------------------------------
C:\Users\Narsing Patil\OneDrive\Desktop>java QueueTest
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------------------------------
Enter your choice::1
---------------------------------------------------------------------------
Enter an element to Enqueue(Add) an element::1000
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------------------------------
Enter your choice::1
---------------------------------------------------------------------------
Enter an element to Enqueue(Add) an element::2000
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------------------------------
Enter your choice::1
---------------------------------------------------------------------------
Enter an element to Enqueue(Add) an element::3000
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------------------------------
Enter your choice::1
---------------------------------------------------------------------------
Enter an element to Enqueue(Add) an element::4000
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------------------------------
Enter your choice::1
---------------------------------------------------------------------------
Enter an element to Enqueue(Add) an element::5000
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------------------------------
Enter your choice::1
---------------------------------------------------------------------------
Enter an element to Enqueue(Add) an element::6000
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------------------------------
Enter your choice::1
---------------------------------------------------------------------------
Enter an element to Enqueue(Add) an element::7000
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------------------------------
Enter your choice::1
---------------------------------------------------------------------------
Enter an element to Enqueue(Add) an element::8000
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------------------------------
Enter your choice::1
---------------------------------------------------------------------------
Enter an element to Enqueue(Add) an element::9000
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------------------------------
Enter your choice::1
---------------------------------------------------------------------------
Enter an element to Enqueue(Add) an element::10000
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------------------------------
Enter your choice::3
---------------------------------------------------------------------------
Display of Queue element using Generic class for next element only Iterator collection::
-------------Queue elements----------------------------------------------------
1000
2000
3000
4000
5000
6000
7000
8000
9000
10000
---------------------------------------------------------------------------------------------------
Display of element using Listiterator
--------------------------
10000
9000
8000
7000
6000
5000
4000
3000
2000
1000
--------------------------------------------------------------------------------------------------
Queue element representation using for each loop::
--------------------------
1000
2000
3000
4000
5000
6000
7000
8000
9000
10000
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------------------------------
Enter your choice::2
---------------------------------------------------------------------------
Dequeue element is:1000
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------------------------------
Enter your choice::3
---------------------------------------------------------------------------
Display of Queue element using Generic class for next element only Iterator collection::
-------------Queue elements----------------------------------------------------
2000
3000
4000
5000
6000
7000
8000
9000
10000
---------------------------------------------------------------------------------------------------
Display of element using Listiterator
--------------------------
10000
9000
8000
7000
6000
5000
4000
3000
2000
--------------------------------------------------------------------------------------------------
Queue element representation using for each loop::
--------------------------
2000
3000
4000
5000
6000
7000
8000
9000
10000
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------------------------------
Enter your choice::2
---------------------------------------------------------------------------
Dequeue element is:2000
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------------------------------
Enter your choice::3
---------------------------------------------------------------------------
Display of Queue element using Generic class for next element only Iterator collection::
-------------Queue elements----------------------------------------------------
3000
4000
5000
6000
7000
8000
9000
10000
---------------------------------------------------------------------------------------------------
Display of element using Listiterator
--------------------------
10000
9000
8000
7000
6000
5000
4000
3000
--------------------------------------------------------------------------------------------------
Queue element representation using for each loop::
--------------------------
3000
4000
5000
6000
7000
8000
9000
10000
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------------------------------
Enter your choice::3
---------------------------------------------------------------------------
Display of Queue element using Generic class for next element only Iterator collection::
-------------Queue elements----------------------------------------------------
3000
4000
5000
6000
7000
8000
9000
10000
---------------------------------------------------------------------------------------------------
Display of element using Listiterator
--------------------------
10000
9000
8000
7000
6000
5000
4000
3000
--------------------------------------------------------------------------------------------------
Queue element representation using for each loop::
--------------------------
3000
4000
5000
6000
7000
8000
9000
10000
--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------------------------------
Enter your choice::4
---------------------------------------------------------------------------
Invalid choice programe get Terminated

*/


