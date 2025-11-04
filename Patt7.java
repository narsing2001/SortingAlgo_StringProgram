package J12;

import java.util.Scanner;

public class Patt7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter row::");
		int row=sc.nextInt();
		System.out.println("------------------------------------");
	
		for(int i=1;i<=row;i++) {
		
		for(int j=1;j<=i;j++) {
			int sum=i+j;
			if(sum%2==0) {
				System.out.print("1"+" ");
			}else {
				System.out.print("0"+" ");
			}
			}
		System.out.println();
		}

	}

}
//-------------------------------------------------------------------
/*enter row::
5
------------------------------------
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
*/
