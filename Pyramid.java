package J12;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter row::");
		int row=sc.nextInt();
		System.out.println("------------------------------------");
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i;j++) 
				{
					System.out.print(" ");
				}
			// print row no ,row no times
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
				
			}
			System.out.println();
		}
		}
	}


/*enter row::
5
------------------------------------
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
*/

