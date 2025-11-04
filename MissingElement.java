package J12;
//java programme to print missing element upto largest element in an array using Hashset
import java.util.HashSet;
import java.util.Scanner;

public class MissingElement 
{
//method to find maximum element in the the array
		public static int findMax(int arr[]) 
		{
			int large=arr[0];
			for(int i=1;i<arr.length;i++) 
			{
				if(arr[i]>large) 
				{
					large=arr[i];
				}	
			}
			return large;
		}
//method to print missing element from 1 to large
	public static void	printMissing(int arr[],int large)
	{
	HashSet<Integer> set=new HashSet<>();
	
//add all the element of the array to the set
	for(int num:arr)
	{
	set.add(num);	
	}
	System.out.println("missing element are:");

//loop from 1 to the largest element 
	for(int i=1;i<=large;i++)
	{
//if the element is not in the set than it is missing
		if(!set.contains(i))
		{
			System.out.print(i+" ");
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
				
	//find the largest element in the array
				int large=findMax(arr);
				
	// print missing elements
				printMissing(arr,large);
	}}

/*-----------------------------------------------------------------------------------------------------------------------------------
 Enter the size of the array:9
Enter the element of the array:1 9 3 90 100 120
88 37 16
missing element are:
2 4 5 6 7 8 10 11 12 13 14 15 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 
57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 89 91 92 93 94 95 96 97 98 99 101 102 103 104 105 106 
107 108 109 110 111 112 113 114 115 116 117 118 119 
*/
	

