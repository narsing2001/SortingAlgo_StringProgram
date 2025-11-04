package J12;
import java.util.Scanner;

public class mergingarray {

	public static void main(String[] args) 
	{
		
		    Scanner sc = new Scanner(System.in);
	        
	        // Input for the first array
	        System.out.println("Enter the size of the first array.");
	        int m = sc.nextInt();
	        int[] arr1 = new int[m];
	        
	        System.out.println("Enter the elements of the first array:");
	        for (int i = 0; i < m; i++) 
	        {
	            arr1[i] = sc.nextInt();
	        }

	        System.out.println("-----------------------------------------------------------------------------------------------------");
	        // Input for the second array
	        System.out.println("Enter the size of the second array.");
	        int n = sc.nextInt();
	        int[] arr2 = new int[n];

	        System.out.println("Enter the elements of the second array:");
	        for (int i = 0; i < n; i++) {
	            arr2[i] = sc.nextInt();
	        }

	        System.out.println("-----------------------------------------------------------------------------------------------------");
	        // Print both arrays
	        System.out.println("First array elements:");
	        for (int i = 0; i < m; i++) {
	            System.out.print(arr1[i] + " ");
	        }
	        System.out.println();
	        
	        System.out.println("Second array elements:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr2[i] + " ");
	        }
	        System.out.println();
	        System.out.println("-----------------------------------------------------------------------------------------------------");
	        int merge[]=new int[arr1.length+arr2.length];
	        int index=0;
	        for(int i=0;i<arr1.length;i++)
	        {
	        	merge[index++]=arr1[i];
	        	
	        }
	        
	        for(int i=0;i<arr2.length;i++)
	        {
	        	merge[index++]=arr2[i];
	        	
	        }
	        
	        // Print the merged array
	        System.out.print("Merged array: ");
	        for (int num : merge) {
	            System.out.print(num + " ");
	        }
	}
}
/*---------------------------------------------------------------------------------------------------------
Enter the size of the first array.
5
Enter the elements of the first array:
1
2
3
4
5
-----------------------------------------------------------------------------------------------------
Enter the size of the second array.
5
Enter the elements of the second array:
6
7
8
9
10
-----------------------------------------------------------------------------------------------------
First array elements:
1 2 3 4 5 
Second array elements:
6 7 8 9 10 
-----------------------------------------------------------------------------------------------------
Merged array: 1 2 3 4 5 6 7 8 9 10 
*/
