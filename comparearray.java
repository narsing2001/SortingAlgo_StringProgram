package J12;
import java.util.Scanner;
// write a java programme to print similar element in the array,store similar element in the third array and print to the console

public class comparearray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input for the first array
        System.out.println("Enter the size of the first array.");
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input for the second array
        System.out.println("Enter the size of the second array.");
        int n = sc.nextInt();
        int[] arr2 = new int[n];

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

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

        // Temp array to hold matches
        int[] arr3 = new int[Math.min(m, n)]; 
        
        int index = 0;
        
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++) 
            {
            	 // Find matching elements between the two arrays
                if (arr1[i] == arr2[j]) 
                {
                    arr3[index] = arr1[i];
                    index++;
                    break; 
                    
         // Move to the next element of arr1 once a match is found
                }
            }
        }

        // Create the final result array with the correct size
        int[] result = new int[index];
        
        //System.arraycopy(arr3, 0, result, 0, 3);
        //The result array will be filled with the first 3 elements of arr3, starting from index 0 in both arrays
        
        System.arraycopy(arr3, 0, result, 0, index);

        // Print the result array
        System.out.print("Matching elements: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
