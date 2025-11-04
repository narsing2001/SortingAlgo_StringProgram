package J12;

import java.util.Scanner;

public class BinarySearchIterative {
	public static int binarysearch(int arr[],int target) 
	// public static void binarysearch(int arr[],left,right,target)
	{
		// starting position of an array
		int left=0;   
		int right=arr.length-1; 
		
		// ending position of an array
		
		while(right>=left)
		{
		//find the mid position for dividing an array into to parts
			
		int mid=left+(right-left)/2;
		
		// check if target is present at mid or not 
		if (arr[mid]==target)
		{
		return mid;
		}
		if(arr[mid]<target) 
		{
		//if the target is greater than the mid of an array than ignore left part of an array
			
		left=mid+1;
		
		// return binarysearch(arr,mid+1,right,target)
		}
		else 
		{
		//if the target is smaller than the mid of an array than ignore right part of an array
			
		right=mid-1;
		
		// return binarysearch(arr,left,mid-1,target)
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
		
		
	    int result=binarysearch(arr,target);
	   
	    //output the result
	    if(result>-1)
	    {
	    System.out.println("Element found at index::"+result);
	    }
	   else
	   {
		System.out.println("Element  not found at any index of array ::");
	  }
    }
}
//----------------------------------------------------------

/*How many element want to store:: 7
enter element one by one::
1
2
3
4
5
6
7
enter target element want to search from array::3
Element found at index::2
-----------------------------------------------------------
Disadvantage::binary search algorithm is work when element is already in the sorted order 
it fail if element is unsorted form
-------------------------------------------
How many element want to store:: 9
enter element one by one::
1
9
3
7
8
5
2
4
6
enter target element want to search from array::5
Element  not found at any index of array ::

*/
