import java.util.*;
class StudentScoreCardTask  
{   // Method to generate random 2-digit marks for Physics, Chemistry, and Math (PCM)
    public static int[][] generateScores(int numStudents) 
    {
        Random rand = new Random(); 
        // 2D array to store PCM scores for each student
        int[][] scores = new int[numStudents][3]; 
         // Generate random scores for each student in 3 subjects
        for (int i = 0; i < numStudents; i++) {
            // Physics score (0 to 99)
            scores[i][0] = rand.nextInt(100);  
            // Chemistry score (0 to 99)
            scores[i][1] = rand.nextInt(100);  
            // Maths score (0 to 99)
            scores[i][2] = rand.nextInt(100);  
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) 
    {
        // 2D array to store total, average, and percentage for each student
        double[][] results = new double[scores.length][4];  
        
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];  
           
            // Calculate average marks
            double average = total / 3.0;  
            
            // Calculate percentage
            double percentage = (total / 300.0) * 100;  
            
            // Round off values to 2 decimal places
            // Total marks
            results[i][0] = total;          
            
            // Average (rounded to 2 decimal places)
            results[i][1] = Math.round(average * 100.0) / 100.0;  
            
            // Percentage (rounded to 2 decimal places)
            results[i][2] = Math.round(percentage * 100.0) / 100.0; 
        }
        
        return results;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScoreCard(int[][] scores, double[][] results)  
    {
           System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        
        // Loop through each student and display their scorecard
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t\t%d\t\t%d\t%d\t%.2f\t%.2f%%\n", 
                i + 1, 
                scores[i][0], 
                scores[i][1], 
                scores[i][2], 
                (int) results[i][0], 
                results[i][1], 
                results[i][2]);
        }
    }

    public static void main(String[] args)  
	{ 
         Scanner sc = new Scanner(System.in);
        // Number of students  user Input
        int numStudents = sc.nextInt();  
        
        // Generate random scores for students
        int[][] scores = generateScores(numStudents);
        
        // Calculate total, average, and percentage for each student
        double[][] results = calculateResults(scores);
        
        // Display the scorecard
        displayScoreCard(scores, results);
    }
}
