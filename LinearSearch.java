package J12;
import java.util.Scanner;
public class LinearSearch {
	public static int linearsearch(int arr[],int target) 
	{
		//iterate through the array
		for(int i=0;i<arr.length;i++) {
			//check if current element matches the target element 
			if(arr[i]==target)
			{
				//yes than return the index no 
				return i;
			}
		}
		return -1;
	}
		public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("How many element want to store:: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter element one by one::");
		for(int i=0;i<arr.length;i++) 
		{
		arr[i]=sc.nextInt();	
		}
		System.out.print("enter target element want to search from array::");
		int target=sc.nextInt();
		
		
	    int result=linearsearch(arr,target);
	   
	    //output the result
	    if(result!=-1)
	    {
	    System.out.println("Element found at index::"+result);
	    }
	   else
	   {
		System.out.println("Element  not found at index of Array::");
	  }
	}
}
//-------------------------------------------------------------------------------------------
/*How many element want to store:: 9
enter element one by one::
1
9
8
5
3
6
7
3
2
enter target element want to search from array::7
Element found at index::6
*/
