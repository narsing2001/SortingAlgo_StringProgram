package J12;
//work well for input value range from 0 to 1
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class BucketSort {
	int m;
	static void bucketSort(float []arr) 
	{
		int m=arr.length;
	if(arr.length<0) 
	{
		return;
	}
		
	// create n empty buckets using ArrayList
	
	ArrayList<Float>[] buckets=new ArrayList[m];
	for(int i=0;i<m;i++) 
	{
		buckets[i]=new ArrayList<Float>();	
	}
	
	// put array element in different bucket
	for(int i=0;i<m;i++) {
		int Bucketindex=(int)(m*arr[i]);// index in bucket
		buckets[Bucketindex].add(arr[i]);
	}
	//sort individual buckets
	for(int i=0;i<m;i++)
	{
		Collections.sort(buckets[i]);
	}
	// concatenate all buckets into arr[]
	int index=0;
	for(int i=0;i<m;i++) {
		for(int j=0;j<buckets[i].size();j++)
		{
			arr[index]=buckets[i].get(j);
			index++;
		}
	}
} 
	public static void main(String[] args) 
	{
		 Scanner sc =new Scanner(System.in);
		BucketSort bc=new BucketSort();
		System.out.print("Enter How many element want to enter in the Bucket of Array::");
	
		int n=sc.nextInt();
		float []arr=new float[n];
		System.out.println("enter element one by one::");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextFloat();	
		}
		System.out.println("element In the  bucket  before sorting are:: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");	
		}
		System.out.println();
		
		bucketSort(arr);
		
		System.out.println("element In the  bucket  After sorting are:: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");	
		}	
		System.out.println();
	}
}

/*extra space required
 * best only when data is uniformly distributed over a range
 * extra space required for bucket
 * difficulty in choosing bucket size
 * not suitable for all data type i.e easily work well when number is easily map to rangei.e 0 to 1
 * not well range of data is unknown or very large
 * overhead with sorting of an buckets 
-------------------------------------------------------------------*/

/*
 Enter How many element want to enter in the Bucket of Array::5
enter element one by one::
0.56
0.56
0.57
0.54
0.56
element In the  bucket  before sorting are:: 
0.56 0.56 0.57 0.54 0.56 
element In the  bucket  After sorting are:: 
0.54 0.56 0.56 0.56 0.57 
*/
