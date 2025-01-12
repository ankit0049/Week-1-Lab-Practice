import java.util.Scanner; // Importing Scanner for user input

// Class to calculate trigonometric functions for a given angle
public class TrigonometricFunctions {

    // Method to calculate sine, cosine, and tangent of an angle
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert the angle from degrees to radians for trigonometric calculations
        double radians = Math.toRadians(angle); // Conversion to radians

        // Calculate sine of the angle
        double sine = Math.sin(radians); // Using Math.sin() method

        // Calculate cosine of the angle
        double cosine = Math.cos(radians); // Using Math.cos() method

        // Calculate tangent of the angle
        double tangent = Math.tan(radians); // Using Math.tan() method

        // Return all results as an array
        return new double[]{sine, cosine, tangent}; // Array contains sine, cosine, and tangent
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble(); // Read the angle input

        // Call the method to calculate trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle); // Store the results in an array

        // Display the results to the user
        System.out.println("Trigonometric values for the angle " + angle + "°:");
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);

        // Close the Scanner object to release resources
        sc.close();
    }
}
