package J12;
import java.util.Scanner;
public class Datatype {

	public static void main(String[] args) {
		
	   int myint=10;
	   float myfloat=10;
	   double mydouble=10;
	   char mychar='a';
	   System.out.println("Value of the myint="+myint);
	   System.out.println("Value of the myfloat="+myfloat);
	   System.out.println("Value of the mydouble="+mydouble);
	   System.out.println("Value of the mychar="+mychar);
	   Scanner sc =new Scanner(System.in);
	   String str1 = new String("hello");
       String str2 = new String("hello");

       // Using equals() to compare content,The equals() method compares the contents of two String objects. 
       //It returns true if the strings have the same sequence of characters and false otherwise.
       if (str1.equals(str2)) {
           System.out.println("with new,The strings are equal (using equals()).");
       } else {
           System.out.println("with new,The strings are not equal (using equals()).");
       }
       
       // Using == to compare references,The == operator compares object references. 
       //It checks whether both String variables point to the same object in memory, not whether their contents are the same.
   
       if (str1==str2) {
           System.out.println("with new,The strings are the same object (using ==).");
       } else {
           System.out.println("with new,The strings are different objects (using ==).");
       }
       
       
       
       System.out.println("without new keword compare two string-------------------------------------");
       String str5 = "Narsing";
       String str6 = "Narsing";
       if (str5.equals(str6)) {
           System.out.println("without new,The strings are equal (using equals()).");
       } else {
           System.out.println("without new,The strings are not equal (using equals()).");
       }
       
       if (str5==str6) {
           System.out.println("without new,The strings are the same object (using ==).");
       } else {
           System.out.println("without new,The strings are different objects (using ==).");
           
       }
       
       
       System.out.println("for loops:-----------------------------------------------------start");
       for (int i = 0, j = 0; i < 5 && j < 3; i++, j++) 
       {
    	  System.out.println("i="+i+" " +"j="+j);   
       }
       
       System.out.println("nested for loop--------------------------------------------");
       for (int i = 0; i < 5; i++) 
       {
    	   for (int j = 0;  j < 3;  j++) {
    		   System.out.println("i="+i+" " +"j="+j);
    	   
    	}
       }


	}

}
