package J12;
//java programme for implementation of linear Dynamic queue operation
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
import java.util.*;
public class DynQueue {
public static void main(String[] args) 
{
		Scanner sc=new Scanner(System.in);
// creating a Queue using linked list
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		queue.add(70);
		queue.add(80);
		queue.add(90);
		queue.add(100);
		System.out.println("original queue::"+queue);
		System.out.println("------operation on queue--------");
//---- remove()---and -- poll()-- will perform same operation on queue i.e delete an element from an queue
		
		System.out.println("element after removing one element from front::"+ queue.remove());
		System.out.println(queue);
		System.out.println("----------------------------------------------------");
		System.out.println("element after poll one element from front::"+ queue.poll());
		System.out.println(queue);
		System.out.println("----------------------------------------------------");
//--peek()-- meaning show  the front element without removing it 
	
		System.out.println("peek i.e starting element of the queue is::"+queue.peek());
		System.out.println("----------------------------------------------------");
	// check whether queue is empty or not
		System.out.println("Queue is Empty.?=>::"+queue.isEmpty());
// returns the size of the queue
		System.out.println("----------------------------------------------------");
		System.out.println("Queue size::"+queue.size());
		System.out.println("----------------------------------------------------");
		System.out.print("enter element to check whether it contain in queue or not::");
		int s=sc.nextInt();
		System.out.println("Is Queue contain"+" "+s+" "+"element::"+queue.contains(s));
System.out.println("---------------------------------------------------------------------");
// display element using  for-each loop		
		System.out.println("Queue element representation using for each loop::");
		for(Integer I: queue) 
		{
			System.out.println(I);
		}
		
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
	}
}
/*original queue::[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
------operation on queue--------
element after removing one element from front::10
[20, 30, 40, 50, 60, 70, 80, 90, 100]
----------------------------------------------------
element after poll one element from front::20
[30, 40, 50, 60, 70, 80, 90, 100]
----------------------------------------------------
peek i.e starting element of the queue is::30
----------------------------------------------------
Queue is Empty.?=>::false
----------------------------------------------------
Queue size::8
----------------------------------------------------
enter element to check whether it contain in queue or not::100
Is Queue contain 100 element::true
---------------------------------------------------------------------
Queue element representation using for each loop::
30
40
50
60
70
80
90
100
---------------------------------------------------------------------
Display of Queue element using Generic class for next element only Iterator collection::
30
40
50
60
70
80
90
100
---------------------------------------------------------------------
Display of element using Listiterator 
100
90
80
70
60
50
40
30
------------------------------------------------------------------------------

C:\Users\Narsing Patil\OneDrive\Desktop>javac DynQueue.java

C:\Users\Narsing Patil\OneDrive\Desktop>java DynQueue
original queue::[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
------operation on queue--------
element after removing one element from front::10
[20, 30, 40, 50, 60, 70, 80, 90, 100]
----------------------------------------------------
element after poll one element from front::20
[30, 40, 50, 60, 70, 80, 90, 100]
----------------------------------------------------
peek i.e starting element of the queue is::30
----------------------------------------------------
Queue is Empty.?=>::false
----------------------------------------------------
Queue size::8
----------------------------------------------------
enter element to check whether it contain in queue or not::30
Is Queue contain 30 element::true
---------------------------------------------------------------------
Queue element representation using for each loop::
30
40
50
60
70
80
90
100
---------------------------------------------------------------------
Display of Queue element using Generic class for next element only Iterator collection::
30
40
50
60
70
80
90
100
---------------------------------------------------------------------
Display of element using Listiterator
100
90
80
70
60
50
40
30
*/
