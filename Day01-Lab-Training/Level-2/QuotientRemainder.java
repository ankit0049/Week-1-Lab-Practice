import java.util.Scanner;

class QuotientRemainder  
{
    public static void main(String[] args)  
     {
        // Create a Scanner object for user input
           Scanner input = new Scanner(System.in);

        // Take user input for two numbers
           System.out.print("Enter the first number: ");
           int number1 = input.nextInt();

           System.out.print("Enter the second number: ");
           int number2 = input.nextInt();

        // Compute quotient and remainder of number1 and number2
           int quotient = number1 / number2;
           int remainder = number1 % number2;

        // Display the results
           System.out.println("The Quotient is " + quotient + " and Remainder is " + 
                               remainder +" of two numbers " + number1  + " and " +
                               number2);

        // Close the Scanner
           input.close();
    } 
}
