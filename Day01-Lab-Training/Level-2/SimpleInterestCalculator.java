// Create a class named SimpleInterestCalculator to calculate 
//  the simple interest

import java.util.Scanner;

class SimpleInterestCalculator 
 {
    public static void main(String[] args)  
    {
        // Create a Scanner object to take user inputs for  
        // principal, rate, and time.
           Scanner input = new Scanner(System.in);

        // user input the principal amount and store it in a variable.
           System.out.print("Enter the Principal amount (in INR): ");
           double principal = input.nextDouble();

        // user input the rate of interest and store it in a variable.
           System.out.print("Enter the Rate of Interest (in %): ");
           double rate = input.nextDouble();

        // user to input the time period and store it in a variable.
           System.out.print("Enter the Time (in years): ");
           double time = input.nextDouble();

        // Calculate the simple interest using the 
        // formula (Principal * Rate * Time) / 100.
           double simpleInterest = (principal * rate * time) / 100;

        // Display the calculated simple interest along  
        // with the input details.
           System.out.println("The Simple Interest is " + simpleInterest + 
                              " for Principal " + principal + ", Rate of Interest "  
                               +rate + " and Time " + time );

        // Close Scanner object to release resources    
           input.close();
    }
}

