package J12;
// java programme to count occurence of each character in the given string
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class CharEach 
{
	 public static Map<Character, Integer> counteach(String str) 
	 {
	        Map<Character, Integer> countMap = new HashMap<>();

	        // Iterate through the string
	        for (char c : str.toCharArray())
	        {
	            countMap.put(c, countMap.getOrDefault(c,0) + 1);
	        }

	        return countMap;
	 }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Count occurrences of each character
        Map<Character, Integer> cnt = counteach(str);

        // Display the results
        System.out.println("Character occurrences:");
        for (Map.Entry<Character, Integer> entry : cnt.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
	}
}
/*--------------------------------------------------------------------
Enter a string: my name is narsing patil
Character occurrences:
 : 4
a: 3
e: 1
g: 1
i: 3
l: 1
m: 2
n: 3
p: 1
r: 1
s: 2
t: 1
y: 1
--------------------------------------------------------------------------------
Enter a string: my name is narsing patil and i am a web developer
Character occurrences:
 : 10
a: 6
b: 1
d: 2
e: 5
g: 1
i: 4
l: 2
m: 3
n: 4
o: 1
p: 2
r: 2
s: 2
t: 1
v: 1
w: 1
y: 1
*/