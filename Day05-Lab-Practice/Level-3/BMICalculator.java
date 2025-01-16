import java.util.Scanner;
 // Create a class BMICalculator to calculate bmi
 class BMICalculator  
 {

    // Method to calculate BMI and determine status
    public static String[][] calculateBMI(double[][] data)  
	{ 
	
	    // Array to store height, weight, BMI, and status
        String[][] results = new String[data.length][4]; 

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0]; 
			// Convert height from cm to meters 
            double heightInMeters = data[i][1] / 100; 
			// Calculate BMI
            double bmi = weight / (heightInMeters * heightInMeters); 

            // Determine BMI status
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            // Store the results 
			// Height
            results[i][0] = String.format("%.2f", data[i][1]);  
			// Weight
            results[i][1] = String.format("%.2f", weight); 
            // BMI			
            results[i][2] = String.format("%.2f", bmi);   
            // Status			
            results[i][3] = status;                          
        }

        return results;
    }

    // Method to display the BMI table
    public static void displayBMI(String[][] results)  
	{   // used % for spacing to make table format 
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");

        for (String[] result : results) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", result[0], result[1], result[2], result[3]);
        }
    }

    public static void main(String[] args)  
	{
        Scanner scanner = new Scanner(System.in);
        // Array to store weight and height of 10 individuals
        double[][] data = new double[10][2]; 

        // Input weight and height for 10 individuals
        System.out.println("Enter weight (kg) and height (cm) for 10 individuals:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d - Weight (kg): ", i + 1);
            data[i][0] = scanner.nextDouble();

            System.out.printf("Person %d - Height (cm): ", i + 1);
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and status
        String[][] results = calculateBMI(data);

        // Display the BMI table
        displayBMI(results);
         
		// Close the scanner
        scanner.close(); 
    }
}
