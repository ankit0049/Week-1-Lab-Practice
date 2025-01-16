  import java.util.Scanner;
  
 // Create a class ReplaceWord to replace word inplace of another word
 class ReplaceWord 
 {
    // Method to replace word
    public static String replaceWord(String sentence, String oldWord, String newWord) 
	{   // return the replaced new word
        return sentence.replace(oldWord, newWord);
    }

    public static void main(String[] args) 
	{   // Create Scanner object to get the user input
	    Scanner sc = new Scanner(System.in); 
		
		// Create string variables and get the user input
        String sentence = sc.nextLine();
        String oldWord = sc.nextLine(); 
		
		// Create string newWord get the user input for replace the word
        String newWord = sc.nextLine(); 
		
		// make call and Display the result
        System.out.println("Modified Sentence: " + replaceWord(sentence, oldWord, newWord)); 
		
		// close the scanner object 
		sc.close();
    }
}
