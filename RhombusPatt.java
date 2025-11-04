package J12;
import java.util.Scanner;
public class RhombusPatt {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter row::");
		int row=sc.nextInt();
		System.out.println("------------------------------------");
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {                         //will print rhombus spaces less than one respect to star
				System.out.print(" ");
			}
			for(int j=1;j<=row;j++) {
				System.out.print("*");;
			}
			System.out.println();
	 }
   }
}

//------------------------------------------------------------------------
/*enter row::
5
------------------------------------
    *****
   *****
  *****
 *****
*****

*/