package J12;
import java.util.Scanner;
public class AddMatrix {
       
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the m row value:: \t");
		int m = sc.nextInt();
		
		System.out.println("Enter the n column value::\t");
		int n = sc.nextInt();
		
		System.out.println("total no of element of matrix is::\n"+m*n);
		System.out.println("...................................................................................\t");
	
		int F[][]=new int [m][n];
		System.out.println("Enter the  element of First matrix and  total no of element of  First matrix should be ::\n"+  m*n);
		
         for(int c=0; c<m; c++) {
	         for(int d=0; d<n; d++) {
				  F[c][d]=sc.nextInt();
		    }
		}
		
		System.out.println("...................................................................................\t");
		int S[][]=new int[m][n];
		System.out.println("Enter the  element of Second matrix and  total no of element of Second  matrix should be ::\n"+ m*n);
		
		for(int c=0; c<m; c++) {
			for(int d=0; d<n; d++) {
				S[c][d]=sc.nextInt();
			}
		}
		System.out.println("....................................................................................\t");
		int sum[][]=new int [m][n];
		System.out.println("Calculating sum of two matrix and order of resultant matrix should be ::\t"+ m*n);
		
		for(int c=0; c<m; c++) {
			for(int d=0; d<n; d++) {
				sum[c][d]=F[c][d]+S[c][d];
			}
		}
		System.out.println("........................................................................................\t");
		System.out.println("Result= sum of two matrix is with m*n order or element ::\t "+ m*n);
		
		for(int c=0; c<m; c++) {
			for(int d=0; d<n; d++) {
				System.out.println(sum[c][d]+"\t");	
			}
			System.out.println();
	}
	  } 
	}
