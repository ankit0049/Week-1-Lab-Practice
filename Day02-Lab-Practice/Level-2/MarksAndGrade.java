// This program takes marks in three subjects and calculates the percentage.
// Based on the percentage, it assigns a grade and provides remarks.

import java.util.Scanner;

class MarksAndGrade 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user inputs for marks in three subjects.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter marks for Physics, Chemistry, and Maths.
        System.out.print("Enter marks in Physics: ");
        int physics = input.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = input.nextInt();

        System.out.print("Enter marks in Maths: ");
        int maths = input.nextInt();

        // Calculate the total and percentage.
        int total = physics + chemistry + maths;
        double percentage = total / 3.0;

        // Determine the grade and remarks based on the percentage.
        String grade;
        String remarks;

        if (percentage >= 80) 
	  {
            grade = "A";
            remarks = "(Level 4, above agency-normalized standards)";
        } 
	  else if (percentage >= 70) 
	  {
            grade = "(Level 3, at agency-normalized standards)";
            remarks = "Good";
        }
	  else if (percentage >= 60) 
	  {
            grade = "C";
            remarks = "(Level 2, below, but approaching agency-normalized standards)";
        } 
	  else if (percentage >= 50) 
	  {
            grade = "D";
            remarks = "(Level 1, well below agency-normalized standards)";
	  } 
	  else if (percentage >= 40) 
	  {
            grade = "E";
            remarks = "(Level 1-, too below agency-normalized standards)";
	  }
	  else 
	  {
            grade = "F";
            remarks = "(Remedial standard)";
        }

        // Display the percentage, grade, and remarks.
        System.out.println("Average Marks: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        // Close the Scanner to release resources.
        input.close();
    }
}