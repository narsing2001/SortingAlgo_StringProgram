package J12;
import java.util.*;
//implementing  menu for a Dynamic stack using inbuilt Stack collection framework
public class DynStack {

	public static void main(String[] args) 
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		//given collection i.e class of stack collection is already inbuilt in the collection framework 
		Stack<Integer>mystack=new Stack<Integer>();
		do {
		System.out.println("--------------stack menu -------------------------");
		System.out.println("1.push");
		System.out.println("2.pop");
		System.out.println("3.display");
		System.out.println("4.peek");
		System.out.println("5.search");
		System.out.println("6.Exit");
		System.out.println("---------------------------------------------------");
		System.out.print("Enter your choice::");
	    choice=sc.nextInt();
		System.out.println("------------------------------------------");
		switch(choice) 
		{
		//push code
		case 1:
		{
			System.out.print("Enter an element for push::");
			int n=sc.nextInt();
			mystack.push(n);
			break;
		}
		
		//pop code
		case 2:
		{
			int	n;
			if(mystack.isEmpty())
			System.out.println("stack is empty..!");
			
			else 
			{
				n=mystack.pop();
			System.out.println("popped element is:"+n);
			}
			break;
		}
	
		//display code
		case 3:
		{
		    if(mystack.isEmpty()) 
		    System.out.println("stack is empty..!");		
			
		else
		{
		       System.out.println("------------stack elements-----------");
		       ListIterator I=mystack.listIterator(mystack.size());
		 
		 while(I.hasPrevious()) 
		  {
		  System.out.println(I.previous());
		  }
		}
		break;
		}
		//peek code
		case 4:	
		{
		   if(mystack.isEmpty())
		   System.out.println("stack is empty..!");
		
		else 
		{
			System.out.println("peeked element is:"+mystack.peek());
			
		}
			break;
			} 
		
		//search code
		case 5:
		{
			System.out.println("Enter an element want to search:");
			int s=sc.nextInt();
			if(mystack.search(s)!=-1)
				System.out.println("Search element is present in stack.");
			else
				System.out.println("Search is not success...");
			break;
		}
		
		case 6:
			default:System.out.println("Invalid choice programe get Terminated");
			break;	
	}
		}
		while(choice!=6);
	}
}
//output=====================================================================
/*--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element for push::10
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element for push::20
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element for push::30
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element for push::40
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element for push::50
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element for push::60
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element for push::70
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element for push::80
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element for push::90
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element for push::100
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::3
------------------------------------------
------------stack elements-----------
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
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::4
------------------------------------------
peeked element is:100
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::2
------------------------------------------
popped element is:100
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::3
------------------------------------------
------------stack elements-----------
90
80
70
60
50
40
30
20
10
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::2
------------------------------------------
popped element is:90
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::3
------------------------------------------
------------stack elements-----------
80
70
60
50
40
30
20
10
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::2
------------------------------------------
popped element is:80
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::3
------------------------------------------
------------stack elements-----------
70
60
50
40
30
20
10
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::4
------------------------------------------
peeked element is:70
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::5
------------------------------------------
Enter an element want to search:
40
Search element is present in stack.
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::5
------------------------------------------
Enter an element want to search:
100
Search is not success...
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::6
------------------------------------------
Invalid choice programe get Terminated
Microsoft Windows [Version 10.0.22631.3593]
(c) Microsoft Corporation. All rights reserved.

C:\Users\Narsing Patil\OneDrive\Desktop>javac DynStack.java

C:\Users\Narsing Patil\OneDrive\Desktop>java DynStack
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element for push::10
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element for push::20
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element for push::30
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element for push::40
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element for push::50
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element for push::60
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element for push::70
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element for push::80
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element for push::90
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::1
------------------------------------------
Enter an element for push::100
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::3
------------------------------------------
------------stack elements-----------
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
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::4
------------------------------------------
peeked element is:100
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::2
------------------------------------------
popped element is:100
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::3
------------------------------------------
------------stack elements-----------
90
80
70
60
50
40
30
20
10
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::2
------------------------------------------
popped element is:90
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::3
------------------------------------------
------------stack elements-----------
80
70
60
50
40
30
20
10
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::5
------------------------------------------
Enter an element want to search:
40
Search element is present in stack.
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::5
------------------------------------------
Enter an element want to search:
90
Search is not success...
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::2
------------------------------------------
popped element is:80
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::2
------------------------------------------
popped element is:70
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::2
------------------------------------------
popped element is:60
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::2
------------------------------------------
popped element is:50
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::2
------------------------------------------
popped element is:40
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::2
------------------------------------------
popped element is:30
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::2
------------------------------------------
popped element is:20
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::2
------------------------------------------
popped element is:10
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::2
------------------------------------------
stack is empty..!
--------------stack menu -------------------------
1.push
2.pop
3.display
4.peek
5.search
6.Exit
---------------------------------------------------
Enter your choice::
*/
