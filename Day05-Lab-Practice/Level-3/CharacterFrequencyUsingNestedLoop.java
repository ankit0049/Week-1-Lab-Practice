import java.util.Scanner;
// Creat a class CharacterFrequencyUsingNestedLoop
class CharacterFrequencyUsingNestedLoop 
{

    // Method to find unique characters in a string using charAt()
    public static char[] findUniqueCharacters(String text)  
	{
        StringBuilder uniqueChars = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character is already added to uniqueChars
            for (int j = 0; j < uniqueChars.length(); j++) {
                if (uniqueChars.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If character is unique, add it to the uniqueChars StringBuilder
            if (isUnique) {
                uniqueChars.append(currentChar);
            }
        }

        // Convert uniqueChars StringBuilder to a character array and return
        return uniqueChars.toString().toCharArray();
    }

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequencies(String text) 
	{
        int[] frequency = new int[256]; // Array to store frequency of each character

        // Calculate frequency of each character using ASCII values as indexes
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Get unique characters in the text
        char[] uniqueChars = findUniqueCharacters(text);

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = Character.toString(uniqueChars[i]); 
            result[i][1] = Integer.toString(frequency[uniqueChars[i]]); 
        }

        return result;
    }

    public static void main(String[] args)  
	{   
	    // Create a  Scanner object to get the user input
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to find frequencies
        String[][] frequencies = findCharacterFrequencies(input);

        // Display the results
        System.out.println("Character\tFrequency");
        for (String[] entry : frequencies) {
            System.out.println(entry[0] + "\t\t" + entry[1]);
        }
        // close the Scanner object to release the resourtce
        scanner.close();
    }
}