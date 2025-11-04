package J12;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		 Scanner scanner = new Scanner(System.in);
	      int choice;
	 	do {
			    System.out.println("--------------------------Simple Calculator menu---------------------------------------------");
	            System.out.println("1. Addition");
	            System.out.println("2. Subtraction");
	            System.out.println("3. Multiplication");
	            System.out.println("4. Division");
	            System.out.println("5. Exit");	  
	            
	            System.out.println("--------------------------menu end---------------------------------------------");
	         
	            double result;
	            System.out.println("Enter your choice to perform operation");
	            choice = scanner.nextInt();	   	   
	            
	            System.out.print("Enter first number: ");
	            double num1 = scanner.nextDouble();
	            System.out.print("Enter second number: ");
	            double num2 = scanner.nextDouble();
	                 
	            
	            switch (choice)
	            {
	                case 1:
	                    result = num1 + num2;
	                    System.out.println("Result: " + result);
	                    break;
	                case 2:
	                    result = num1 - num2;
	                    System.out.println("Result: " + result);
	                    break;
	                case 3:
	                    result = num1 * num2;
	                    System.out.println("Result: " + result);
	                    break;
	                case 4:
	                    if (num2 != 0) 
	                    {
	                        result = num1 / num2;
	                        System.out.println("Result: " + result);
	                    } 
	                    else 
	                    {
	                        System.out.println("Arithmetic Exception: Division by zero is not allowed.");
	                    }
	                    break;
	                default: System.out.println("Invalid option. Please choose a number between 1 and 5.");
	             }
	            
	           }
	        while(choice!=5);
	}
}
	

	         