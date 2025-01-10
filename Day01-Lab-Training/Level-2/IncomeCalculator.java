 // Create a class named IncomeCalculator to compute the total 
 // income of a  person
import java.util.Scanner;

class IncomeCalculator  
 {
    public static void main(String[] args)  
     {
        // Create a Scanner object to take user inputs for  
        // salary and bonus.
           Scanner input = new Scanner(System.in);

        // Take user input salary and store it in a variable.
           System.out.print("Enter the salary (in INR): ");
           double salary = input.nextDouble();

        // Take user input bonus and store it in a variable.
           System.out.print("Enter the bonus (in INR): ");
           double bonus = input.nextDouble();

        // Calculate the total income by adding the salary and bonus.
           double totalIncome = salary + bonus;

        // Display the total income along with the salary  
        // and bonus details.
           System.out.println("The salary is INR " + salary +  
                             " and the bonus is INR " + bonus +
                             ". Hence, the Total Income is INR "  
                              + totalIncome);

        // Close the Scanner object to release resources  
           input.close();
     }
}

