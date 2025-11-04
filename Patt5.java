package J12;

import java.util.Scanner;

public class Patt5 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("enter row::");
		int row=sc.nextInt();
		System.out.println("------------------------------------");
		for(int i=1;i<=row;i++) {
		
		for(int j=1;j<=row-i+1;j++) {
				
				System.out.print(j+" ");
			}
				System.out.println();
		}
      }
}

//----------------------------------------------
/* enter row::
7
------------------------------------
1 2 3 4 5 6 7 
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
*/
