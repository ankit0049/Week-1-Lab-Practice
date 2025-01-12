
import java.util.Scanner;

// Utility class to perform unit conversions for yards, feet, 
// meters, and inches
 class UnitConverterYardsFeet  
{



    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards)  
    {
        double yards2feet = 3; 
        // Perform and return the conversion
        return yards * yards2feet; 
    }




    // Method to convert feet to yards
    public static double convertFeetToYards(double feet)  
    {
        double feet2yards = 0.333333;
         // Perform and return the conversion 
        return feet * feet2yards;
    }





    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) 
    {
        double meters2inches = 39.3701; 
        // Perform and return the conversion
        return meters * meters2inches; 
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) 
    {
        double inches2meters = 0.0254;  
        // return the conversion outcome
        return inches * inches2meters; 
    }

    public static void main(String[] args)  
    {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in); 

        // Prompt the user to select a conversion type
        System.out.println("Select a conversion type:\n1. Yards to Feet\n2." + 
                          " Feet to Yards\n3. Meters to Inches\n4. Inches to Meters");
        int choice = sc.nextInt(); 

        // Prompt the user to input the value to be converted
        System.out.print("Enter the value to convert: ");
        double value = sc.nextDouble();

        // Variable to store the result of the conversion
        double result = 0;

        // Perform the conversion based on the user's choice
        if (choice == 1) {
            result = convertYardsToFeet(value);
        } else if (choice == 2) {
            result = convertFeetToYards(value); 
        } else if (choice == 3) {
            result = convertMetersToInches(value); 
        } else if (choice == 4) {
            result = convertInchesToMeters(value); 
        } else {
            System.out.println("Invalid choice."); 
        }

        // Print the conversion result
        System.out.println("Converted value: " + result);

        // Close the Scanner object to release resources
        sc.close(); 
    }
}

