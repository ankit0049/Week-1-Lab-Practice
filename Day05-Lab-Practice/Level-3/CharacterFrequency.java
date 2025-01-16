import java.util.Scanner;

class CharacterFrequency  
{

    // Method to find the frequency of characters in a string using charAt()
    public static int[][] findCharacterFrequency(String text)  
    {
      // Array to store the frequency of each character (based on ASCII values)
         int[] charFrequency = new int[256]; 

        // Loop through the string to count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);  
          // Get the current character
          // Increment its frequency
            charFrequency[currentChar]++;  
        }

        // Calculate the number of unique characters in the string
        int uniqueCount = 0;
        for (int freq : charFrequency) {
            // If frequency is greater than 0, it is a unique character
            if (freq > 0) {  
                uniqueCount++;
            }
        }

        // Create a 2D array to store the characters and their frequencies
        int[][] result = new int[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < charFrequency.length; i++) {
            if (charFrequency[i] > 0) {
              // Store the ASCII value of the character
                result[index][0] = i;  
              // Store the frequency of the character
                result[index][1] = charFrequency[i];  
                index++;
            }
        }

       // Return the 2D array containing characters and their frequencies
        return result; 
    }

    public static void main(String[] args)  
    {
      // Create a Scanner object for user input
        Scanner scObject = new Scanner(System.in);  

        // Get the user Input
        System.out.println("Enter a string:");
        // Take input string
        String text = scObject.nextLine();  

        // Call the method to find the frequency of characters in the string
        int[][] characterFrequencies = findCharacterFrequency(text);

        // Display the characters and their frequencies in a tabular format
        System.out.println("Character | Frequency");
        for (int[] pair : characterFrequencies) {
             // Convert ASCII value back to character
            char character = (char) pair[0];  
             // Get the frequency of the character
            int frequency = pair[1]; 
            // Print character and frequency
            System.out.println("     " + character + "     |      " + frequency); 
        }

      // Close the Scanner object
        scObject.close(); 
    }
}
