import java.util.Scanner;
 class UniqueCharactersFinder 
{

    // Method to calculate the length of the string without using the length() method
    public static int findLength(String text)  
    {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string reached
        }
        return length;
    }

    // Method to find unique characters in a string using charAt()
    public static char[] findUniqueCharacters(String text) {
         // Get the length of the string
        int length = findLength(text);  
        // Temporary array to store unique characters
        char[] temp = new char[length];  
        // Counter for unique characters
        int uniqueCount = 0;  

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the current character has appeared before
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the temp array
            if (isUnique) {
                temp[uniqueCount++] = currentChar;
            }
        }

        // Create a new array to store the unique characters
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    public static void main(String[] args) 
    {
        Scanner scObject = new Scanner(System.in);

        // Take user input for the string
        System.out.println("Enter a string:");
        String text = scObject.nextLine();

        // Find unique characters
        char[] uniqueCharacters = findUniqueCharacters(text);

        // Display the unique characters
        System.out.println("Unique characters in the string:");
        for (char c : uniqueCharacters) {
            System.out.print(c + " ");
        }

      // Close the scanner
        scObject.close(); 
    }
}
