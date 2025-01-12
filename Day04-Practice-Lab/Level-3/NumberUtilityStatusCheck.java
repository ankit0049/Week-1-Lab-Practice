
public class NumberUtilityStatusCheck  
{

    // Method to find the count of digits in the number
    public static int countDigits(int number)  
    {
        int count = 0;  

        if (number == 0) {
            return 1;  
        }

        while (number > 0) {
            // Increment count for each digit
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
        
        // Create an array to store digits
        int[] digits = new int[digitsCount];    

        for (int i = digitsCount - 1; i >= 0; i--) {
            // Extract the last digit and store it
            digits[i] = number % 10;  
            
            // Remove the last digit from the number
            number /= 10;  
        }

        // Return the array of digits
        return digits;  
    }

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) 
    {
        // Create a new array for reversed digits
        int[] reversedDigits = new int[digits.length];  

        int j = 0; 
        for (int i = digits.length - 1; i >= 0; i--) {
            // Fill reversedDigits array with reversed order
            reversedDigits[j++] = digits[i];  
        }

        // Return the reversed digits array
        return reversedDigits;  
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] arr1, int[] arr2) 
    {
        if (arr1.length != arr2.length) {
            return false;  
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                // If any element is different, arrays are not equal
                return false; 
            }
        }

        // Arrays are equal
        return true;  
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number)  
    {
        int[] digits = storeDigits(number);  
        // Reverse the digits array
        int[] reversedDigits = reverseDigits(digits);  

        // Check if original and reversed arrays are equal
        return areArraysEqual(digits, reversedDigits); 
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number)  
    {
        // Store digits of the number
        int[] digits = storeDigits(number);  

        // Check if any digit is non-zero and present in the array
        for (int digit : digits) {
            if (digit != 0) {
                // If any non-zero digit exists, it's a duck number
                return true;  
            }
        }

        // No non-zero digit, so it's not a duck number
        return false;  
    }

    public static void main(String[] args)  
    {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);  

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); 

        // Call methods and display the results
        System.out.println("Count of digits in the number: " + countDigits(number));

        int[] digits = storeDigits(number); 

        System.out.println("Is the number a palindrome? " + isPalindrome(number));
        System.out.println("Is the number a Duck number? " + isDuckNumber(number));

        // Close the scanner object to prevent resource leakage
        sc.close();
    }
}



