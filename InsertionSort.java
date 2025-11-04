package J12;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println(" How Many element want insertion sort::\t");
		int n=sc.nextInt();
		int arr[]= new int [n];
		System.out.println("Enter integer="+ n);
		System.out.println("array element want to sort using insertion sorting::\t");
		for(int k=0;k<n;k++)
		{
		  arr[k]=sc.nextInt();
		}
		Insertionsortalgo(arr);

	}
	public static void Insertionsortalgo(int arr[]) {
		for(int i=1;i<arr.length;i++)
		{
		int temp=arr[i];
	int preIndex=i-1;
			
		while(preIndex >=0 && temp > arr[ preIndex])
		{
		arr[i]=arr[i-1];
		preIndex--;
		}
			arr[i+1]=temp;
			
		}
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+" ");
		}
	}
}
