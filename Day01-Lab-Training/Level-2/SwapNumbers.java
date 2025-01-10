// Create a class named SwapNumbers to swap two numbers entered by the user
import java.util.Scanner;

class SwapNumbers 
 {
    public static void main(String[] args) 
      {
        // Create a Scanner object to take user inputs for two numbers.
           Scanner input = new Scanner(System.in);

        // Take user input the first number and store it in a variable.
            System.out.print("Enter the first number: ");
            int number1 = input.nextInt();

        // Take the user input second number and store it in a variable.
           System.out.print("Enter the second number: ");
           int number2 = input.nextInt();

        // Swap the two numbers using a temporary variable.
           int temp = number1;
           number1 = number2;
           number2 = temp;

        // Display the swapped numbers with appropriate labels.
           System.out.println("The Swapped numbers are" + 
                               number1 +" and " +  number2);

        // Close the Scanner object to release resources 
           input.close();
       }
}

