package J12;

import java.util.Scanner;
import java.util.Arrays;

public class remove_dublicate_element {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array element...");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arrys element at index:" + " " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("display the array element:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Sort the array
        Arrays.sort(arr);

        // Remove duplicates
        int[] tempArray = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                tempArray[j++] = arr[i];
            }
        }
        tempArray[j++] = arr[arr.length - 1];
        // direct printing of the temparray initialize array with default zero value
        // with output:Array without duplicates: 1 2 3 4 5 0 0

        // Create an array with the new length
        int[] uniqueNumbers = Arrays.copyOf(tempArray, j);

        System.out.println();
        // Print the array without duplicates
        // indirect printing of the temparray initialize array to another array using
        // array or other method gives
        // value with output:Array without duplicates: 1 2 3 4 5
        System.out.print("Array without duplicates: ");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }
    }
}
/*
 * -----------------------------------------------------------------------------
 * ------
 * Enter the array Size:
 * 10
 * Enter the array element...
 * arrys element at index: 0
 * 10
 * arrys element at index: 1
 * 20
 * arrys element at index: 2
 * 30
 * arrys element at index: 3
 * 40
 * arrys element at index: 4
 * 50
 * arrys element at index: 5
 * 60
 * arrys element at index: 6
 * 20
 * arrys element at index: 7
 * 30
 * arrys element at index: 8
 * 90
 * arrys element at index: 9
 * 100
 * display the array element:
 * 10 20 30 40 50 60 20 30 90 100
 * Array without duplicates: 10 20 30 40 50 60 90 100
 * -----------------------------------------------------------------------------
 * -------------------------------------------------------------------------
 * 🔹 Step 1: Sort the array
 * Arrays.sort(arr);
 * 
 * After sorting: arr = [1, 2, 2, 3, 3, 4, 5, 5]
 * 
 * Sorting helps because duplicates now sit next to each other — that makes it
 * easy to spot and remove them.
 * 
 * 🔹 Step 2: Remove duplicates manually
 * 
 * We create a temporary array: int[] tempArray = new int[arr.length];
 * 
 * int j = 0;
 * We loop through the sorted array:
 * 
 * for (int i = 0; i < arr.length - 1; i++) {
 * if (arr[i] != arr[i + 1]) {
 * tempArray[j++] = arr[i];
 * }
 * }
 * -----------------------------------------------------------------------------
 * -
 * | i | arr[i] | arr[i+1] | Condition (`!=`) | Action | tempArray | j |
 * | - | ------ | -------- | ---------------- | ---------------- |
 * ------------------------ | - |
 * | 0 | 1 | 2 | true | tempArray[0] = 1 | [1, 0, 0, 0, 0, 0, 0, 0] | 1 |
 * | 1 | 2 | 2 | false | skip | same | 1 |
 * | 2 | 2 | 3 | true | tempArray[1] = 2 | [1, 2, 0, 0, 0, 0, 0, 0] | 2 |
 * | 3 | 3 | 3 | false | skip | same | 2 |
 * | 4 | 3 | 4 | true | tempArray[2] = 3 | [1, 2, 3, 0, 0, 0, 0, 0] | 3 |
 * | 5 | 4 | 5 | true | tempArray[3] = 4 | [1, 2, 3, 4, 0, 0, 0, 0] | 4 |
 * | 6 | 5 | 5 | false | skip | same | 4 |
 * -----------------------------------------------------------------------------
 * ----------------|
 * 
 * After loop ends, we still need to store the last element (since it has no
 * next element to compare with):
 * 
 * tempArray[j++] = arr[arr.length - 1];
 * 
 * 
 * Now:
 * tempArray = [1, 2, 3, 4, 5, 0, 0, 0]
 * j = 5
 * 
 * Step 3: Copy only unique part
 * 
 * We only want the first j elements (unique ones):
 * 
 * int[] uniqueNumbers = Arrays.copyOf(tempArray, j);
 * 
 * 
 * uniqueNumbers = [1, 2, 3, 4, 5]
 * 
 * Step 4: Print the result
 * System.out.print("Array without duplicates: ");
 * for (int num : uniqueNumbers) {
 * System.out.print(num + " ");
 * }
 * 
 * 
 * Output: Array without duplicates: 1 2 3 4 5
 */
