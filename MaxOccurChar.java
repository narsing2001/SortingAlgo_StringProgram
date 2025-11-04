package J12;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxOccurChar 
{
	 public static char findMaxOccurCha(String str) {
	        Map<Character, Integer> countMap = new HashMap<>();
	        char maxChar = str.charAt(0);
	        int maxCount = 0;

	        // Count occurrences of each character
	        for (char c : str.toCharArray()) {
	            int count = countMap.getOrDefault(c, 0) + 1;
	            countMap.put(c, count);

	            // Update max character and count
	            if (count > maxCount) {
	                maxCount = count;
	                maxChar = c;
	            }
	        }

	        return maxChar;
	    }

	    public static int countCharOccur(String str, char ch){
	        return (int) str.chars().filter(c -> c == ch).count();
	    }

	

	public static void main(String[] args) 
	{
		  Scanner sc = new Scanner(System.in);

	        // Input the string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        // Find the maximum occurring character
	        char maxChar = findMaxOccurCha(str);
	        int maxCount = countCharOccur(str, maxChar);

	        // Display the result
	        System.out.println("The maximum occurring character is '" + maxChar + "' with " + maxCount + " occurrences.");
	}
}
/*---------------------------------------------------------------------------
C:\Users\Narsing Patil\OneDrive\Desktop>java  MaxOccurChar
Enter a string: hello
The maximum occurring character is 'l' with 2 occurrences.

C:\Users\Narsing Patil\OneDrive\Desktop>java  MaxOccurChar
Enter a string: my name is narsing and i  am a web developer
The maximum occurring character is ' ' with 10 occurrences.

C:\Users\Narsing Patil\OneDrive\Desktop>java  MaxOccurChar
Enter a string:  mynameisnarsingandiamawebdeveloper
The maximum occurring character is 'a' with 5 occurrences.
*/
