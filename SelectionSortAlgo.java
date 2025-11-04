package J12;
import java.util.Scanner;
public class SelectionSortAlgo {
public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println(" How Many element want to sort Using bubble::\t");
		int n=sc.nextInt();
		int arr[]= new int [n];
		System.out.println("Enter integer="+n);
		System.out.println("array element want to sort using Bubble sorting::\t");
		for(int k=0;k<n;k++)
		{
		  arr[k]=sc.nextInt();
		}
		selectionsort(arr);
        }
public static void selectionsort(int arr[]) {
// consider i th element as maxIndex and compare j th index with  i with condition if(arr[j]>arr[maxIndex]) for asending order
		for(int i=0; i<arr.length;i++) 
		{
			int maxIndex=i;
		for(int j=i; j<arr.length;j++) 
		{
// selection sorted element in Descending order
	          if(arr[maxIndex]>arr[j] || arr[maxIndex]==arr[j])
	     {
	        	  maxIndex=j;
		 }
		  }
//logic for now swap the numbers one by one 
		int temp=arr[i];
		arr[i]=arr[maxIndex];
		arr[maxIndex]=temp;
		   }
		System.out.println("array element after Bubble sorting::");
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]+" ");
		}
	   }
	 }
	
	


