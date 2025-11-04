package J12;
import java.util.Scanner;
//java programme to replace or remove element from the string

public class RemVowel
{
	public static String removeVowels(String str) 
	{
        return str.replaceAll("[AEIOUaeiou]", "");
    }

	public static void main(String[] args) 
	{
		 Scanner scanner = new Scanner(System.in);
	        
	        // Input string from the user
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        // Remove vowels
	        String result = removeVowels(input);
	        
	        // Output the result
	        System.out.println("String after removing vowels: " + result);

	}

}
/*----------------------------------------------------------------
C:\Users\Narsing Patil\OneDrive\Desktop>java RemVowel
Enter a string: narsing patil
String after removing vowels: nrsng ptl
*/