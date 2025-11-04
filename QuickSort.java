package J12;
import java.util.*;
class Partation
{
//method to define partition position
        static int partition(int array[],int low,int high){
//choose the rightmost element as pivot
        int pivot=array[high];
//pointer to greater element
        int i=(low-1);
//traverse through all element
//compare each element with pivot
       for(int j=low;j<high;j++) 
        {
         if(array[j]<=pivot) 
           {
//if element smaller than pivot is found
//swap it with greater element pointed  by  i that is  int i=(low-1);
            i++;
//swapping element of i with element of j
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			}
		}
		
//swap the pivot  element with the greater element specified by i that is   int i=(low-1);
       //i.e the swap the element greater than pivot specified by int i=(low-1);
        
    	   
		   int temp=array[i+1];
		   array[i+1]=array[high];
		   array[high]=temp;
    	   
       
//return the position where the partition is done
		   return (i+1);		
	}
	
static void quicksort(int array[],int low,int high)
{
	if(low<high)	
	   {
// find pivot element such that 
//element smaller than pivot are place on the left
//element greater than the pivot are place on the right
		
		int pi=partition(array,low,high);
		
//recursive call on left of the pivot 
		
		quicksort(array,low,pi-1);
		
//recursive call on right of the pivot 
		
		quicksort(array,pi+1,high);
	 }
    }
}
// main class
public class QuickSort {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.print("How many element want to sort:: ");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("enter element onr by one::");
	for(int i=0;i<arr.length;i++) 
	{
	arr[i]=sc.nextInt();	
	}
	System.out.println("Element before Quick sorting::");
	for(int i=0;i<arr.length;i++) 
	{
	System.out.print(arr[i]+" ");	
	}
	System.out.println();
	
//Partation is class name and quicksort instance memebr of Partation class 
//partition and quicksort is  static member of class Partation
// to call static to static member use Classname.instance member to call
	
//call quicksort() on array name i.e.arr
//n=arr.length
	
	Partation.quicksort(arr,0,arr.length-1);
	
	System.out.println("Element after Quick sorting::");
	for(int i=0;i<arr.length;i++) 
	{
	System.out.print(arr[i]+" ");
	}
	System.out.println();
	sc.close();	

	}
}

//output::--------------------------------------------------------------------------------
/*How many element want to sort:: 8
enter element onr by one::
1 6 4 4 2 6 8 8 
Element before Quick sorting::
1 6 4 4 2 6 8 8 
Element after Quick sorting::
1 2 4 4 6 6 8 8 
-------------------------------
Disadvantage::Unstable: 1} Does not preserve the relative order of equal element and sensative to pivot choices
2)Split point cannot be in the middle and can be vary skew to left or right leave a uneven decision
3) cannot be guarrante to preserve the order of element as Re-order.          
==========================================================
How many element want to sort:: 9
enter element onr by one::
1
7
4
6
4
3
3
9
9
Element before Quick sorting::
1 7 4 6 4 3 3 9 9
Element after Quick sorting::
1 3 3 4 4 6 7 9 9

*/
