package J12;
import java.util.*;

public class CountingSort {
	public static void countsort(int array[],int size) 
	{
		// initialize an array of size+1 so that to store the output element
	    int max=findMax(array,size);
		int min=findMin(array, size);
		//find the maximum element of the array 

		int range=max-min+1;
		
		int[]count=new int[range];
		int[]output=new int[size];
		//initialize count array with all zeros
		for(int i=0;i<range;i++) 
		{
			count[i]=0;
		}
		//store the count of each element
		for(int i=0;i<size;i++) 
		{
			count[array[i]-min]++;
		}
		//store the cumulative count
		for(int i=1;i<range;i++) 
		{
			count[i]+=count[i-1];
		}
		//place the element in sorted order
		for(int i=size-1;i>=0;i--) 
		{
			output[count[array[i]-min]-1]=array[i];
			count[array[i]-min]--;
		}
		//copy the sorted element into original array
		for(int i=0;i<size;i++) {
			array[i]=output[i];
		}
		}
	    // find  maximum element from an array
		public static int findMax(int array[],int size) {
		int max=array[0];
		for(int i=1;i<size;i++) {
		if(array[i]>max) {
		max=array[i];
		}
		}
		return max;
	    }
	    //finding minimum element from an array
	    public static int findMin(int array[],int size) {
	   int min=array[0];
	    for(int i=1;i<size;i++) {
	    if(array[i]<min) {
	    min=array[i];
	    }
	   }
	   return min;	
	  }

	   public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// take the  no of element from user
		System.out.print("Enter the no of element::");
        int size=sc.nextInt(); 
	    int array[]=new int[size];
		System.out.print("Enter"+" "+size+" "+"element one by one:");
		for(int i=0;i<size;i++) 
		{
		array[i]=sc.nextInt();
		}
		//Display element before sorting
		System.out.println("Element before sorting::");
		for(int i=0;i<size;i++) 
		{
		System.out.print(array[i]+" ");	
		}
		System.out.println();
		//perform counting sort
		countsort(array,size);
		//display element after sorting
		System.out.println("Element after sorting::");
		for(int i=0;i<size;i++) 
		{
		System.out.print(array[i]+" ");
		}
		System.out.println();
		sc.close();	
		}
     }
