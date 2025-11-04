package J12;
import java.util.*;
//Implementing a stack using Array Data structure
 class MyStack
 {
	 Scanner sc =new Scanner(System.in);
	 private int top=-1;
	 private final int MAXSIZE=5;
	 private int stack[]=new int[MAXSIZE];
//making push method
	 void push() 
	 {
	  
	 if(top==MAXSIZE-1) 
	 {
	  System.out.println("Stack is overflow.....!");
	 }
	 else 
	 {
	 System.out.println("enter element for push..:");
	 int n=sc.nextInt();
	 top++;
	 stack[top]=n;
	 }
	 }
 //making pop method
	 void pop() 
	 {
	  //System.out.println("this is Pop method:");
	 if(top==-1) 
	 {
	 System.out.println("stack is empty...?:");
		 }
		 else 
		 {
			 int n;
			 n=stack[top];
			 top--;
			 
			 System.out.println("popped element is:"+n);
		} 
	 }
 //making display method
	 void display() 
	 {
		// System.out.println("this is display method:");
		 if(top==-1) 
		 {
			 System.out.println("stack is empty:");
		 }
		 else 
		 {
		 System.out.println("element of stack:");
		 for(int i=top;i>=0;i--) 
		 {
			 System.out.println(stack[i]);
		 }
		 
		 }
	 }
}
public class MyTest {

	public static void main(String[] args)
	{
	
		int choice;
		Scanner sc =new Scanner(System.in);
		MyStack m=new MyStack();	
	do 
	{
	  System.out.println("---------------------Stack Menu start----------------------");
	  System.out.println("1.Push");
	  System.out.println("2.Pop");
	  System.out.println("3.Display");
	  System.out.println("4.exit");
	  System.out.println("---------------------Stack Menu end----------------------");
	  System.out.print("Enter your choice::");
	  choice=sc.nextInt();
	  switch(choice) 
	  {
	  case 1:m.push();
	           break;
	  case 2:m.pop();
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
//==================================================================================
/*
C:\Users\Narsing Patil\OneDrive\Desktop>java MyTest
---------------------Stack Menu start----------------------
1.Push
2.Pop
3.Display
4.exit
---------------------Stack Menu end----------------------
Enter your choice::1
enter element for push..:
10
---------------------Stack Menu start----------------------
1.Push
2.Pop
3.Display
4.exit
---------------------Stack Menu end----------------------
Enter your choice::1
enter element for push..:
20
---------------------Stack Menu start----------------------
1.Push
2.Pop
3.Display
4.exit
---------------------Stack Menu end----------------------
Enter your choice::1
enter element for push..:
30
---------------------Stack Menu start----------------------
1.Push
2.Pop
3.Display
4.exit
---------------------Stack Menu end----------------------
Enter your choice::1
enter element for push..:
40
---------------------Stack Menu start----------------------
1.Push
2.Pop
3.Display
4.exit
---------------------Stack Menu end----------------------
Enter your choice::1
enter element for push..:
50
---------------------Stack Menu start----------------------
1.Push
2.Pop
3.Display
4.exit
---------------------Stack Menu end----------------------
Enter your choice::1
Stack is overflow.....!
---------------------Stack Menu start----------------------
1.Push
2.Pop
3.Display
4.exit
---------------------Stack Menu end----------------------
Enter your choice::60
Invalid Choice programme get Terminated:
---------------------Stack Menu start----------------------
1.Push
2.Pop
3.Display
4.exit
---------------------Stack Menu end----------------------
Enter your choice::1
Stack is overflow.....!
---------------------Stack Menu start----------------------
1.Push
2.Pop
3.Display
4.exit
---------------------Stack Menu end----------------------
Enter your choice::70
Invalid Choice programme get Terminated:
---------------------Stack Menu start----------------------
1.Push
2.Pop
3.Display
4.exit
---------------------Stack Menu end----------------------
Enter your choice::1
Stack is overflow.....!
---------------------Stack Menu start----------------------
1.Push
2.Pop
3.Display
4.exit
---------------------Stack Menu end----------------------
Enter your choice::80
Invalid Choice programme get Terminated:
---------------------Stack Menu start----------------------
1.Push
2.Pop
3.Display
4.exit
---------------------Stack Menu end----------------------
Enter your choice::3
element of stack:
50
40
30
20
10
---------------------Stack Menu start----------------------
1.Push
2.Pop
3.Display
4.exit
---------------------Stack Menu end----------------------
Enter your choice::1
Stack is overflow.....!
---------------------Stack Menu start----------------------
1.Push
2.Pop
3.Display
4.exit
---------------------Stack Menu end----------------------
Enter your choice::60
Invalid Choice programme get Terminated:
---------------------Stack Menu start----------------------
1.Push
2.Pop
3.Display
4.exit
---------------------Stack Menu end----------------------
Enter your choice::3
element of stack:
50
40
30
20
10
---------------------Stack Menu start----------------------
1.Push
2.Pop
3.Display
4.exit
---------------------Stack Menu end----------------------
Enter your choice::1
Stack is overflow.....!
---------------------Stack Menu start----------------------
1.Push
2.Pop
3.Display
4.exit
---------------------Stack Menu end----------------------
Enter your choice::2
poped element is:50
---------------------Stack Menu start----------------------
1.Push
2.Pop
3.Display
4.exit
---------------------Stack Menu end----------------------
Enter your choice::3
element of stack:
40
30
20
10
---------------------Stack Menu start----------------------
1.Push
2.Pop
3.Display
4.exit
---------------------Stack Menu end----------------------
Enter your choice::2
poped element is:40
---------------------Stack Menu start----------------------
1.Push
2.Pop
3.Display
4.exit
---------------------Stack Menu end----------------------
Enter your choice::3
element of stack:
30
20
10
---------------------Stack Menu start----------------------
1.Push
2.Pop
3.Display
4.exit
---------------------Stack Menu end----------------------
Enter your choice::2
poped element is:30
---------------------Stack Menu start----------------------
1.Push
2.Pop
3.Display
4.exit
---------------------Stack Menu end----------------------
Enter your choice::3
element of stack:
20
10
---------------------Stack Menu start----------------------
1.Push
2.Pop
3.Display
4.exit
---------------------Stack Menu end----------------------
Enter your choice::2
poped element is:20
---------------------Stack Menu start----------------------
1.Push
2.Pop
3.Display
4.exit
---------------------Stack Menu end----------------------
Enter your choice::2
poped element is:10
---------------------Stack Menu start----------------------
1.Push
2.Pop
3.Display
4.exit
---------------------Stack Menu end----------------------
Enter your choice::2
stack is empty...?:
---------------------Stack Menu start----------------------
1.Push
2.Pop
3.Display
4.exit
---------------------Stack Menu end----------------------*/
