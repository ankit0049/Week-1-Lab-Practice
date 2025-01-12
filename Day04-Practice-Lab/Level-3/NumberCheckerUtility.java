import java.util.Scanner;
public class NumberCheckerUtility 
{

    // Method to find the count of digits in the number
    public static int countDigits(int number) 
    {
        int count = 0;

        // Special case for 0, which has 1 digit
        if (number == 0) {
            return 1;
        }

        // Count the digits by dividing the number by 10 in each iteration
        while (number > 0) {
            count++;
            number /= 10;  
        }

        // Return the total count of digits
        return count;  
    }





    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number)  
    { 
        int digitsCount = countDigits(number);  
        int[] digits = new int[digitsCount];     
        
        // Loop to extract each digit and store it in the array
        for (int i = digitsCount - 1; i >= 0; i--) {
            // Extract the last digit
            digits[i] = number % 10;  
            // Remove the last digit from the number
            number /= 10;  
        }

        // Return the array of digits
        return digits;  
    }

    // Method to find the sum of the digits of the number using the digits array
    public static int sumOfDigits(int[] digits)  
    {
        int sum = 0;

        // Loop through the digits array and sum up each digit
        for (int digit : digits) {
            // Add the digit to the sum
            sum += digit; 
        }

        // Return the sum of digits
        return sum; 
    }

    // Method to find the sum of the squares of the digits using the digits array
    public static double sumOfSquaresOfDigits(int[] digits)  
    {
        double sum = 0;

        // Loop through the digits array and add the square of each digit to the sum
        for (int digit : digits) {
            // Square the digit and add to the sum
            sum += Math.pow(digit, 2);  
        }

        // Return the sum of squares of digits
        return sum;  
    }
    // Method to check if the number is a Harshad number using the digits array
    public static boolean isHarshadNumber(int number)  
    {
        int[] digits = storeDigits(number);  
        
        // Find the sum of the digits
        int sum = sumOfDigits(digits);  

        // Check if the number is divisible by the sum of its digits
        // If true, it's a Harshad number
        return number % sum == 0;  
    }
    // Method to find the frequency of each digit in the number
    public static int[][] findDigitFrequency(int[] digits) 
    {
        // Create a 2D array to store the frequency of each digit
        int[][] frequency = new int[10][2];

        // Initialize the first column (digits) of the frequency array
        for (int i = 0; i < 10; i++) {
            
            // Store the digit in the first column
            frequency[i][0] = i;  
            
            // Initialize the frequency of each digit to 0
            frequency[i][1] = 0; 
        }
        // Count the frequency of each digit in the digits array
        for (int digit : digits) {
            // Increment the frequency of the digit
            frequency[digit][1]++;  
        }
        // Return the frequency 2D array
        return frequency; 
    }

   
    public static void main(String[] args)  
	{
        
        // Create scanner object to take input from user
        Scanner sc = new Scanner(System.in);  

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();  

        // Store the digits of the number
        int[] digits = storeDigits(number);

        // Display the results of different operations
        System.out.println("Count of digits in the number: " + countDigits(number));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is the number a Harshad number? " + isHarshadNumber(number));

        // Find and display the frequency of each digit
        int[][] frequency = findDigitFrequency(digits);
        System.out.println("Digit frequency:");
        for (int[] entry : frequency) {
            if (entry[1] > 0) {  // Display only digits that appear in the number
                System.out.println("Digit " + entry[0] + " appears " + 
                                    entry[1] + " time(s).");
            }
        }

        // Close the scanner object to prevent resource leakage
        sc.close();
    }
}
