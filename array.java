package J12;

import java.util.Scanner;

public class array 
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value for a: ");
        int a = sc.nextInt();
        System.out.println("value of a = " + a);
        
        int[] arr = {10, 20, 30, 40, 50, 60};
        System.out.println("Access element using index no arr[4]:");
        System.out.println(arr[4]);
        
        System.out.println("Access element using for loop:");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        
        System.out.println("Access element using for-each loop:");
        for(int i : arr) {
            System.out.println(i+" ");
        }
        
        int[] arr1 = new int[5];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;
        
        System.out.println("Array arr1:");
        for(int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]+" ");
        }
        
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println("Array using for model:");
        for(int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]+" ");
        }
        System.out.println("Array using for-each model:");
        for(String s : cars) {
            System.out.println(s+" ");
        }

        System.out.println("Accessing 2D array element:");
        int arr2[][] = { {2, 7, 9}, {3, 6, 1}, {7, 4, 2} };
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        
        //sc.close(); // Close scanner to avoid resource leak
    }
}

/*-----------------------------------------------------------------------------------------------------
Enter an integer value for a: 40
value of a = 40
Access element using index no arr[4]:
50
Access element using for loop:
10 
20 
30 
40 
50 
60 
Access element using for-each loop:
10 
20 
30 
40 
50 
60 
Array arr1:
10 
20 
30 
40 
50 
Array using for model:
Volvo 
BMW 
Ford 
Mazda 
Array using for-each model:
Volvo 
BMW 
Ford 
Mazda 
Accessing 2D array element:
2 7 9 
3 6 1 
7 4 2 
----------------------------------------------------------------------------------------------------------------
*/
