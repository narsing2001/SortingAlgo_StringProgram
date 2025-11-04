package J12;
import java.util.Scanner;
public class DiamondPatt {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter row::");
		int row=sc.nextInt();
		System.out.println("------------------------------------");
		//upper diamond space and star print
		for(int i=1;i<=row;i++) {
		//Spaces
		for(int j=1;j<=row-i;j++) {
		System.out.print(" ");
		}
		//for stars
		int n=2*i-1;
		for(int j=1;j<=n;j++) {
		System.out.print("*");
		}
		System.out.println();
		}
		//Lower diamond space and star print
		for(int i=row;i>=1;i--) {
		//Spaces
		for(int j=1;j<=row-i;j++)
		{
		System.out.print(" ");
		}
		//for stars
		int n=2*i-1;
		for(int j=1;j<=n;j++) {
	    System.out.print("*");
		}
		System.out.println();
		}
		}
        }

/*enter row::
7
------------------------------------
      *
     ***
    *****
   *******
  *********
 ***********
*************
*************
 ***********
  *********
   *******
    *****
     ***
      *
-----------------------------------
*/
