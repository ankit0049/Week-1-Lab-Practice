
import java.util.Scanner;

class SubstringComparison 
{

    public static void main(String[] args)  
    {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input the main string from the user
        System.out.print("Enter the main string: ");
        String inputString = scanner.next();

        // Input the start and end indices for the substring
        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();

        // Validate indices
        if (startIndex < 0 || endIndex > inputString.length() || startIndex >= endIndex) {
            System.out.println("Invalid indices. Please ensure 0 <= startIndex < endIndex <= string length.");
            return;
        }

        // Create a substring using the charAt() method
        String substringUsingCharAt = createSubstringUsingCharAt(inputString, startIndex, endIndex);

        // Create a substring using the built-in substring() method
        String substringUsingBuiltIn = inputString.substring(startIndex, endIndex);

        // Compare the two substrings
        boolean areSubstringsEqual = compareStringsUsingCharAt(substringUsingCharAt, substringUsingBuiltIn);

        // Display the results
        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using built-in substring(): " + substringUsingBuiltIn);
        System.out.println("Are the substrings equal? " + areSubstringsEqual);

        // Close the scanner
        scanner.close();
    }

    //Creates a substring using the charAt() method and built-in method and compare them.
    
    public static String createSubstringUsingCharAt(String str, int startIndex, int endIndex)  
    {
        StringBuilder substring = new StringBuilder();

        // Iterate through the specified range and append each character
        for (int i = startIndex; i < endIndex; i++) {
            substring.append(str.charAt(i));
        }

        return substring.toString();
    }

    // Compares two strings character by character using the charAt() method.
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        // If the lengths are different, they are not equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}


