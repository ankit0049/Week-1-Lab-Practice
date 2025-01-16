import java.util.Scanner;

// Create a Class CompareStrings  to compare two strings lexicographically
public class CompareStrings 
{
    // Method to compare two strings
    public static String compare(String str1, String str2)  
	{
        for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.charAt(i) < str2.charAt(i) ? str1 + " comes before " + str2 : str2 + " comes before " + str1;
            }
        }
        return str1.length() < str2.length() ? str1 + " comes before " + str2 : str2 + " comes before " + str1;
    }

    public static void main(String[] args) 
	{   
	    // Create a Scanner Object to get the user input
	    Scanner sc = new Scanner(System.in); 
		
		// Create a string variables to get the text inputs
        String str1 = sc.nextLine();
        String str2 = sc.nextLine(); 
		
		// Make call and display the result
        System.out.println(compare(str1, str2)); 
		
		// close the scanner and release the resource
		sc.close();
    }
}
