package J12;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        while (true) {
            
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

          
            double result = 0;
            
            switch (operator) {
                case '+': 
                    result = num1 + num2;
                    System.out.println("The result is: " + result);
                    break;
                case '-': 
                    result = num1 - num2;
                    System.out.println("The result is: " + result);
                    break;
                case '*': 
                    result = num1 * num2;
                    System.out.println("The result is: " + result);
                    break;
                case '/': 
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("The result is: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid operator.");
            }

          
            System.out.print("Do you want to perform another operation? (yes/no): ");
            String answer = scanner.next().toLowerCase();
            if (!answer.equals("yes")) 
            {
                System.out.println("Exiting the program.");
                break;  
            }
        }

       
        scanner.close();
    }
}
