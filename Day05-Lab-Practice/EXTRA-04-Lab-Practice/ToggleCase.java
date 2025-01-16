
import java.util.Scanenr;

// Create a Class ToggleCase to toggle the case of characters in a string
 class ToggleCase
 {
    // Method to toggle the case
    public static String toggleCase(String str)  
	{
        StringBuilder toggled = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggled.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggled.append(Character.toUpperCase(c));
            } else { 
			    // Non-alphabetic characters remain the same
                toggled.append(c); 
            }
        } 
		// return the toggled answer
        return toggled.toString();
    }

    public static void main(String[] args)  
	{   // Crete a Scanner to get the user input
	    Scanner sc = new Scanner(System.in); 
		
		// Create a str String variable to get the user input text
        String str = sc.nextInt();
        System.out.println("Toggled String: " + toggleCase(str)); 
		
		// close the Scanenr object
		sc.close();
    }
}
