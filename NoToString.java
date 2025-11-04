package J12;
import java.util.Scanner;

public class NoToString
{
	 public static String convertNumberToString(int num) 
	 {
	        // Handle the case for zero
	        if (num == 0) {
	            return "0";
	        }

	        StringBuilder sb = new StringBuilder();
	        
	        boolean isNegative = num < 0;
	        if (isNegative) {
	            num = -num; // Make the number positive for processing
	        }

	        // Convert each digit to ASCII
	        while (num > 0) {
	        	// Get the last digit
	            int digit = num % 10; 
	            // Convert digit to corresponding ASCII character
	            char asciiChar = (char) (digit + '0'); 
	         // Append the character to the string
	            sb.append(asciiChar); 
	            num /= 10; // Remove the last digit
	        }

	        if (isNegative) 
	        {
	        	// Add the negative sign if needed
	            sb.append('-');
	        }

	        // Since we built the string in reverse order, we need to reverse it
	        return sb.reverse().toString();
	 }

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        String result = convertNumberToString(num);
	        System.out.println("String representation: " + result);
	      

	}

}
