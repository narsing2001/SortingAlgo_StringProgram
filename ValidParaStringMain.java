


// Online Java Compiler
// Use this editor to write, compile and run your Java code online


import java.util.*;

/**
 * Program to check if a given string has valid parentheses.
 * 
 * Rules:
 * 1. Each opening bracket must be closed by the same type of bracket.
 * 2. Brackets must close in the correct order.
 * 3. Every closing bracket must have a corresponding opening bracket.
 */
class ValidParenthesis {

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            // Push the expected closing bracket for each opening bracket
            if (ch == '(') st.push(')');
            else if (ch == '{') st.push('}');
            else if (ch == '[') st.push(']');
            
            // For closing brackets, check if they match the expected top of the stack
            else if (st.isEmpty() || st.pop() != ch) {
                return false; // mismatch or no opening bracket
            }
        }

        // If stack is empty, all brackets matched correctly
        return st.isEmpty();
    }
}

public class ValidParaStringMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ValidParenthesis validator = new ValidParenthesis();

        System.out.println("Symbol Character Condition List:");
        System.out.println("1. Open brackets must be closed by the same type.");
        System.out.println("2. Open brackets must be closed in correct order.");
        System.out.println("3. Every closing bracket must have a matching open bracket.");
        System.out.println("-----------------------------------------------------------");

        System.out.print("Enter the Bracket Expression: ");
        String input = sc.nextLine();

        boolean result = validator.isValid(input);
        System.out.println("Input: " + input + " -> Output: " + result);
    }
}
