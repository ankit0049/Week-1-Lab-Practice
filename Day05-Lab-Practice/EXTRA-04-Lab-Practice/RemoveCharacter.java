import java.util.Scanner;

// Create a class RemoveCharacter to remove specific char
class RemoveCharacter 
{
    // Method to remove specific character
    public static String removeChar(String str, char ch)  
	{
        return str.replace(String.valueOf(ch), "");
    }

    public static void main(String[] args) 
	{   // Creaet a scanner object to get the user input
	    Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
		
		// Create a character and get the user input
        char ch = sc.next().charAt(0); 
		
		// Make call and display the result
        System.out.println("Modified String: " + removeChar(str, ch)); 
		
		// close the scanner object to release the resource
		sc.close();
    }
}
