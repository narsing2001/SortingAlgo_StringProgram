package J12;

import java.util.Scanner;

public class MergeSort2 
{
	// a conquer method subsequently call recursion method to sort left halves and right halves
	public static void conquer(int arr[],int start,int mid,int end)
	{
// initialize merged array to combine two or more sorted array in a single array which is same size as original array
		int merged[]=new int [end-start+1];
		
// one pointer variable i.e idx1 can hold the starting position,mid is already assign and calculated ,second variable i.e idx2 can hold the 
// mid+1 position and end position with arr.length-1 is already assign
		
		int idx1=start;
		int idx2=mid+1;
		int x=0;
		while(idx1<=mid && idx2<=end) 
		{
			if(arr[idx1]<arr[idx2]) 
			{
				merged[x]=arr[idx1];
				x++;
				idx1++;
			}else {
				merged[x]=arr[idx2];
				x++;
				idx2++;
			}
			
		}
		while(idx1<=mid)
		{
		merged[x]=arr[idx1];
		x++;
		idx1++;
		}
		while(idx2<=end)
		{
		merged[x]=arr[idx2];
		x++;
		idx2++;
		}
		for(int i=0,j=start;i<merged.length;i++,j++)
		{
			arr[j]=merged[i];
		}
		
		
		
	}
	public static void divide(int arr[],int start,int end)
	{
		// divide method split original array into two halves
		// after call to combine .e conquer method.
		if(start>=end) {
			return;
		}
		else {
		int mid=start+(end-start)/2;
		divide(arr,start,mid);
		divide(arr,mid+1,end);
		conquer(arr,start,mid,end);
		}
	}
		

	public static void main(String[] args) {
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
		

	    divide(arr,0,arr.length-1);
		

		System.out.println("Element after Merge sorting::");
	
			
		for(int i=0;i<arr.length;i++) 
		{
		System.out.print(arr[i]+" ");
		
        }
		System.out.println();
		}

	}


