
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNoOfCharUsingJava8Stream {

	public static void main(String[] args) {
		System.out.print("Enter the string or sequence of the string::");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		
//Method-1:: Count occurrences of each character
Map<Character, Long> charCount1=str1.chars()  //IntStream of chars is generate by chars() in the form of the character
	       .mapToObj(c->(char)c)  //convert ascii int to character
		   .filter(c->c!=' ')     //optional skip space character
		   .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println("count1 of each char in "+str1+" "+"is:"+charCount1);
		 
		
//Method-2::Count each character (case-insensitive, ignoring spaces) count only letters
Map<Character, Long> charCount2=str1.toLowerCase().chars()
		   .mapToObj(c->(char)c)
		   .filter(Character::isLetter)
		   .collect(Collectors.groupingBy(
				        Function.identity(),
				        Collectors.counting()));
System.out.println("count2 of each char in "+str1+" "+"is:"+charCount2);      
		
		
// Example 4: Count characters but maintain order of first appearance using LinkedHashmap
Map<Character, Long> orderedCount =str1.chars()
		     .mapToObj(c->(char)c)
		     .collect(Collectors.groupingBy(
		    		            Function.identity(),
		    		            LinkedHashMap::new,  //preserve the insertion order
		    		            Collectors.counting()));
System.out.println("order count of each char in "+str1+" "+"is:"+orderedCount); 
		


 
String input = "java stream count word word count stream";	  
/*
Example-1: Count occurrences of each word in given sentence 
---------------------------------------------------------------------------------------------------------
-Arrays.stream(input.split("\\s+")): converts the sentence into a stream of words.
-groupingBy(Function.identity(), counting()): groups identical elements and counts their occurrences.
-Works the same way for characters using input.chars(). 
*/
Map<String,Long> wordCount=Arrays.stream(input.split("\\s+"))
		       .collect(Collectors.groupingBy(
		    		    Function.identity(),
		    		    Collectors.counting() ));
System.out.println(" Count occurrences of each word in given sentence"+wordCount);


/*
Example 2: Count each word (ignore case and punctuation)
----------------------------------------------------------------------------------------------------------
Removed .toLowerCase() → so original capitalization is preserved.
Updated regex to [a-zA-Z\\s] → keep both uppercase and lowercase letters while removing punctuation.
Function.identity() → groups words exactly as they appear. 
*/


Map<String, Long> wordCount1 =Arrays.stream(input.toLowerCase()
		      .replaceAll("[^a-z\\\\s]","") //remove punctuations
		      .split("\\s+"))               // split by one or more(+) spaces
              .collect(Collectors.groupingBy(
        		       Function.identity(), // group by the exact word
        		       Collectors.counting()));
System.out.println("Count each word (ignore case and punctuation):"+wordCount1);


//Example 3: Count vowels and consonants separately

  Map<String,Long>countMap=input.toLowerCase().chars().mapToObj(c->(char)c)
              .filter(Character::isLetter)
              .collect(Collectors.groupingBy(
            		          c->"aeiou".indexOf(c)>=0?"vowels":"consonants",
            				  Collectors.counting()));
  System.out.println("Count vowels and consonants separately:"+countMap);
      
  String paragraph = "Java streams are powerful. Streams simplify code. "
          + "Using Java streams improves readability.";
  
  
/*
1️ wordCount.entrySet().stream()
=>
wordCount is a Map<String, Long> (words → count).
.entrySet() returns a Set of Map entries (Set<Map.Entry<String, Long>>).
.stream() converts this set into a Stream of Map.Entry objects so we can process it with Stream operations.  
 
2️ .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
-----------------------------------------------------------------
=>
-Map.Entry.comparingByValue() → comparator that compares Map entries by their values (Long counts in this case).
-<String, Long> → generic type hint for the compiler.
-.reversed() → sorts in descending order (highest count first).
-------------------------------------------------------------------
3️.forEach(System.out::println)
=>
Iterates over the sorted stream and prints each entry.
Each entry prints as word=count because Map.Entry.toString() outputs that format.
-----------------------------------------------------------
Step 1️: c -> "aeiou".indexOf(c) >= 0 ? "Vowels" : "Consonants"

This is a lambda function that takes a character c.
"aeiou".indexOf(c):Searches for the character c in the string "aeiou".
Returns -1 if c is not found, or a number ≥ 0 if it is found.
>= 0 ? "Vowels" : "Consonants":

If the character is found in "aeiou" → it’s a vowel.
If not found → it’s a consonant.

✅ So basically, each character is mapped to either "Vowels" or "Consonants".

Step 2️: Collectors.groupingBy(..., Collectors.counting())
-groupingBy → groups elements of a stream by a classifier function (here, the lambda).
-Collectors.counting() → counts how many elements are in each group.

Step 3️⃣: How it works together

Suppose the input string is:
String input = "hello";


Stream processing:
"hello".chars().mapToObj(c -> (char)c) → Stream of h, e, l, l, o.

Group by the lambda:

h → not in "aeiou" → "Consonants"
e → in "aeiou" → "Vowels"
l → "Consonants"
l → "Consonants"
o → "Vowels"

Count each group using Collectors.counting().
Step 4️: Result
{Consonants=3, Vowels=2}
3 consonants: h, l, l
2 vowels: e, o


*/

Map<String, Long> wordCount3 = Arrays.stream(
		         paragraph.toLowerCase()
                 .replaceAll("[^a-z\\s]", "")
                 .split("\\s+"))
              .collect(Collectors.groupingBy(
                         Function.identity(),
                         Collectors.counting()));

 wordCount3.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed())
 .forEach(System.out::println);

	}

}

/*Output:
----------------------------------------
Enter the string or sequence of the string::my name is narsing patil
count1 of each char in my name is narsing patil is:{p=1, a=3, r=1, s=2, t=1, e=1, g=1, i=3, y=1, l=1, m=2, n=3}
count2 of each char in my name is narsing patil is:{p=1, a=3, r=1, s=2, t=1, e=1, g=1, i=3, y=1, l=1, m=2, n=3}
order count of each char in my name is narsing patil is:{m=2, y=1,  =4, n=3, a=3, e=1, i=3, s=2, r=1, g=1, p=1, t=1, l=1}
 Count occurrences of each word in given sentence{java=1, stream=2, count=2, word=2}
Count each word (ignore case and punctuation):{javastreamcountwordwordcountstream=1}
Count vowels and consonants separately:{vowels=12, consonants=22}
streams=3
java=2
readability=1
using=1
code=1
powerful=1
are=1
improves=1
simplify=1
*/