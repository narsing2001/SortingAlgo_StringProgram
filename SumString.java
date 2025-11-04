package J12;
import java.util.Scanner;
public class SumString {
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter row:: ");
			int row=sc.nextInt();
			System.out.println("Enter column:: ");
			int col=sc.nextInt();
			for(int i=1;i<=row;i++) {
				for(int j=1;j<=col;j++) {
					if(i==1 || j==1 || i==row || j==col) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println(" ");
			}
}
		}
/*=========================================================================
Enter row:: 
5
Enter column:: 
7
******* 
*     * 
*     * 
*     * 
******* 
*/
