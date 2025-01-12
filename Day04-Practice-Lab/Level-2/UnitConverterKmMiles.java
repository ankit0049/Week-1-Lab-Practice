import java.util.Scanner;

// Utility class to perform unit conversions between kilometers, 
// miles, meters, and feet
 class UnitConverterKmMiles  
{

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km)  
    {
        double km2miles = 0.621371; 
        // Perform and return the conversion
        return km * km2miles; 
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles)  
    {
        // Conversion factor for miles to kilometers
        double miles2km = 1.60934; 
        return miles * miles2km;  
    }
    


    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084; 
         
        return meters * meters2feet; 
    }



    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048; 
        // Perform and return the conversion
        return feet * feet2meters; 
    }




    public static void main(String[] args)  
    {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in); 

        // user select a conversion type
        System.out.println("Select a conversion type:\n1. Kilometers to Miles\n2."+ 
                          " Miles to Kilometers\n3. Meters to Feet\n4. Feet to Meters");

        int choice = sc.nextInt(); 

        // user input the value to be converted
        System.out.print("Enter the value to convert: ");
        double value = sc.nextDouble();

        // Variable to store the result of the conversion
        double result = 0;

        // Perform the conversion based on the user's choice
        if (choice == 1) {
            result = convertKmToMiles(value); 
        } else if (choice == 2) {
            result = convertMilesToKm(value); 
        } else if (choice == 3) {
            result = convertMetersToFeet(value); 
        } else if (choice == 4) {
            result = convertFeetToMeters(value); 
        } else {
            System.out.println("Invalid choice."); 
        }

        // Print the conversion result
        System.out.println("Converted value: " + result);

        // Close the Scanner object to release resources
        sc.close();  
    }
}

