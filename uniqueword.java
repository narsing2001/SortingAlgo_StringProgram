package J12;

//java programme to print only non-duplicate character in the given sentence containing word 
import java.util.Scanner;

public class uniqueword {
	public static void PrintUniqueChar(String str) {
		String[] words = str.split("\\s+");

		// iterate through each word
		for (String word : words) {
			// create boolean array to store the occurence of the each character
			boolean[] charPresent = new boolean[256];
			boolean[] repeated = new boolean[256];

			// iterate through character of the word

			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);
				if (charPresent[ch]) {
					// mark character as repeated if they are appear more than once
					repeated[ch] = true;
				} else {
					// mark character as present
					charPresent[ch] = true;
				}
			}
			// print unique character(not repeated) in the current word
			System.out.print("Unique character in:" + word + ":");
			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);
				if (charPresent[ch] && !repeated[ch] || ch == ' ') {
					System.out.print(ch);
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string:");
		String input = sc.nextLine();

		System.out.println("unique character in\"" + input + "\":");
		PrintUniqueChar(input);

	}

}
/*---------------------------------------------------------------------
 Enter a string:java is good programming language
unique character in"java is good programming language":
Unique character in:java:jv
Unique character in:is:is
Unique character in:good:gd
Unique character in:programming:poain
Unique character in:language:lnue
---------------------------------------------------------------
C:\Users\Narsing Patil\OneDrive\Desktop>javac uniqueword.java

C:\Users\Narsing Patil\OneDrive\Desktop>java uniqueword
Enter a string:my name is narsing Patil
unique character in"my name is narsing Patil":
Unique character in:my:my
Unique character in:name:name
Unique character in:is:is
Unique character in:narsing:arsig
Unique character in:Patil:Patil

*/

/*
 * 1️⃣ What it does
 * boolean[] charPresent = new boolean[256];
 * charPresent is a boolean array, meaning each element can be true or false.
 * Size 256 → corresponds to all possible ASCII characters (0–255).
 * Each index in the array represents a character’s ASCII value.
 * 
 * 
 * 
 * Ah, this is an important Java detail! 😄
 * 
 * When you create a boolean array in Java like this:
 * 
 * boolean[] charPresent = new boolean[256];
 * 
 * ✅ Default values
 * All elements are automatically initialized to false.
 * You don’t need to explicitly set them to false.
 * This is true for all primitive types in arrays in Java:
 * 
 * Type Default Value
 * boolean false
 * int 0
 * double 0.0
 * char '\u0000'
 * Object null
 * 
 * 🔹 Why this matters in your program
 * boolean[] charPresent = new boolean[256];
 * 
 * Initially, charPresent[ch] is false for all ch.
 * When you encounter a character for the first time:
 * charPresent[ch] = true;
 * if (charPresent[ch]) { ... }
 * and it works correctly because all unseen characters start as false.
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * ------------------------
 * Example
 * boolean[] arr = new boolean[5];
 * for (int i = 0; i < arr.length; i++) {
 * System.out.println(arr[i]);
 * }
 * Output:----------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * --------------
 * false
 * false
 * false
 * false
 * false
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * ----
 * 2️⃣ How it works in your program
 * When processing a word:
 * char ch = word.charAt(i);
 * if (charPresent[ch]) {
 * repeated[ch] = true;
 * } else {
 * charPresent[ch] = true;
 * }
 * 
 * Here’s what happens:
 * char ch = word.charAt(i); → get the character at position i.
 * charPresent[ch] → check if this character has been seen before.
 * If true → mark it as repeated.
 * If false → mark it as present for the first time.
 * -----------------------------------------------------------------------------
 * ---------------------------------------------------
 * 3️⃣ Why size 256?
 * 
 * ASCII defines 256 characters (values 0–255).
 * Java char is technically 16-bit (Unicode), but your program assumes input is
 * basic ASCII.
 * Using 256 ensures that any character in basic ASCII can be tracked using its
 * ASCII code as the index.
 * Example:
 * Character ASCII code Index in charPresent
 * 'A' 65 charPresent[65]
 * 'a' 97 charPresent[97]
 * ' ' 32 charPresent[32]
 * 
 * -----------------------------------------------------------------------------
 * ------------------------------------------------------------------------
 * 4️⃣ How it helps
 * Fast lookup: Checking charPresent[ch] is O(1).
 * Efficient tracking: You don’t need loops or HashMaps for basic ASCII
 * characters.
 * Used together with repeated[] to know if a character is unique in the word.
 * 
 * 5️⃣ Example
 * Word = "java"
 * -----------------------------------------------------------
 * | i | ch | charPresent[ch] before → after | repeated[ch] |
 * | - | --- | ------------------------------ | ------------ |
 * | 0 | 'j' | `false → true` | `false` |
 * | 1 | 'a' | `false → true` | `false` |
 * | 2 | 'v' | `false → true` | `false` |
 * | 3 | 'a' | `true → true` | `true` |
 * |---------------------------------------------------------|
 * 
 * Then printing charPresent[ch] && !repeated[ch] → only prints 'j' and 'v'. ✅
 * boolean[256] is like a lookup table for every ASCII character.
 * Each index tells you whether a character appeared (charPresent) or was
 * repeated (repeated) in the current word.
 * Using 256 makes it simple and fast — no loops to count each character
 * manually.
 * -----------------------------------------------------------------------------
 * ----------------------------------------------------------------------------
 * Explanation
 * 
 * 1).i = 0, ch = 'j'
 * -------------------
 * 'j' has not appeared yet, so charPresent['j'] = false.
 * Mark it as present: charPresent['j'] = true.
 * It’s the first occurrence → repeated['j'] = false.
 * =============================================================================
 * ========================================================================
 * 2).i = 1, ch = 'a'
 * ------------------
 * 'a' has not appeared yet, so charPresent['a'] = false.
 * Mark it as present: charPresent['a'] = true.
 * First occurrence → repeated['a'] = false.
 * =============================================================================
 * ==============================================================
 * 3).i = 2, ch = 'v'
 * ------------------
 * 'v' has not appeared yet, so charPresent['v'] = false.
 * Mark it as present: charPresent['v'] = true.
 * First occurrence → repeated['v'] = false.
 * =============================================================================
 * ===========================================================================
 * 
 * 4).i = 3, ch = 'a'
 * -------------------
 * 'a' has already appeared, so charPresent['a'] = true.
 * Because it’s now a repeated character, we mark it: repeated['a'] = true.
 * charPresent['a'] stays true because it still exists in the word.
 * 
 * Key Point
 * charPresent[ch] → has this character appeared at least once?
 * repeated[ch] → has this character appeared more than once?
 * By the end of the word "java":
 * 'j' → present, not repeated → unique
 * 'a' → present, repeated → not unique
 * 'v' → present, not repeated → unique
 * 
 * ✅ That’s why the program prints: "jv" as the unique characters in "java".
 * =============================================================================
 * =============================================================================
 * ==========================================
 * 1️⃣ char ch = word.charAt(i);
 * Gets the character at index i of the current word.
 * Example: if word = "java", then ch will be 'j', 'a', 'v', 'a' in sequence.
 * 
 * 2️⃣ The condition:
 * charPresent[ch] && !repeated[ch] || ch == ' '
 * Let’s break it into parts:
 * 
 * a) charPresent[ch] && !repeated[ch]
 * charPresent[ch] → true if this character appeared at least once.
 * !repeated[ch] → true if this character was not repeated.
 * Together: true only if this character appeared exactly once in the word
 * (unique).
 * 
 * b) ch == ' '
 * This is a safety check.
 * If the character is a space, it allows it to pass the condition (though
 * inside a word, there shouldn’t be spaces — it’s mostly redundant here because
 * you already split the words).
 * 
 * 3️⃣ Combining with || (OR)
 * (charPresent[ch] && !repeated[ch]) || ch == ' '
 * Prints the character if:
 * It is unique in the word, OR
 * It is a space.
 * In most cases, spaces will not appear inside a word because you already split
 * by whitespace. So effectively, it prints only the unique characters of the
 * word.
 */
