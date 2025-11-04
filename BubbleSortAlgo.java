package J12;
import java.util.Scanner;
public class BubbleSortAlgo {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
//	int arr[] = {2,4,3,5,6,8,7};
	System.out.println(" How Many element want to sort::\t");
	int n=sc.nextInt();
	int arr[]= new int [n];
	System.out.println("Enter integer="+n);
	System.out.println("array element want to sort using Bubble sorting::\t");
	for(int k=0;k<n;k++)
	{
	  arr[k]=sc.nextInt();
	}
	bubblesort(arr);	
    }
public static void bubblesort(int arr[]) {

	for(int i=0; i<arr.length;i++)
	{
	for(int j=0; j<arr.length-1;j++) 
	{
    if(arr[j]>arr[j+1] || arr[j]==arr[j+1]) {
	int temp=arr[j+1];
	arr[j+1]=arr[j];
    arr[j]=temp;
	}
	  }
	   }
	System.out.println("array element after Bubble sorting::");
	for(int i=0;i<arr.length;i++) 
	{
		System.out.println(arr[i]+" ");
	}
   }
  }
