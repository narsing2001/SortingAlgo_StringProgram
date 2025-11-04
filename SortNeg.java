package J12;
// java programme to separate all positive and negative element one side
import java.util.Scanner;

public class SortNeg {

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
		System.out.println("Element before to move all negative number to beginning and positive to end::");
		for(int i=0;i<arr.length;i++) 
		{
		System.out.print(arr[i]+" ");	
		}
		System.out.println();
		int j=0,temp;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0 ) {
				if(i!=j) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
		}
		//iterate element one by one 
		System.out.println("array Element,after moving all negative number to beginning and positive to end::");
		for(int i=0;i<arr.length;i++) 
		{
		System.out.print(arr[i]+" ");	
		}
		System.out.println();	
		}
	}
//-----------------------------------------------------------------------------
/*How many element want to sort:: 6
enter element one by one::
-1
8
-5
9
-2
8
Element before to move all negative number to beginning and positive to end::
-1 8 -5 9 -2 8
array Element,after moving all negative number to beginning and positive to end::
-1 -5 -2 9 8 8*/

