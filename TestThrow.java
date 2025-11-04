package J12;
import java.util.*;
import java.io.*;
public class TestThrow {
public static void checkNum(int num) {
	if(num<1) {
		throw new ArithmeticException("Number is Negative cannot calculate square::");
	}
	else {
		System.out.println("Square of"+num+"is::"+(num*num));
	}
}
//main method
	
	public static void main(String[] args) {
		
TestThrow obj=new TestThrow();
Scanner sc=new Scanner(System.in);
System.out.println("Enter no to find square");
int num=sc.nextInt();
   obj.checkNum(num);
   System.out.println("Rest of code::");
	}

}
