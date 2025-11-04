package J12;
import java.util.Scanner;
import java.util.HashSet;

public class SumOfUnique {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input the size of an array
		System.out.print("Enter the size of an array::");
		int n=sc.nextInt();
		int[]arr=new int[n];
	//	input the element in an array
		System.out.println("Enter the element of an array::");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();	
		}
   //use the hashset to find the unique element it only store unique element if an element is already in the set it wint be added again
		HashSet<Integer> H1=new HashSet<>();
		int sum=0;
		for(int num:arr) {
			//if element is not already in the set ,add it in to the sum
			if(!H1.contains(num)) {
				sum+=num;
				H1.add(num);	
			}
		}
		//output the sum of the unique element 
		
		System.out.println("Sum of the unique element is:"+sum);
		sc.close();

	}

}
//---------------------------------------------------------------------------------------------------------
/*
C:\Users\Narsing Patil\OneDrive\Desktop>java SumOfUnique

Enter the size of an array::7
Enter the element of an array::
2  3 7 4 6 3 4
Sum of the unique element is:22

C:\Users\Narsing Patil\OneDrive\Desktop>java SumOfUnique
Enter the size of an array::5
Enter the element of an array::
3
4
5
6
5
Sum of the unique element is:18
*/