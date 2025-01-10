// Create a class named VotingEligibility to check if a person can vote based on their age.
import java.util.Scanner;

class VotingEligibility {
    public static void main(String[] args) {
        // Create a Scanner object to take user input for age.
        Scanner input = new Scanner(System.in);

        // Prompt the user to input their age and store it in a variable.
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Check if the age is greater than or equal to 18 for voting eligibility.
        if (age >= 18) {
            // Display a message indicating the person can vote.
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // Display a message indicating the person cannot vote.
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        // Close the Scanner object to release resources.
        input.close();
    }
}
