package J12;
import java.util.*;
/*Symbol character condition list:
--------return--true/false--------------------------------------------------
1.open brackets must be closed by the same type of the brackets:
2.open bracket must be closed in the correct order:
3.Every close bracket has a corresponding open bracket of same type:
-----------------------------------------------------------------------*/
class ValidParenthesis
{
 public boolean isValid(String s)
{	 
//create stack to hold the opening parenthesis

Stack<Character> st=new Stack<Character>();

//iterate through each character in the string----------------------------------------
          for(char ch:s.toCharArray())
{
//if symbol is opening bracket push it onto the stack-------------------------------------

           if(ch=='(' ||ch=='{' || ch=='[') 
            {
               st.push(ch);
		    }
//if it is closing bracket check for matching opening bracket-------------------------
		   else if (ch==')' || ch=='}' || ch==']')
		   {
			//stack is empty or top does not match return false
                    if(st.isEmpty())
                       {
                         return false;
                        }
//pop top of the stack-----------------------------------------------------------------
                char top=st.pop();
//check for corresponding matching bracket----------------------------------------------------------
                 if((ch==')' && top!='(') || (ch=='}' && top!='{') ||(ch==']' && top!='['))
                     {
                       return false;
                     }	   
		   }
	   }
	return st.isEmpty();
}
}
public class Bracket
{

   public static void main(String args[])
   {
	   ValidParenthesis v=new ValidParenthesis();
	   System.out.println("Symbol character condition list:");
		 System.out.println("--------return--true/false--------------------------------------------------");
		 System.out.println("1.open brackets must be closed by the same type of the brackets:");
		 System.out.println("2.open bracket must be closed in the correct order:");
		 System.out.println("3.Every close bracket has a corresponding open bracket of same type:");
		 System.out.println("-----------------------------------------------------------------------");
	   Scanner sc=new Scanner(System.in);
	   System.out.print(" Enter the Bracket Expression:");
	   String s1=sc.next();
	   System.out.print("Input:"+s1+"-> output:"+v.isValid(s1));
   }
}
/*====================================================================
 Symbol character condition list:
--------return--true/false--------------------------------------------------
1.open brackets must be closed by the same type of the brackets:
2.open bracket must be closed in the correct order:
3.Every close bracket has a corresponding open bracket of same type:
-----------------------------------------------------------------------
 Enter the Bracket Expression:()[]{}
Input:()[]{}-> output:true
-------------------------------------------------------------------------------
 Enter the Bracket Expression:([{}])
Input:([{}])-> output:true
----------------------------------------------------
Enter the Bracket Expression:(){}[]
Input:(){}[]-> output:true
----------------------------------------------------
 Enter the Bracket Expression:[({)}]
Input:[({)}]-> output:false
----------------------------------------------------
 Enter the Bracket Expression:(]
Input:(]-> output:false
*/
