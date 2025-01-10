// Create a class named IntegerOperation to compute and  
//  display integer operations
import java.util.Scanner;

class IntegerOperation  
{
    public static void main(String[] args) 
     {
        // Create a Scanner object for user input
           Scanner input = new Scanner(System.in);

        // Take user input for three integers a, b, and c
           System.out.print("Enter the value of a: ");
           int a = input.nextInt();

           System.out.print("Enter the value of b: ");
           int b = input.nextInt();

           System.out.print("Enter the value of c: ");
           int c = input.nextInt();

        // Compute the operations
           int result1 = a + b * c;
           int result2 = a * b + c;
           int result3 = c + a / b;
           int result4 = a % b + c;




        // Display the results
           System.out.println("The results of Integer Operations are: " +
                       result1 + ", " + result2 + ", " + result3 + ", and " 
                      + result4);

        // Close the Scanner
           input.close();
    }
}

