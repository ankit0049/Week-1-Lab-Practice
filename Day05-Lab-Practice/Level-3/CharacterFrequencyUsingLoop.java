import java.util.Scanner;

// Create a class CharacterFrequencyUsingLoops
class CharacterFrequencyUsingLoops 
{

    // Method to find the frequency of characters in a string using nested loops
    public static String[] findCharacterFrequency(String text) 
	{
        // Convert the string to a character array
        char[] characters = text.toCharArray();
        // Array to store the frequency of characters
        int[] frequencies = new int[characters.length];

        // Outer loop to check each character in the text
        for (int i = 0; i < characters.length; i++) {
            // Skip the character if it is already counted
            if (characters[i] == '0') {
                continue;
            }

            // Initialize frequency to 1 for the current character
            frequencies[i] = 1;

            // Inner loop to find duplicates of the current character
            for (int j = i + 1; j < characters.length; j++) {
                // If duplicate is found, increase frequency and mark it as counted
                if (characters[i] == characters[j]) {
                    frequencies[i]++;
                    characters[j] = '0'; 
                }
            }
        }

        // Count unique characters for the result array size
        int uniqueCount = 0;
        for (char ch : characters) {
            if (ch != '0') {
                uniqueCount++;
            }
        }

        // Create an array to store characters and their frequencies
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                // Store the character and its frequency
                result[index++] = characters[i] + " - " + frequencies[i];
            }
        }

        // Return the result array
        return result;
    }

    public static void main(String[] args)  
	{
        // Create Scanner object for user input
        Scanner scObject = new Scanner(System.in);

        // Get the user input a string
        System.out.println("Enter a string:");
        String text = scObject.nextLine();

        // Call the method to find the frequency of characters
        String[] characterFrequencies = findCharacterFrequency(text);

        // Display the characters and their frequencies
        System.out.println("Character | Frequency");
        for (String entry : characterFrequencies) {
            System.out.println(entry);
        }

        // Close the Scanner
        scObject.close();
    }
}