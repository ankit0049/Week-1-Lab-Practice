import java.util.Scanner;  

// This class checks whether a given year is a leap year or not
public class LeapYearChecker  
{

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) 
	{
        // Check if the year is divisible by 4 and either not 
        // divisible by 100 or divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { 
		    // Year is a leap year if the condition is true
            return true;  
        } else { 
		    // Year is not a leap year if the condition is false
            return false; 
        }
    }

    // Main method to drive the program
    public static void main(String[] args)  
	{   // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);   
		
        System.out.print("Enter a year: ");  
        int year = sc.nextInt();  

        //  check if it's a leap year
        String result = (year >= 1582) ? 
                        (isLeapYear(year) ? year + " is a Leap Year" : year + 
                        " is not a Leap Year") : 
                        "Year must be greater than or equal to 1582";  
        // Print the result of the leap year check in a single line
        System.out.println(result);

        // Close the Scanner object to release the resources
        sc.close();   
    }
}
