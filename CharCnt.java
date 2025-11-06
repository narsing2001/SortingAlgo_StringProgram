package J12;

// java programme to find occurences of given character in the given string
import java.util.Scanner;

public class CharCnt {
	public static int CharOccur(String str, char charToCount) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == charToCount) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input: String from the user
		System.out.print("Enter a string: ");
		String str = scanner.nextLine();

		// Input: Character to count
		System.out.print("Enter a character to count: ");
		char charToCount = scanner.next().charAt(0);

		// Count occurrences
		int count = CharOccur(str, charToCount);

		// Output: Display the result
		System.out.println("The character '" + charToCount + "' occurs " + count + " times in the string.");
	}
}
/*
 * Enter a string: my name is narsing
 * Enter a character to count: r
 * The character 'r' occurs 1 times in the string.
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * ----------
 * 🌟 Suggested Improvements
 * 1. Case-insensitive
 * counting---------------------------------------------------------
 * 
 * 
 * 
 * 
 * Characte
 *  
 * 
 * 
 * 
 * 2. Handle empty string s
 * 
 * Add a simple validat
 * 
 * str.isE
 *  
 * 
 * }
 * 
 * 
 * 3. Use modern Java streams (optional, for learning)------------
 * In Java 8+, you can count using streams:
 * 
 * This produces th
 *  same result with a more functional style.
 * 
 * 
 * 4. Sample Output Variations-----------------------------------------------
 * -----------------------
 * 
 * 
 * 
 * 
 * Example Output:
 * The character 'r' occurs 1 time in the string.
 The character 'a' occurs 3 times in the string.
*/
