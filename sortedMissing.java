package J12;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//java programme to print missing element in an present input array and combine missing and present element in sorted form

public class sortedMissing 
{
	//method to find the maximum element element in the array
	private static int findMax(int arr[]) 
	{
		int large=arr[0];
		for(int num:arr)
		{
			if(num>large)
			{
				large=num;
			}
		}
          return large;
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
			
			//find the largest element in the array
			int large=findMax(arr);
			
			//create a set for the element in the array 
			Set<Integer> s=new HashSet<>();
			for(int num:arr) 
			{
				s.add(num);
			}
//find missing element and add them  to the new array
//initialize array of size=large element in the array so combine array store element from 1 to large element in sequence order
			int[]combinedArray=new int[large];
			int index=0;
			
//add both present and missing element in the sorted order
			for(int i=1; i<=large;i++) 
			{
				combinedArray[index++]=i;
				if(!s.contains(i))
				{
// print missing element	
				System.out.println("Missing element:"+i);
				}
			}
//sort the combine array(through it's already sorted by design)
			Arrays.sort(combinedArray);
//print the combine sorted array
			System.out.println("combined array with missing and present element:"+Arrays.toString(combinedArray));
	}
}
/*---------------------------------------------------------------------------------------------------------------------------------------------
Enter the size of the array:8
Enter the element of the array:1 4 8 10 14 15 18 20
Missing element:2
Missing element:3
Missing element:5
Missing element:6
Missing element:7
Missing element:9
Missing element:11
Missing element:12
Missing element:13
Missing element:16
Missing element:17
Missing element:19
combined array with missing and present element:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
---------------------------------------------------------------------------------------------------------------------------------------------------
C:\Users\Narsing Patil\OneDrive\Desktop>java sortedMissing
Enter the size of the array:6
Enter the element of the array:1 7 3 9 25 30
Missing element:2
Missing element:4
Missing element:5
Missing element:6
Missing element:8
Missing element:10
Missing element:11
Missing element:12
Missing element:13
Missing element:14
Missing element:15
Missing element:16
Missing element:17
Missing element:18
Missing element:19
Missing element:20
Missing element:21
Missing element:22
Missing element:23
Missing element:24
Missing element:26
Missing element:27
Missing element:28
Missing element:29
combined array with missing and present element:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]
*/
