package J12;

import java.util.Scanner;

public class Patt3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter row::");
		int row=sc.nextInt();
		System.out.println("------------------------------------");
		//System.out.println("enter column:: ");
		//int col=sc.nextInt();
		for(int i=1;i<=row;i++) {
			//inner loop space print
			for(int j=1;j<=row-i;j++) {
				
				System.out.print(" ");
			}
			// outer loop  star print
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			}
	   }
}
//-------------------------------------------------------------------------
/*enter row::
6
------------------------------------
     *
    **
   ***
  ****
 *****
******

 
 */
