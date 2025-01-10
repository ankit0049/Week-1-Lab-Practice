// Create a class named BasicCalculator to perform arithmetic operations
import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for two numbers
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Display the results
        System.out.println("The addition, subtraction, multiplication, and division of " +
                           number1 + " and " + number2 + " are: " +
                           addition + ", " + subtraction + ", " + multiplication + ", and " + division);
    }
}
