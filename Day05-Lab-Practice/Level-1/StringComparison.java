import java.util.Scanner;  

// Create a class StringComparison to compare the strings
 class StringComparison  
{

    // Method to compare two strings using the charAt() method
    public static boolean compareStringsUsingCharAt(String str1, String str2)  
	{
        // Check if both strings have the same length
        if (str1.length() != str2.length()) {
            return false; 
        }
        
        // Loop through both strings and compare each character using charAt()
        for (int i = 0; i < str1.length(); i++) {
            // If any characters not match, return false
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        
        // Return true if all characters match
        return true;
    }

    public static void main(String[] args)  
	{
        
        // Create Scanner object for reading input from the user
        Scanner sc = new Scanner(System.in);
        
        // Get the User Input 
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine(); 
        
        //  Take Input from the user
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();  // Read the entire line entered by the user
        
        // Compare the strings using the charAt() method and store the result status in areStringsEqualUsingCharAt
        boolean areStringsEqualUsingCharAt = compareStringsUsingCharAt(str1, str2);
        
        // Compare the strings using the built-in equals() method and store the result status in areStringsEqualUsingEquals
        boolean areStringsEqualUsingEquals = str1.equals(str2);
        
        // Display the result from the charAt() method
        System.out.println("Are both strings equal using charAt()? " + areStringsEqualUsingCharAt);
        
        // Display the result from the built-in equals() method
        System.out.println("Are both strings equal using equals()? " + areStringsEqualUsingEquals);
        
        // Close the Scanner object to free up system resources
        sc.close();
    }
}
