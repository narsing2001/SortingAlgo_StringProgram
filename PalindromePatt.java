package J12;
import java.util.Scanner;
public class PalindromePatt {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter row::");
		int row=sc.nextInt();
		System.out.println("------------------------------------");
		for(int i=1;i<=row;i++) {
		//spaces
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			
			//first half
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			//second half
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

/*enter row::
5
------------------------------------
    1
   212
  32123
 4321234
543212345

*/