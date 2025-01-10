// Create a class named DistanceConvertor to convert user-provided kilometers to miles
import java.util.Scanner;

class DistanceConvertor  
 {
    public static void main(String[] args)  
	{   
	     // Creat a double variable km 
	      double km ;
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user for distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        km = input.nextInt();
           
		 // Create a final int variable MILE_VALUE and assign value 1.6 
		  final double MILE_VALUE = 1.6 ; 
		 
        // Convert kilometers to miles (1 mile = 1.6 km)
        double miles = km / MILE_VALUE;

        // Display the result
        System.out.println("The total miles is " + miles + " miles for the given " + km + " km");
    }
 }
