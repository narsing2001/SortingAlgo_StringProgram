package J12;
import java.util.Arrays;
import java.util.*;

public class Countingsort1 {
	
	public static void countsort(int arr[],int size) {
		// initialize an array of size+1 so that to store the output element
		int[]output=new int[size+1];
		//find the largest element of the array 
		int max=arr[0];
		for(int i=1;i<size;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		int[]count=new int[max+1];
		                            //initialize count arrays as zero initially
		for(int i=0;i<max;i++) {
			count[i]=0;
		}
	                            	//store the count of each element
		for(int i=0;i<size;i++) {
			count[arr[i]]++;
		}
	                               //store the cummulative count of each array
		for(int i=1;i<=max;i++) {
			count[i]+=count[i-1];
		}
		                            //find the index of each element of the original array in count array
	                                // and place the array in the output array
		
		for(int i=size-1;i>=0;i--) {
			output[count[arr[i]]-1]=arr[i];
			count[arr[i]]--;
		}
		                           // copy the sorted element into original array
		for(int i=0;i<size;i++) {
			arr[i]=output[i];
		}
		
	}

	public static void main(String[] args) {
	    int i;
		Scanner sc =new Scanner(System.in);
		System.out.print("How many element want to Enter::");
		int n=sc.nextInt();
		int array[]=new int[n];
		// take element from user
		System.out.print("Enter one by one:");
		for(i=0;i<=n;i++) 
		{
			array[i]=sc.nextInt();
		}
		System.out.print("Element Before sorting:");
		for(i=0;i<=n;i++) 
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		
		countsort(array,n);
		// Display element after sorting 
		System.out.print("Element After sorting:");
		for( i=0;i<n;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		sc.close();
		
	}
	

}
