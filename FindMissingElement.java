package J12;
//write a java programme to print only missing element in the given array.
import java.util.Arrays;
import java.util.Scanner;
public class FindMissingElement 
{
	//method to find and print the missing element
	public static void printMissingElement(int arr[]) 
	{
		//sort the array first
		Arrays.sort(arr);
		System.out.println("missing element are:");
		
		//loop through the array and check the missing element
		for(int i=0;i<arr.length-1;i++)
		{
			int current=arr[i];
			int next=arr[i+1];
			
		// if there's gap print the missing number
			if(next-current>1) 
			for(int j=current+1;j<next;j++)
			{
				System.out.print(j+" ");
			}
		}
		
	}
public static void main(String[] args) 
{
	//take input from user
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter the size of the array:");
	int size=sc.nextInt();
	
	int[]arr=new int[size];
	System.out.print("Enter the element of the array:");
	
	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	//call the method to print the missing element
	printMissingElement(arr);
}
}
/*====================================================================================================
Enter the size of the array:8
Enter the element of the array:1 9 3 6 5 10 18 16
missing element are:
2 4 7 8 11 12 13 14 15 17 
*/
