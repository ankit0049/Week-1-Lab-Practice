// Create a class named NaturalNumberSum to calculate the sum of n natural numbers.
import java.util.Scanner;

class NaturalNumberSum {
    public static void main(String[] args) {
        // Create a Scanner object to take user input.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number and store it in a variable.
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is a natural number (non-negative).
        if (number >= 0) {
            // Calculate the sum using the formula n * (n + 1) / 2.
            int sum = number * (number + 1) / 2;

            // Display the sum with a descriptive message.
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // Inform the user if the number is not a natural number.
            System.out.println("The number " + number + " is not a natural number.");
        }

        // Close the Scanner object to release resources.
        input.close();
    }
}
