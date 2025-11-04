package J12;

import java.util.Scanner;

public class FloyedPatt8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter row::");
		int row=sc.nextInt();
		System.out.println("------------------------------------");
		// first-upper left part
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//print spaces
			int spaces= 2*(row-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			//second upper right part
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// first lower left part
		for(int i=row;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//print spaces
			int spaces= 2*(row-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			//second lower right part
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
	}

  }
	}
//-------------------------------------------------------------------------
/*
 enter row::
5
------------------------------------
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *

*/
