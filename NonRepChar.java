package J12;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;
public class NonRepChar {

	public static void main(String[] args) 
	{
		  Scanner sc = new Scanner(System.in);

	        // Input the string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();
	        
	        Map<Character, Integer> charCount = new LinkedHashMap<>();
	        
	        // Iterate through the string
	        for (char c : str.toCharArray())
	        {
	            charCount.put(c, charCount.getOrDefault(c,0) + 1);
	        }
	        
	        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) 
	        {
	        	if(entry.getValue()==1) 
	        	{
	        		System.out.println(entry.getKey());	
	        	}
	        	
	        }
	}

}
/*----------------------------------------------------------------------------------------
C:\Users\Narsing Patil\OneDrive\Desktop>java  NonRepChar
Enter a string: hello
h
e
o

C:\Users\Narsing Patil\OneDrive\Desktop>java  NonRepChar
Enter a string: narsing
a
r
s
i
g

C:\Users\Narsing Patil\OneDrive\Desktop>java  NonRepChar
Enter a string: full stack developer
f
u
s
t
a
c
k
d
v
o
p
r
*/