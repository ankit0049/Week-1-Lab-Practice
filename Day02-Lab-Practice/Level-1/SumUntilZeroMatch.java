// Create a class named SumUntilZeroMatch to compute the sum of numbers entered by the user until they enter 0.
import java.util.Scanner;

class SumUntilZeroMatch {
    public static void main(String[] args) {
        // Create a Scanner object to take user input for numbers.
        Scanner input = new Scanner(System.in);

        // Initialize a variable to store the running total.
        double total = 0.0;

        // Declare a variable to hold the user-entered value.
        double userValue;

        // Use a while loop to repeatedly ask for user input until 0 is entered.
           while(true){
            // Prompt the user to input a number.
            System.out.print("Enter a number (0 to stop): ");
            userValue = input.nextDouble();

            // Add the entered number to the total if it is not zero.
            if (userValue != 0) {
                total += userValue;
            } else {
			break;}
        } 

        // Display the total sum of all entered numbers.
        System.out.println("The total sum of the entered numbers is: " + total);

        // Close the Scanner object to release resources.
        input.close();
    }
}
