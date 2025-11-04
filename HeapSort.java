package J12;
// minimum Heap Sort algorithm
import java.util.Scanner;

public class HeapSort 
{
	public static void sort(int arr[])
	{
		int n=arr.length;
// build heap(rearrange array)
		
		for(int i=n/2-1;i>=0;i--) 
			minheapify(arr,n,i);
//one by one extract element from heap
		for(int i=n-1;i>=0;i--)
		{
//move from root to end
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
// call max heapify
			minheapify(arr,i,0);
		}
	}
	
//to heapify a subtree rooted with i which is index in arr[]
  static void minheapify(int arr[],int n,int i) 
 {
// initialize largest as root
	 int  largest=i;
//left branch node
	 int left=2*i+1;
//right branch node
	 int right=2*i+2;
// if left child is larger than root
	 if(left<n && arr[left]>arr[largest])
	 {
		 largest=left;
	 }
// if right child is larger than the largest
	 if(right<n && arr[right]>arr[largest])
	 {
		 largest=right;
	 }
//if largest is not root
	 if(largest!=i) 
	 {
		 int swap=arr[i];
		 arr[i]=arr[largest];
		 arr[largest]=swap;
		 
//recursively heapify the affected subtree
		 minheapify(arr,n,largest);
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
		sort(arr);
		

		System.out.println("Element after Merge sorting::");
	
			
		for(int i=0;i<arr.length;i++) 
		{
		System.out.print(arr[i]+" ");
		
        }
		System.out.println();
		}
	}

//----------------------------------------------------
/*How many element want to sort:: 6
enter element one by one::
1
8
3
5
7
4
Element before Merge sorting::
1 8 3 5 7 4 
Element after Merge sorting::
1 3 4 5 7 8 
*/

