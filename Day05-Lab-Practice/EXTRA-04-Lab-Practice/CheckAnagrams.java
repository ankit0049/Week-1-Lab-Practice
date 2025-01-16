import java.util.Arrays;
import java.util.Scanner; 

// Create a class CheckAnagrams to check text is Anagrams or not
class CheckAnagrams 
{
    // Method to check for anagram
    public static boolean areAnagrams(String str1, String str2) 
	{   
	    // check if length is equal or not
        if (str1.length() != str2.length()) {
            return false;
        }  
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();  
		
		// sort the Arrays using sort method
        Arrays.sort(arr1);
        Arrays.sort(arr2); 
		
		// return the result true or false
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) { 
	    // Create a Scanner object to get the user input
	    Scanner sc = new Scanner(System.in); 
		
		// Create a variables to get the user input text 
        String str1 = sc.nextLine();
        String str2 = sc.nextLine(); 
		
		// Make a call and display the result
        System.out.println("Are Anagrams: " + areAnagrams(str1, str2)); 
		
		// close the scanner object 
		sc.close();
    }
}
