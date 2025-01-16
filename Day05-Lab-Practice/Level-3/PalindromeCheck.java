import java.util.Scanner;
// Create a PalindromeCheck to check text palindrome with diffrent ways
class PalindromeCheck  
{

    // Logic 1: Check if a text is palindrome using start and end index comparison
    public static boolean isPalindromeByIndex(String text)  
   {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) { 
			   // Not a palindrome if characters don't match
                return false;  
				
            }
            start++;
            end--;
        } 
		// Palindrome if all characters match
        return true; 
    }

    // Logic 2: Check if a text is palindrome using recursion
    public static boolean isPalindromeRecursive(String text, int start, int end)  
    {
        if (start >= end) {
          // Base case: If start index is greater or equal to end index
            return true; 
        }
        if (text.charAt(start) != text.charAt(end)) {
          // Not a palindrome if characters don't match
            return false; 
        }
      // Recursive call
        return isPalindromeRecursive(text, start + 1, end - 1); 
    }

    // Logic 3: Check if a text is palindrome using character arrays
    public static boolean isPalindromeUsingCharArray(String text)  
    {
        // Convert string to character array
        char[] originalArray = text.toCharArray();  
        char[] reverseArray = new char[originalArray.length];

        // Fill the reverse array
        for (int i = 0; i < originalArray.length; i++) {
            reverseArray[i] = originalArray[originalArray.length - 1 - i];
        }

        // Compare original and reverse arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reverseArray[i]) {
                // Not a palindrome if any character doesn't match
                return false;  
            }
        } 
		// Palindrome if all characters match
        return true;  
		
    }

    public static void main(String[] args)  
    {
        // Create Scanner object for user input
        Scanner scObject = new Scanner(System.in);

        // Get the user a text input
        System.out.println("Enter a text to check if it's a palindrome:");
        String text = scObject.nextLine();

        // Perform palindrome check using Logic 1
        boolean resultByIndex = isPalindromeByIndex(text);
        System.out.println("Using index comparison: " + (resultByIndex ? "Palindrome" : "Not a palindrome"));

        // Perform palindrome check using Logic 2 (recursion)
        boolean resultByRecursion = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Using recursion: " + (resultByRecursion ? "Palindrome" : "Not a palindrome"));

        // Perform palindrome check using Logic 3 (character arrays)
        boolean resultByCharArray = isPalindromeUsingCharArray(text);
        System.out.println("Using character arrays: " + (resultByCharArray ? "Palindrome" : "Not a palindrome"));

        // Close the Scanner
        scObject.close();
    }
}
