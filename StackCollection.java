package J12;
//import java.util.LinkedList;
//import java.util.Stack;
//import java.util.Scanner;
import java.util.*;

import java.util.*;

public class StackCollection {
// performing operation on dynamic stack using Stack collection framework
	public static void main(String[] args) 
	{  
		Scanner sc=new Scanner(System.in);
		// create stack using stack class
		Stack<Integer>mystack=new Stack<Integer>();
		System.out.println("Stack Before push size::"+mystack.size());
		System.out.println("Stack Before push is empty::"+mystack.isEmpty());
		mystack.push(10);
		mystack.push(20);
		mystack.push(30);
		mystack.push(40);
		mystack.push(50);
		mystack.push(60);
		mystack.push(70);
		mystack.push(80);
		mystack.push(90);
		mystack.push(100);
		System.out.println("Stack After push size::"+mystack.size());
		System.out.println("Stack After push is empty::"+mystack.isEmpty());
		System.out.print("Enter element want to search::");
		int s=sc.nextInt();
		if(mystack.search(s)!=-1)
			System.out.println("Search element"+" "+s+" "+"is present in stack.");
		else 
			System.out.println("Search is not success...");
		
//---------------------------------------------------------------------------------------------------
//	System.out.println("Peek element of stack is ::"+mystack.peek());
//	System.out.println("Peek element of stack is ::"+mystack.pop());
 System.out.println("---------------------------------------------------------------------");
        System.out.println("Display of mystack element using mystack object::");		
        System.out.println(mystack);
        System.out.println("---------------------------------------------------------------------");
		System.out.println("Display of Mystack element using For each loop::");
		for(Integer I: mystack) 
		{
			System.out.println(I);
		}
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Display of mystack element using Generic class for next element only Iterator collection::");
		Iterator I1=mystack.iterator();
		while(I1.hasNext())
		{
			System.out.println(I1.next());
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Display of element using Listiterator ");
		int n;
		n=mystack.size();
		ListIterator I2=mystack.listIterator(n);
		while(I2.hasPrevious()) 
		{
			System.out.println(I2.previous());
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println("popped element is::");
		System.out.println(mystack.pop());
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Element of stack after pop operation::");
		System.out.println(mystack);
	}
}

//===================================================================================================
/*

C:\Users\Narsing Patil\OneDrive\Desktop>javac StackCollection.java

C:\Users\Narsing Patil\OneDrive\Desktop>java StackCollection
Stack Before push size::0
Stack Before push is empty::true
Stack After push size::10
Stack After push is empty::false
Enter element want to search::60
Search element 60 is present in stack.
---------------------------------------------------------------------
Display of mystack element using mystack object::
[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
---------------------------------------------------------------------
Display of Mystack element using For each loop::
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
---------------------------------------------------------------------
Display of mystack element using Generic class for next element only Iterator collection::
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
20
10
---------------------------------------------------------------------
popped element is::
100
---------------------------------------------------------------------
Element of stack after pop operation::
[10, 20, 30, 40, 50, 60, 70, 80, 90]
*/
