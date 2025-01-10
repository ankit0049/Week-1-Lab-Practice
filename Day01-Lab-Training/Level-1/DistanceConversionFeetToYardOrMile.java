// Create a class named DistanceConversion to convert feet to yards and miles
import java.util.Scanner;

class DistanceConversionFeetToYardOrMile {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert feet to yards and miles
        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        // Display the results
        System.out.println("The distance is " + distanceInFeet + " feet, " +
                           yards + " yards, and " + miles + " miles");
    }
}
