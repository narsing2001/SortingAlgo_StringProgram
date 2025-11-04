 
package J12;

import java.io.*;
public class Exception4 {

	public static void main(String[] args)  {
	System.out.println("A");
	try{
		throw new IOException("Printer Not Found");
	    }
	 catch(IOException e1)
	 {
	 System.out.println(e1.getMessage());   
     }
}}
//output---------------------------------
/*
A
null
*/
//-----------------------------------------------------
/*package J12;
import java.io.*;
public class Exception4 {

	public static void main(String[] args) throws Exception {
	
		throw new IOException();

	}

}
*/

/*output:: C:\Users\Narsing Patil\OneDrive\Desktop>java Exception4
Exception in thread "main" java.io.IOException
        at Exception4.main(Exception4.java:7)*/
//----------------------------------------------

