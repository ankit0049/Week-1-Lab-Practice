import java.util.Scanner; 

// create a class to check the numbers
public class NumberChecker  
{

    // Method to count the number of digits in the number
    public static int countDigits(int number)  
    {
        // Initialize count variable to 0
        int count = 0;

        // Check if the number is 0, in which case count is 1
        if (number == 0) {
            return 1;
        }

        // Loop to count the digits of the number
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
        // Get the number of digits
        int digitsCount = countDigits(number);  
        
        // Create an array to store digits
        int[] digits = new int[digitsCount];     

        // Loop to extract digits from the number and store them in the array
        for (int i = digitsCount - 1; i >= 0; i--) {
            digits[i] = number % 10;  
            number /= 10;  
        }

        // Return the array of digits
        return digits; 
    }

    // Method to check if the number is a duck number
    public static boolean isDuckNumber(int number) 
    {
        // Convert number to digits array
        int[] digits = storeDigits(number);

        // Check if any digit in the array is non-zero and present
        for (int digit : digits) {
            if (digit != 0) {
                return true;  
            }
        }

        // No non-zero digit exists, so it's not a duck number
        return false;  
    }

    // Method to check if the number is an Armstrong number
    public static boolean isArmstrongNumber(int number)  
    {
        // Convert number to digits array
        int[] digits = storeDigits(number);

        // Initialize a variable to store the sum of the digits raised to the power
        int sum = 0;
        int numDigits = digits.length;

        // Calculate the sum of digits raised to the power of numDigits
        for (int digit : digits) {
            sum += Math.pow(digit, numDigits); 
        }

        // If the sum equals the original number, it's an Armstrong number
        return sum == number; 
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) 
    {
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Loop through the digits array to find the largest and second largest numbers
        for (int digit : digits) {
            if (digit > largest) {
                // Update second largest
                secondLargest = largest;  
                // Update largest
                largest = digit;  
            } else if (digit > secondLargest) {
                // Update second largest if needed
                secondLargest = digit;  
            }
        }

        // Return the largest and second largest elements
        return new int[]{largest, secondLargest}; 
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) 
    {
        // Initialize the smallest and second smallest elements to maximum possible values
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Loop through the digits array to find the smallest and second smallest numbers
        for (int digit : digits) {
            if (digit < smallest) {
                // Update second smallest
                secondSmallest = smallest;  
                // Update smallest
                smallest = digit;  
            } else if (digit < secondSmallest) {
                // Update second smallest if needed
                secondSmallest = digit;  
            }
        }

        // Return the smallest and second smallest elements
        return new int[]{smallest, secondSmallest};  
    }

    public static void main(String[] args)  
    {
        // Create scanner object to take input from user
        Scanner sc = new Scanner(System.in);  

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();  

        // Call methods and display the results
        System.out.println("Count of digits in the number: " + countDigits(number));
        
        int[] digits = storeDigits(number);  

        System.out.println("Is the number a Duck number? " + isDuckNumber(number));
        System.out.println("Is the number an Armstrong number? " + isArmstrongNumber(number));

        // Find and display the largest and second largest digits
        int[] largestElements = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestElements[0] + ", Second largest digit: " + largestElements[1]);

        // Find and display the smallest and second smallest digits
        int[] smallestElements = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestElements[0] + ", Second smallest digit: " + smallestElements[1]);

        // Close the scanner object to prevent resource leakage
        sc.close();
    }
}
