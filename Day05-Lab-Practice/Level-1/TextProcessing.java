import java.util.Scanner;

 class TextProcessing  
 {

    public static void main(String[] args)  
    {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take complete text input from the user
        System.out.print("Enter the complete text: ");
        String inputText = scanner.nextLine();

        // Convert text to uppercase using a custom method
        String upperCaseCustom = toUpperCaseUsingCharAt(inputText);

        // Convert text to uppercase using the built-in method
        String upperCaseBuiltIn = inputText.toUpperCase();

        // Compare the two uppercase strings
        boolean areEqual = compareStringsUsingCharAt(upperCaseCustom, upperCaseBuiltIn);

        // Display the results
        System.out.println("Uppercase using custom method: " + upperCaseCustom);
        System.out.println("Uppercase using built-in method: " + upperCaseBuiltIn);
        System.out.println("Are the two uppercase strings equal? " + areEqual);


        // Close the scanner
        scanner.close();
    }

    //  Converts a string to uppercase using the charAt() method and ASCII logic.
    public static String toUpperCaseUsingCharAt(String text) 
     {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if the character is lowercase
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase by subtracting 32 from ASCII value
                result.append((char) (ch - 32));
            } else {
                // Keep the character as is
                result.append(ch);
            }
        }

        return result.toString();
    }

    //  Compares two strings character by character using the charAt() method.
    
    public static boolean compareStringsUsingCharAt(String str1, String str2)  
    {
        // Check if lengths are different
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
