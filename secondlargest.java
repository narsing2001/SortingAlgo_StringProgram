package J12;
import java.util.Scanner;
public class secondlargest {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        // Taking input for array size
	        System.out.print("Enter the size of the array: ");
	        int n = sc.nextInt();
	        
	        // Create the array
	        int[] arr = new int[n];
	        
	        // Taking input for array elements
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) 
	        {
	            arr[i] = sc.nextInt();
	        }

	        // Method to find the second largest element
	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;
	        
            System.out.println("array element using for each loop.");
	        for (int num : arr)
	        {
	            if (num > largest) 
	            {
	                secondLargest = largest;
	                largest = num;
	            } 
	            else if (num > secondLargest && num != largest) 
	            {
	                secondLargest = num;
	            }
	        }

	        // Print the second largest element
	        System.out.println("Second largest element: " + secondLargest);
	        System.out.println("largest element: " + largest);
	        
	        
	        
           System.out.println("using for loop---------------------------------------------------------------------------------------");
	        for (int i = 0; i < n; i++) {
	            if (arr[i] > largest) {
	                secondLargest = largest;  // Update second largest before updating largest
	                largest = arr[i];
	            } else if (arr[i] > secondLargest && arr[i] != largest) {
	                secondLargest = arr[i];
	            }
	        }
	        
	        // Display the result
	        if (secondLargest == Integer.MIN_VALUE) {
	            System.out.println("No second largest element found.");
	        } else {
	            System.out.println("The second largest element is: " + secondLargest);
	            System.out.println("largest element: " + largest);
	        }
	              
	}
}

/*-----------------------------------------------------------------------------------------------------
Enter the size of the array: 5
Enter the elements of the array:
1
2
3
4
5
array element using for each loop.
Second largest element: 4
largest element: 5
using for loop--------------------------------------------------------------------------
The second largest element is: 4
largest element: 5
============================================================================================
code explanation:

Let’s walk through the loop with the array {1, 2, 3, 4, 5}:

Initial values: largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE
First element (num = 1):

1 > Integer.MIN_VALUE, so:
secondLargest = Integer.MIN_VALUE
largest = 1
Second element (num = 2):

2 > 1, so:
secondLargest = 1 (previous largest)
largest = 2
Third element (num = 3):

3 > 2, so:
secondLargest = 2 (previous largest)
largest = 3
Fourth element (num = 4):

4 > 3, so:
secondLargest = 3 (previous largest)
largest = 4
Fifth element (num = 5):

5 > 4, so:
secondLargest = 4 (previous largest)
largest = 5
Final Result:
largest = 5
secondLargest = 4


*/
