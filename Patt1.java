package J12;
import java.util.*;

public class Patt1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter row::");
		int row=sc.nextInt();
		System.out.println("------------------------------------");
		//System.out.println("enter column:: ");
		//int col=sc.nextInt();
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
  }

/* enter row::
6
------------------------------------
*
**
***
****
*****
******

*/


