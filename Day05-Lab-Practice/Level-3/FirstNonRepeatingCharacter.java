 import java.util.Scanner; 
 // Create a class FirstNonRepeatingCharacter to find unique char
 class FirstNonRepeatingCharacter  
{
    // Method to find the first non-repeating character 
    public static char findFirstNonRepeatingCharacter(String text)  
    {
      // Array to store how many times each character appears
        int[] charFrequency = new int[256]; 

        // Count the frequency of each character in the string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            charFrequency[currentChar]++;
        }

        // Find the first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (charFrequency[currentChar] == 1) {
              // Found the first non-repeating character
                return currentChar;  
            }
        }

      // Return null character if no non-repeating character is found
        return '\0';  
    }

    public static void main(String[] args) 
    {
        Scanner scObject = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter a string:");
        String text = scObject.nextLine();

        // Call the method to find the first non-repeating character
        char firstNonRepeating = findFirstNonRepeatingCharacter(text);

        // Print the result
        if (firstNonRepeating != '\0') {
            System.out.println("The first non-repeating character is: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }

        // Close the scanner after use
        scObject.close(); 
    }
}
