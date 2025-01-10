// Create a class named WeightConverter to convert weight from  
// pounds to kilograms

import java.util.Scanner;

class WeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input for weight in pounds.
           Scanner input = new Scanner(System.in);

        // Prompt the user to input their weight in pounds and store 
        // it in a variable.
           System.out.print("Enter your weight in pounds: ");
           double weightInPounds = input.nextDouble();

        // Convert the weight from pounds to kilograms using the 
        // conversion factor (1 pound = 2.2 kg).
           double weightInKilograms = weightInPounds / 2.2;

        // Display the converted weight in both pounds and kilograms.
         System.out.println("The weight of the person is " + weightInPounds
                           + " pounds, " +"which is equivalent to " + 
                           weightInKilograms + " kilograms.");

        // Close the Scanner object to release resources 
           input.close();
    }
}

