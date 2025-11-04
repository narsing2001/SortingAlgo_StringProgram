package J12;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) 
    {
       // String str = "madam";
    	Scanner sc =new Scanner(System.in);
    	System.out.print("Enter the string:");
    	String str=sc.next();
        boolean isPalindrome = isPalindrome(str);
        if (isPalindrome) 
        {
            System.out.println(str + " is a palindrome.");
        } else 
        {
            System.out.println(str + " is not a palindrome.");
        }
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) 
    {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) 
        {
            if (str.charAt(start) != str.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}