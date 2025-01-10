// Create a class named LargestNumberChecker to determine the largest of three numbers.
import java.util.Scanner;

class LargestNumberChecker {
    public static void main(String[] args) {
        // Create a Scanner object to take user inputs for three numbers.
        Scanner input = new Scanner(System.in);

        // Prompt the user to input three numbers and store them in variables.
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();

        // Check which number is the largest.
        boolean isFirstLargest = (number1 > number2) && (number1 > number3);
        boolean isSecondLargest = (number2 > number1) && (number2 > number3);
        boolean isThirdLargest = (number3 > number1) && (number3 > number2);

        // Display the results for each number with a descriptive message.
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);

        // Close the Scanner object to release resources.
        input.close();
    }
}
j