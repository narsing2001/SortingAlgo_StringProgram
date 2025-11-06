package StrProg;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
public class StrMethod {

	public static void main(String[] args) {
		
		String str1="My Name Is 👋 Narsing Patil";
        String str2=" Whats Your Name ";
        String str3 = "Hello";
        String str4 = "Hello";
        String str5 = "hello";
        
        System.out.println("length of string str:"+str1.length());
        System.out.println("charAt index 5:"+str1.charAt(5));
        System.out.println("return the unicode code point value of character at 5 index in given string:"+str1.codePointAt(5));
        System.out.println("return the unicode code point value of character before 5 index in given string:"+str1.codePointBefore(5));
       
/*
syntax:: 
int codePointCount(int beginIndex, int endIndex)
beginIndex – starting index (inclusive)
endIndex – ending index (exclusive)
Returns: number of Unicode code points in that range. 
*/
       
        System.out.println("count no of codepoints in the substring of the given  String:"+str1.codePointCount(0, 24));
/*
Step-by-Step Execution
String: "A👋B"
Char Indexes vs Code Points:

Char     Index	               CharCodePointIndex	Notes
0	     A	                    0	                normal char
1	     👋 (high surrogate)	    1	                part of emoji
2	     👋 (low surrogate)	    1	                part of emoji
3	     B	                    2	                normal char
--------------------------------------------------------------------------------------

Step 1: Start at index 0 → 'A' (code point 0)
Step 2: Move 1 code point → '👋' (char indexes 1 & 2)
Step 3: Move 1 more code point → 'B' (char index 3)

✅ So, new char index = 3
Output::
String: A👋B
Length (chars): 4
New char index: 3
Substring(0, newIndex): 'A👋B'

Key Points::

length() counts char units, not code points.
"A👋B".length() → 4 chars
"A👋B" has 3 code points

offsetByCodePoints counts actual Unicode characters.
Using index + codePointOffset can break surrogate pairs, producing invalid characters.
offsetByCodePoints is safe for strings with emojis, accented letters, or non-BMP Unicode characters. 
*/     
        
        
        System.out.println("offeset by codepoint:"+str1.offsetByCodePoints(0, 4));
        System.out.println("converting uppercase:"+str1.toUpperCase());
        System.out.println("converting lowercase:"+str1.toLowerCase());
        System.out.println("return substring from the given index:"+str1.substring(11));
        System.out.println("Returns substring between indexes:"+str1.substring(3, 26));
        System.out.println("Returns CharSequence between indexes:"+str1.subSequence(0, 7));
        System.out.println("Checks if two strings have exactly the same characters, with case sensitivity:"+str3.equals(str5)); // false (case-sensitive)
        System.out.println("check two string are equal with case insensitive:"+str3.equals(str4)); // true case insensitive

        System.out.println("Checks if two strings are equal, ignoring case differences1:"+str3.equalsIgnoreCase(str5));
        System.out.println("Checks if two strings are equal, ignoring case differences2:"+str3.equalsIgnoreCase(str4));
/*
🧩 3️⃣ compareTo(String anotherString)Description:
Compares two strings lexicographically (dictionary order).
Returns:
0 → if both strings are equal
<0 → if current string is smaller
>0 → if current string is greater  
*/
        System.out.println("compare two string lexographically using compareTo method1:"+str3.compareTo(str4));
        System.out.println("compare two string lexographically using compareTo method2:"+str3.compareTo(str5));
        System.out.println("compare two string lexographically but ignore case difference1:"+str3.compareToIgnoreCase(str3));
        System.out.println("compare two string lexographically but ignore case difference2:"+str3.compareToIgnoreCase(str5));
/*
🧩 5️⃣ contentEquals(CharSequence cs)
Description:
Checks whether the string has the same characters as a given CharSequence (like StringBuilder, StringBuffer, etc.). 
contentEquals allows comparison not just with other Strings, but also with objects that implement the CharSequence interface.
 ------------
 boolean contentEquals(CharSequence cs)

 */   
        String str = "Hello";
        StringBuilder sb = new StringBuilder("Hello");
        StringBuffer buffer = new StringBuffer("Hello");
        
        System.out.println("check whether the charsequence has the same character as given CharSequence using string and stringBuilder:"+str.contentEquals(sb));
        System.out.println("check whether the charsequence has the same character as given CharSequence using string and stringBuffer:"+str.contentEquals(buffer));
        System.out.println("check charsequence equals to the string literals:"+str.contentEquals("Hello"));
       
 /*
 🧩 6️⃣ contentEquals(StringBuffer sb)
Description:
Overloaded version of contentEquals() specifically for StringBuffer objects.
(It internally calls the CharSequence version.) 
-------------
boolean contentEquals(StringBuffer sb)
*/       
        
        String str6 = "Java";
        StringBuffer sb1 = new StringBuffer("Java");
        StringBuffer sb2 = new StringBuffer("JAVA");
        System.out.println("compare given string object with stringBuffer same case  same string:"+str6.contentEquals(sb1));
        System.out.println("compare given string object with stringBuffer different case same string:"+str6.contentEquals(sb2));
      
        String text = "programming is good and very good";
        
        System.out.println("Finds the first occurrence of the given character (ch) in the string:"+text.indexOf('g'));
        
        System.out.println("Finds the first occurrence of a given character starting from a specific index:"+text.indexOf('g',4));
        System.out.println("Finds the first occurrence of a substring in the main string:"+text.indexOf("good"));
        System.out.println("Finds the first occurrence of a substring, starting search from a specific index:"+text.indexOf("good",16));
        System.out.println("Finds the last occurrence of the given character in the string:"+text.lastIndexOf('g'));
        System.out.println("Finds the last occurrence of a character, searching backward starting from a specific index:"+text.lastIndexOf('g', 9));
        System.out.println("Finds the last occurrence of a substring:"+text.lastIndexOf("good"));
        System.out.println("Finds the last occurrence of a substring, starting search backward from a given index:"+text.lastIndexOf("good", 26));
      
        
        String str7 = "abc123";
        String str8 = "abc";
        
        
        System.out.println("Checks if the entire string matches a regular expression (regex) pattern1:"+str7.matches("[a-z]+[0-9]+"));
        // true → letters then digits
        
        System.out.println("Checks if the entire string matches a regular expression (regex) pattern2:"+str8.matches("[a-z]+[0-9]+"));
        // false → no digits
        
        System.out.println("Checks if the entire string matches a regular expression (regex) pattern3:"+"123".matches("\\d+"));
        // true → digits only
        
        String str9 = "JavaProgramming";
        
        System.out.println("Checks if a string starts with a specified prefix:"+str9.startsWith("Java")); //true
        
        System.out.println("Checks if the string starts with a given prefix, starting from a specified index (offset):"+str9.startsWith("Program",4));
        
        
        String str10 = "HelloWorld.java";
        System.out.println("Checks if a string ends with the given suffix:"+str10.endsWith(".java"));
        
        
        //String trim()==>It does not remove other Unicode whitespace characters.
        String text1 = "   Hello World   ";
        System.out.println("Before: [" + text1 + "]"+":->"+"Removes leading and trailing spaces (ASCII spaces: '\\u0020') from the string:"+"After: [" + text1.trim() + "]");
       
        String text2 = "\u2003Hello World\u2003"; 
        // Unicode spaces
        System.out.println("Before: [" + text2 + "]"+":->"+"Removes leading and trailing Unicode whitespace using strip()— more powerful than trim():"+"After : [" + text2.strip() + "]");
        
        
        String text3 = "   Hello World   ";
        System.out.println("Removes only leading (left-side) whitespace: "+"Result: [" + text3.stripLeading() + "]");
        System.out.println("Removes only trailing (right-side) whitespace: "+"Result: [" + text3.stripTrailing() + "]");
        
        String text4 = "banana";
        System.out.println(text4+":->"+"Replaces all occurrences of one character with another:"+text4.replace('a', 'o'));
        
        
        //Unlike replaceAll(), this does not treat the pattern as a regex — it’s a simple literal replacement.
        String text5 = "I like Java. Java is powerful!";
        System.out.println("Replaces all occurrences of a substring (CharSequence) with another substring:"+text5.replace("Java", "Python"));
        
        System.out.println("Replaces all occurrences that match a regular expression (regex):"+text5.replaceAll("java", "JAVA"));
        System.out.println("replace all spaces with hypens:"+text5.replaceAll("\\s","-")); //replace spaces with hypens
        System.out.println("Replaces only the first match of a regex pattern:"+text5.replaceFirst("Java","Python"));
      
	    //🧩 2. split(String regex, int limit)
        String text6 = " a,b,c,,";
            
        //🧩 1. split(String regex)
        String[]arr1=text6.split(",");
        System.out.println("Splits a string wherever the regex matches:"+Arrays.toString(arr1));        
	
        //➤ Case 1: text.split(",", 2)==>👉 Split only once (limit - 1 = 1 split)i.e last digit excluded
        String []arr2= text6.split(",",2);
        System.out.println("Adds a limit on how many splits happen and how empty parts are handled: "+Arrays.toString(arr2));
        
        //➤ Case 2: text.split(",", 0)
        String []arr3=text6.split(",",0);
        System.out.println("Split normally, remove trailing empty parts:->"+Arrays.toString(arr3));
	
	    //➤ Case 3: text.split(",", -1)
        String []arr4=text6.split(",",-1);
        System.out.println("Split normally, keep trailing empty parts:->"+Arrays.toString(arr4));
	
        
        String s = "  Hello  ";
        String blank = "   ";
        System.out.println("removing leading and trailing whitespaces:"+s.strip());
        System.out.println("removing the leading whitespaces:"+s.stripLeading());
        System.out.println("removing trailing whitespaces:"+s.stripTrailing());
        
        //Returns true if the string is empty or contains only whitespace (spaces, tabs, newlines, Unicode whitespace).
        System.out.println("check if string is empty or contains only whitespace (spaces, tabs, etc.):"+s.isBlank());
        String s1 = "";
        String s2 = "   ";
        String s3 = "\n\t";
        
        System.out.println("using isBlank method:--------");
        System.out.println("isBlank(),if string contain no character:"+s1.isBlank());
        System.out.println("isBlank(),if string contain only whitespaces:"+s2.isBlank());
        System.out.println("isBlank(),if string contain newline whitespaces:"+s3.isBlank());
               
/*
|-------------|-------------------|--------------------|
| Method      | Empty String `""` | Whitespace `"   "` |
| ----------- | ----------------- | ------------------ |
| `isEmpty()` | true              | false              |
| `isBlank()` | true              | true               |
|------------------------------------------------------| 
 */
        System.out.println("using isEmpty method:--------");
        System.out.println("isEmpty() return true if the string has no character at all:"+s1.isEmpty());
        System.out.println("isEmpty() whitespace count as character so string only spaces:"+s2.isEmpty());
        System.out.println("isEmpty() String with tabs is not empty  using isEmpty Method::"+s3.isEmpty());
	     
        
        String s11 = "Hello";
        String s12 = "Hello";
        String s13 = "hello";

//System.out.println(s11.equals(s12)); // true (same content)
//System.out.println(s1.equals(s3)); // false (case-sensitive)
//System.out.println(s1 == s2);      // true (might be same reference in string pool)

        //check logical equality(case-sensitive for string)
        System.out.println("same content without case-sentitive using .equals-method:"+s11.equals(s12));
        System.out.println("same content with case-sentitive using .equals-method:"+s11.equals(s13));
        System.out.println("same content without case-sentitive using == operator:"+(s11==s12));
        System.out.println("same content with case-sentitive using == operator:"+(s11==s13));
	
        System.out.println("hashcode for the Hello:"+s11.hashCode());
        System.out.println("hashcode for the hello:"+s13.hashCode());
        
        
        String str14="my name is narsu";
        String [] arr5=str14.split(" ");
        System.out.println("return a string representation of an object without toString:"+arr5);
    	int i=0;
        for(String s15:arr5){ 
        	System.out.println("Array string at-"+i+"th index= "+s15);
        	i++;       	
        }
        System.out.println("Array string using toString method:"+Arrays.toString(arr5));
        char [] chars=str14.toCharArray();
        
        //Use case: When you want to manipulate individual characters of a string.
        System.out.println("converting a string to character array:"+Arrays.toString(chars));
        
        //Use case: Ensures consistent encoding when converting strings to bytes across different systems.
        byte [] bytes16=str14.getBytes(StandardCharsets.UTF_16);
        byte [] bytes8=str14.getBytes(StandardCharsets.UTF_8);
        System.out.println("Converts the string into a byte array using a specific UTF-16 charset:"+Arrays.toString(bytes16));
        System.out.println("Converts the string into a byte array using a specific UTF-8 charset:"+Arrays.toString(bytes8));
   
        
/*
🔹1. What is intern() in Java?
-------------------------------
The String.intern() method ensures that a string refers to the string pool (SCP) — the special area in heap memory where Java stores unique string literals.
If a string with the same content already exists in the String Constant Pool, intern() returns the reference of that existing string.
If not, it adds the new string to the pool and returns that reference.

🔹2. Example Code — Checking with == and equals()
------------------------------------------------
public class InternDemo {
    public static void main(String[] args) {
    
        // String literal → stored in String Constant Pool (SCP)
        String s1 = "hello";

        // Created using 'new' → stored in heap, NOT in SCP
        String s2 = new String("hello");

        // Compare without intern()
        System.out.println(s1 == s2);       // false → different references
        System.out.println(s1.equals(s2));  // true  → same content

        // Now use intern() on s2
        String s3 = s2.intern();

        // Compare again
        System.out.println(s1 == s3);       // true → both refer to SCP
        System.out.println(s1.equals(s3));  // true → same content
    }
}
🔹 3. Step-by-Step Explanation
------------------------------------------------------------------------------------------------------------
Variable   |    How it's created       |  Memory location	       |    Comment                             |
------------------------------------------------------------------------------------------------------------|
s1	            Literal "hello"	          String Constant Pool	       Stored automatically                 |
s2	            new String("hello")	      Heap	                       Separate copy from SCP               |
s3	            s2.intern()	              String Constant Pool	       Returns SCP reference of "hello"     |
------------------------------------------------------------------------------------------------------------|
🔹 4. Output
false
true
true
true
🔹 5. Why this happens
== → compares references (memory addresses).

equals() → compares values (content).
intern() → ensures you’re comparing strings from the same pool reference, so == becomes true.

✅ Quick Summary
Expression	              Result	        Reason
-------------------------------------------------------------
s1 == s2	              false	            Heap vs SCP
s1.equals(s2)	          true	            Same content
s1 == s2.intern()	      true	            Both in SCP
s1.equals(s2.intern())    true	            Same content

Would you like me to show an example with different strings (e.g. user input vs literal) to see how intern() behaves in that case
*/
        
        // String literal → stored in String Constant Pool (SCP)
        String s15 = "hello";

        // Created using 'new' → stored in heap, NOT in SCP
        String s16 = new String("hello");

        // Compare without intern()
        System.out.println("using string literals and new string with == before interns():"+(s15 == s16));       // false → different references
        System.out.println("using string literals and new string with .equals before interns():"+(s15.equals(s16)));  // true  → same content

        // Now use intern() on s2
        String s17 = s16.intern();

        // Compare again
        System.out.println("using string literals and new string with == after interns():"+(s15 == s17));       // true → both refer to SCP
        System.out.println("using string literals and new string with .equals after interns():"+(s15.equals(s17)));   // true → same content
        
        
        String str18="Narsing";
        System.out.println("returns an IntStream of Unicode code units for each char without casting:");
        str18.chars().forEach(ch->System.out.println(ch));
        
        System.out.println("returns an IntStream of Unicode code units for each char with casting:");
        str18.chars().forEach(ch->System.out.println((char) ch));
        
        
        System.out.println("Returns Unicode code points, correctly handling multi-byte characters (like emojis):");
        String s18="A😊B";
        s.codePoints().forEach(cp->System.out.println(cp));
        
        System.out.println("Splits a string into a Stream<String> of lines (Java 11+)");
        String str19="Hello\nWorld\nJava";
        str19.lines().forEach(System.out::println); 

        String result = "java".transform(x -> x.toUpperCase())
        		               .transform(x -> x+ " WORLD!");
        System.out.println("Applies a function to the string and returns the transformed result (Java 12+):=>"+result);
   
        String text7 = "Narsing is BE Graduate Person\n And He Is Persuing BE From Dy Patil";
        System.out.println("Adds indentation to each line; if n is negative, removes leading spaces (Java 12:"+text.indent(4));
        
        String s19="Narsing ";
        System.out.println("Repeats the string count times (Java 11+):"+(s19.repeat(3)));
        
        
/*
 * 🧩 What String.format() => String.format(String format, Object... args)
creates a new formatted string, similar to System.out.printf() but returns the string instead of printing it.
|-----------------------------------------------------------|
| Specifier | Type                 | Example   | Output     |
| --------- | -------------------- | --------- | ---------- |
| `%s`      | String               | `"Hello"` | `Hello`    |
| `%d`      | Integer (decimal)    | `100`     | `100`      |
| `%f`      | Floating point       | `3.14159` | `3.141590` |
| `%c`      | Character            | `'A'`     | `A`        |
| `%b`      | Boolean              | `true`    | `true`     |
| `%x`      | Hexadecimal integer  | `255`     | `ff`       |
| `%o`      | Octal integer        | `8`       | `10`       |
| `%%`      | Literal percent sign | –         | `%`        |
|-----------------------------------------------------------|

✅ %1$d = first argument (integer)
✅ %2$s = second argument (string)
---------------------------------------------------
✅ %tB = full month name
✅ %td = day of month
✅ %tY = year

*/
        String result1=String.format("Name:%s, Age:%d", "Narsing",24);
        System.out.println("Formats strings similar to printf() in C:"+result1); 
        
        //Decimal and Floating-Point Control
        double price = 12.34567;
        System.out.println(String.format("Price: %.2f", price));  // 2 decimal places
        //✅ %.2f means "format as floating-point with 2 digits after the decimal."
        
        
        //Padding and Alignment
        System.out.println(String.format("|%10s|", "Java"));  // Right-align in width 10
        System.out.println(String.format("|%-10s|", "Java")); // Left-align
        System.out.println(String.format("|%05d|", 42));      // Pad with zeros
        
        //Combining Multiple Placeholders
        String name = "Bob";
        int age = 30;
        double height = 5.9;

        String formatted = String.format("Name: %s, Age: %d, Height: %.1f ft", name, age, height);
        System.out.println(formatted);
        
        //🔹 Reordering Argument You can use argument indexes 2$s=place and format second argument, 1$d=place and format first argument
        String msg = String.format("%2$s scored %1$d marks", 95, "Alice");
        System.out.println(msg);
        
        //Including Date and Time You can format dates with %t specifiers:
        Date now = new Date();
        String formatted2 = String.format("Today: %1$tB %1$td, %1$tY", now);
        System.out.println(formatted2);
        
        //You can format numbers or currencies based on locale:
        
        double money = 12345.678;
        String us = String.format(Locale.US, "Amount: %,.2f", money);
        String fr = String.format(Locale.FRANCE, "Montant: %,.2f", money);

        System.out.println(us); // Amount: 12,345.68
        System.out.println(fr); // Montant: 12 345,68
        
/*
🔹 Using printf() vs format()
Both are similar, but:
System.out.printf() → prints directly
String.format() → returns a string 
*/
        System.out.printf("Hi %s%n", "Java"); // prints directly
        String s4 = String.format("Hi %s", "Java"); // stores in variable
 
        //🧩 2. valueOf(boolean b)
        System.out.println("Converts a boolean to a string: "+String.valueOf(true));     // "true"
        
        //🧩 3. valueOf(char c)
        System.out.println("Converts a single character to a string:"+String.valueOf('A')); // "A"
        
        //🧩 4. valueOf(char[] data)
        char [] arr6= {'N','a','r','s','i','n','g',' ','P','a','t','i','l'};    
        System.out.println("Converts a character array into a string:"+String.valueOf(arr6));
	    
        //🧩 5. valueOf(char[] data, int offset, int count) excluded last count 
        System.out.println("Converts a portion of a character array into a string:"+String.valueOf(arr6,0,7));
        
        //🧩 6. valueOf(double d)
         System.out.println("Converts a double to a string:"+String.valueOf(3.12159));

        //🧩 7. valueOf(float f)
        System.out.println("Converts a float to a string:"+String.valueOf(9.82f));
	
	    //🧩 8. valueOf(int i)
        System.out.println("Converts an integer to a string:"+String.valueOf(100));
         
        //🧩 9. valueOf(long l)
        System.out.println("Converts a long to a string:"+String.valueOf(123456789L));
         
        //🧩 10. valueOf(Object obj) 
        Object obj = new java.util.Date();
        System.out.println("Converts any object to a string — calls obj.toString() internally (or \"null\" if the object is null):"+String.valueOf(obj));

        System.out.println("for null object:"+String.valueOf((Object) null)); // "null"  
	
        
  // boolean contains(CharSequence sequence) Method 
        String s5 = "Hello, World!";
        System.out.println("method returns true if string contains the given string:"+s5.contains("World"));
            
        
	}
}
