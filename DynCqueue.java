package J12;
import java.util.*;

//java programme for implementation of  Dynamic Circular queue implementation using Collection

public class DynCqueue {

	public static void main(String[] args)
	{
		int choice;
		Scanner sc =new Scanner(System.in);
		Queue<Integer> queue=new LinkedList<Integer>();	
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
	  //code for Enqueue
	  case 1:
		{
			System.out.print("Enter an element to Enqueue(Add) an element::");
			int n=sc.nextInt();
			queue.add(n);
			break;

		}
		//code for Dequeue
	  case 2:
		  int	n;
			Integer removed=queue.remove();
			if(removed!=null)
			{
				System.out.println("Deque element:"+removed);
			}
			
			   break;
         // code for Display
	  case 3:System.out.println("---------------------------------------------------------------------");
		// display element using  for-each loop		
		System.out.println("Queue element representation using for each loop::");
		for(Integer I: queue) 
		{
			System.out.println(I);
		}
		
/*
System.out.println("---------------------------------------------------------------------");
//Display of element using Generic Iterator
		System.out.println("Display of Queue element using Generic class for next element only Iterator collection::");
		Iterator I1=queue.iterator();
		while(I1.hasNext())
		{
			System.out.println(I1.next());
		}
System.out.println("---------------------------------------------------------------------");
		System.out.println("Display of element using Listiterator ");
		int n;
		n=queue.size();
// ListIterator is a raw type. References to generic type ListIterator<E> should be parameterized
		ListIterator I2=((LinkedList<Integer>) queue).listIterator(n);
		while(I2.hasPrevious()) 
		{
			System.out.println(I2.previous());
		}
			
*/
          break;

	  case 4:
		  default:System.out.println("Please enter valid Choice::");
		  break;
	  }
		}
		while(choice!=4);

	}

}



//======================== Circular Queue output===================================================================================================
/*
  ---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element to Enqueue(Add) an element::10
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element to Enqueue(Add) an element::20
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element to Enqueue(Add) an element::30
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element to Enqueue(Add) an element::40
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element to Enqueue(Add) an element::50
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element to Enqueue(Add) an element::60
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element to Enqueue(Add) an element::70
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::80
----------------------------------------------------------
Please enter valid Choice::
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element to Enqueue(Add) an element::90
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element to Enqueue(Add) an element::100
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
---------------------------------------------------------------------
Queue element representation using for each loop::
10
20
30
40
50
60
70
90
100
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::2
----------------------------------------------------------
Deque element:10
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
---------------------------------------------------------------------
Queue element representation using for each loop::
20
30
40
50
60
70
90
100
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element to Enqueue(Add) an element::110
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
---------------------------------------------------------------------
Queue element representation using for each loop::
20
30
40
50
60
70
90
100
110
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element to Enqueue(Add) an element::120
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
---------------------------------------------------------------------
Queue element representation using for each loop::
20
30
40
50
60
70
90
100
110
120
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::1
----------------------------------------------------------
Enter an element to Enqueue(Add) an element::130
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
---------------------------------------------------------------------
Queue element representation using for each loop::
20
30
40
50
60
70
90
100
110
120
130
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::2
----------------------------------------------------------
Deque element:20
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::3
----------------------------------------------------------
---------------------------------------------------------------------
Queue element representation using for each loop::
30
40
50
60
70
90
100
110
120
130
---------------------Circular-Queue-Menu----------------------
1.Insert
2.Delete
3.Display
4.exit
----------------------------------------------------------
Enter your choice::
  
  
 */
/*
======================== Linear Queue output=========================================================================================================
Display of Queue element using Generic class for next element only Iterator collection::
-------------Queue elements--------------------------------------------------------------------------
10
20
30
40
50
60
70
80
90
100
---------------------------------------------------------------------------------------------------

Display of Queue element using Generic class for next element only Iterator collection::
-------------Queue elements---------------------------------------------------------------
20
30
40
50
60
70
80
90
100
---------------------------------------------------------------------------
Dequeue element is:10
--------------Dyn-Queue-menu -----------------------------------------------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------------------------------
Enter your choice::2
---------------------------------------------------------------------------
Dequeue element is:20
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
30
40
50
60
70
80
90
100

--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------------------------------
Enter your choice::2
---------------------------------------------------------------------------
Dequeue element is:30
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
40
50
60
70
80
90
100

--------------Dyn-Queue-menu -------------------------
1.insert
2.delete
3.display
4.Exit
---------------------------------------------------------------------------
Enter your choice::2
---------------------------------------------------------------------------
Dequeue element is:40
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
50
60
70
80
90
100
---------------------------------------------------------------------------------------------------

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
