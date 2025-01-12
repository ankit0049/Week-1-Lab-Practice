 import java.util.Scanner; 
class NumberStatusUtility  
{

    // Method to check if a number is prime
    public static boolean isPrime(int number) 
    {
        // Prime numbers are greater than 1
        if (number <= 1) {
            // Numbers less than or equal to 1 are not prime
            return false;  
        }

        // Check divisibility from 2 to sqrt(number)
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                // If divisible by any number, it's not prime
                return false;  
            }
        }
        // If no divisors found, it's prime
        return true; 
    }

    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int number)  
    {
        // Calculate the square of the number
        int square = number * number; 
        int sumOfDigits = 0;

        // Find the sum of digits of the square of the number
        while (square > 0) {
            // Add the last digit of the square
            sumOfDigits += square % 10;  
            square /= 10;  
        }

        // If sum of digits equals the number, it's a neon number
        return sumOfDigits == number; 
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number) 
    {
        int sum = 0;
        int product = 1;
        
        // Calculate the sum and product of digits
        while (number > 0) {
            int digit = number % 10;
            // Add digit to sum
            sum += digit;    
            // Multiply digit to product
            product *= digit;  
            // Remove the last digit
            number /= 10;   
        }

        // If sum equals product, it's a spy number
        return sum == product;  
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphicNumber(int number)  
    {
        // Calculate the square of the number
        int square = number * number;  

        // Check if the square ends with the original number
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) 
    {
        // A number is buzz if it's divisible by 7 or ends with 7
        return (number % 7 == 0 || number % 10 == 7);
    }

    // Main method to test the utility class
    public static void main(String[] args) 
    {
        // Create scanner object to take input from user
        Scanner sc = new Scanner(System.in);  

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();  

        // Display the results of different operations
        System.out.println("Is the number prime? " + isPrime(number));
        System.out.println("Is the number a neon number? " + isNeonNumber(number));
        System.out.println("Is the number a spy number? " + isSpyNumber(number));
        System.out.println("Is the number an automorphic number? " +   
                            isAutomorphicNumber(number)); 

        System.out.println("Is the number a buzz number? " + isBuzzNumber(number));

        // Close the scanner object to prevent resource leakage
        sc.close();
    }
}