package J12;

import java.util.Scanner;

public class MergeSort 
{
	public static void merge(int arr[],int left,int mid,int right)	
// merge method will combine the left and right halves into single arr[k]
{
	// size of the two subarray to be merged 
	int n1=mid-left+1;
	int n2=right-mid;
	
	// temporary arrays which is use to store the merged array
	int leftarr[]=new int[n1];
	int rightarr[]=new int[n2];
	
	// copy data to temporary arrays
	for(int i=0;i<n1;i++) 
	{
	leftarr[i]=arr[left+i];
    }
	for(int j=0;j<n2;j++)
	{
	  rightarr[j]=arr[mid+1+j];
	}
	// initial index of subarray
	int i=0,j=0;
	// initial index of merged subarray
	int k=left;
	while(i<n1 && j<n2)
	{
	if(leftarr[i] <=rightarr[j]) {
	arr[k]=leftarr[i];
	i++;
	k++;
	}
	else 
	{
	arr[k]=rightarr[j];
	j++;
	k++;
	}
	
}
	while(i<n1)
	{
	arr[k]=leftarr[i];
	i++;
	k++;
	}
		// copy remaining element of rightarr[] if any
	while(j<n2)
	{
	arr[k]=rightarr[j];
	j++;
	k++;
	}
}
// function to implement merge sort
	public static void dividesort(int arr[],int left,int right)
	{
		//Dividesort method divide the array into two halves of original array and call to merge method
		if (left<right)
		{
		   // find the middle element
		int mid=left+(right-left)/2;
		
		// sort function recursively divides first and second halves
		dividesort(arr,left,mid);
		
		dividesort(arr,mid+1,right);
		
		//merge the sorted halves
	     merge(arr,left,mid,right);
	}
		
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("How many element want to sort:: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter element one by one::");
		for(int i=0;i<arr.length;i++) 
		{
		arr[i]=sc.nextInt();	
		}
		System.out.println("Element before Merge sorting::");
		for(int i=0;i<arr.length;i++) 
		{
		System.out.print(arr[i]+" ");	
		}
		System.out.println();
		// call sort function
		

	    dividesort(arr,0,arr.length-1);
		

		System.out.println("Element after Merge sorting::");
	
			
		for(int i=0;i<arr.length;i++) 
		{
		System.out.print(arr[i]+" ");
		
        }
		System.out.println();
		}
}


//0utput-------------------------------------------------------------------------------
/*How many element want to sort:: 9
enter element one by one::
14
25
37
56
98
15
27
69
10
Element before Merge sorting::
14 25 37 56 98 15 27 69 10
Element after Merge sorting::
10 14 15 25 27 37 56 69 98
*/
