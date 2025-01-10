// Create a class named SumUntilNegetiveOrZero to compute the sum of numbers entered by the user
// until they enter 0 or a negative number.
import java.util.Scanner;

class SumUntilNegetiveOrZero {
    public static void main(String[] args) {
        // Create a Scanner object to take user input for numbers.
        Scanner input = new Scanner(System.in);

        // Initialize a variable to store the running total.
        double total = 0.0;

        // Use an infinite while loop to repeatedly ask for user input.
        while (true) {
            // Prompt the user to input a number.
            System.out.print("Enter a number (0 or negative to stop): ");
            double userValue = input.nextDouble();

            // Check if the entered number is 0 or negative, and break the loop if true.
            if (userValue <= 0) {
                break;
            }

            // Add the entered number to the total.
            total += userValue;
        }

        // Display the total sum of all entered numbers.
        System.out.println("The total sum of the entered numbers is: " + total);

        // Close the Scanner object to release resources.
        input.close();
    }
}
