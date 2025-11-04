package J12;
import java.util.Scanner;

class Student {
    String name;
    int marks;
    String grade;

    // Constructor to initialize student data
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
        this.grade = determineGrade(marks);
    }

    // Method to determine grade based on marks
    private String determineGrade(int marks) {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Marks: " + marks + ", Grade: " + grade);
    }
}


public class GradingSystem {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        // Array to hold student data
        Student[] students = new Student[5]; // Change size as needed

        // Input student data
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            int marks = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            // Create new Student object and store it in the array
            students[i] = new Student(name, marks);
        }

        // Display student information
        System.out.println("\nStudent Information:");
        for (Student student : students) {
            student.displayInfo();
        }

        scanner.close();

	}

}
