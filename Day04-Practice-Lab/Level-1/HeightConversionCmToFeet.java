// Create a class named HeightConversion to convert height from cm to feet and inches
import java.util.Scanner;

class HeightConversionCmToFeet {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scannerObject = new Scanner(System.in);

        // Take user input for height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = scannerObject.nextDouble();

        // Convert centimeters to feet and inches
        double totalInches = heightCm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        // Display the height in feet and inches
        System.out.println("Your Height in cm is " + heightCm +
                           ", while in feet is " + feet + " and inches is " + inches); 
						   
						   
	    // Closing the Scanner object named as scannerObject 
		   scannerObject.close();
    }
}
