
import java.util.Scanner;

// Create a class StringTrimmer for delete the leading and trailing space
class StringSpaceTrimmer  
{

    // Method to trim leading and trailing spaces from a string using charAt()
    public static String trimString(String text) 
	{
        // Initialize the start and end indices for trimming
        int startIndex = 0;
        int endIndex = text.length() - 1;

        // Trim leading spaces
        while (startIndex < text.length() && text.charAt(startIndex) == ' ') {
            startIndex++;
        }

        // Trim trailing spaces
        while (endIndex >= 0 && text.charAt(endIndex) == ' ') {
            endIndex--;
        }

        // Return the trimmed string
        return text.substring(startIndex, endIndex + 1);
    }

    // Main method to handle user input and display results
    public static void main(String[] args)  
	{
        // Create a Scanner object 
        Scanner sc = new Scanner(System.in);

        // Get the user Input 
        System.out.print("Enter a string with leading and trailing spaces: ");
        String text = sc.nextLine();

        // Trim the string using the custom trimString() method
        String trimmedText = trimString(text);

        // Use the built-in trim() method for comparison
        String actualTrimmedText = text.trim();

        // Display the trimmed text of custom method
        System.out.println("Trimmed string using custom method: " + trimmedText);

        // Display the trimmed text using the built-in trim() method
        System.out.println("Trimmed string using built-in trim() method: " + actualTrimmedText);

        // Close the Scanner to release system resources
        sc.close();
    }
}
