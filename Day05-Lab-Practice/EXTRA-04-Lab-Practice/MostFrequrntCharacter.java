import java.util.HashMap;
import java.util.Scanner; 

// Class to find the most frequent character
class MostFrequentCharacter  
{
    // Method to find the most frequent character
    public static char findMostFrequent(String str)  
	{   // Create a HashMap to store character and their occurrence
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        char mostFrequent = str.charAt(0); 
		
		// Iterate through the each key and get the most repeated get as result
        for (char c : frequencyMap.keySet()) {
            if (frequencyMap.get(c) > frequencyMap.get(mostFrequent)) {
                mostFrequent = c;
            }
        } 
		
		// return most frequent character
        return mostFrequent;
    }

    public static void main(String[] args)  
	{   // Create a Scanner object to get the user input
	    Scanner sc = new Scanner(System.in);
		
		// Create a string variable to get user input
        String str = sc.nextLine(); 
		
		// Make call and display the result
        System.out.println("Most Frequent Character: " + findMostFrequent(str)); 
		
		// close the scanner object to release the resource
		sc.close();
    }
}
