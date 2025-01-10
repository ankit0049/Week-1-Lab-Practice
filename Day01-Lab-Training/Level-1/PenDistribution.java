  
  
  // Create a class named PenDistribution to calculate pens per student and remaining pens
class PenDistribution  
{
    public static void main(String[] args) {
        // Create int variables for total pens and number of students
        int totalPens = 14, totalStudents = 3;

        // Create a int variable to Calculate pens per student
        int pensPerStudent = totalPens / totalStudents; 
		
		// Create a int varible to Calculate remaining pens
        int remainingPens = totalPens % totalStudents;

        // Display the distribution details
        System.out.println("The Pen Per Student is " + pensPerStudent +
                           " and the remaining pen not distributed is " + remainingPens);
    }
}
