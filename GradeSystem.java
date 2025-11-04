package J12;
import java.util.Scanner;
    class Student
   {
    String name;
    int marks;
    String Grade;
    
   //initialize constructor for  accept student data
     public Student(String name,int marks)
    {
     this.name=name;
     this.marks=marks;
     this.Grade=findGrade(marks);
    }
     
// define method to find Grade as per define in the constructori.e findGrade method this keyword accept current instance and class object
  private String findGrade(int marks)
{
        if (marks >= 90 && marks<=100) 
        {
            return "A+";
        } 
        else 
        if (marks >= 80 && marks<=90) 
        {
            return "A";
        } 
        else 
        if (marks >= 70 && marks<=80) 
        {
            return "B";
        } 
        else 
        if (marks >= 60 && marks<=70) 
        {
            return "C";
        } 
        else 
        if (marks >= 50 && marks<=60) 
        {
            return "D";
        } 
        else 
        {
            return "Fail";
        }
}
    // Method to display student information
 void displayInfo() 
{
     System.out.println("Name: " + name + ", Marks: " + marks + ", Grade: " + Grade);
}
}


public class GradeSystem 
{
	
	public static void main(String[] args) 
	{
		 
	        /*Student[] indicates that students is an array that will hold references to Student objects. The type of the array must match the type of the objects you plan to store in it.
	         create array of Student type
	        */
		 Scanner sc=new Scanner(System.in);
       System.out.print("Enter no of student: ");
        int n=sc.nextInt();
        // which continue and consume next line for user define array size
             sc.nextLine();
		
	        Student[] arr =new Student[n];
	        //apply for loop to input the Student class data
	        for(int i=0;i<arr.length;i++)
	        {
	         System.out.print("Enter the student Name:"+(i+1)+":");
	         String name=sc.nextLine();
	         
	         System.out.println("Enter the student marks:"+(i+1)+":");
	         int marks=sc.nextInt();
	         
	         sc.nextLine();//consume new line code
	     
	         // Create new Student object and store it in the array
	            arr[i] = new Student(name, marks);
	                   
	        }
	         
	         // Display student information
	        System.out.println("\nStudent Information:");
	        for (Student s : arr) 
	        {
	            s.displayInfo();
	        }      
	}
}
/*--------------------------------------------------------------------
 Enter no of student: 3
Enter the student Name:1:narsing
Enter the student marks:1:
90
Enter the student Name:2:pratik
Enter the student marks:2:
80
Enter the student Name:3:ashish
Enter the student marks:3:
70

Student Information:
Name: narsing, Marks: 90, Grade: A+
Name: pratik, Marks: 80, Grade: A
Name: ashish, Marks: 70, Grade: B
*/


