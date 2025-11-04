package J12;
import java.util.Scanner;
public class SearchElement 
{
public static void main(String[] args) 
{
Scanner sc =new Scanner(System.in);
System.out.println(" How Many element want to add in array::\t");
int n=sc.nextInt();
int arr[]= new int [n];
System.out.println("Enter no of element ="+ n+" only ");
System.out.println("element adding in an array is Processing::\t");
for(int k=0;k<n;k++)
{
arr[k]=sc.nextInt();
}
System.out.println("Enter element want to search");
var Target =sc.nextInt();
int index= linearSearch(arr,Target);
if(index!=-1)
{
System.out.println("Element="+Target+" Found at Position="+index);
}
else
{
System.out.println("Element="+ Target +"Not Found at Position="+index);
}
}
private static int linearSearch(int [] arr, int Target) {
for(int i=0;i<arr.length;i++)
{
if(arr[i] == Target) 
{
return i;
} 
}
return -1;
}
}


