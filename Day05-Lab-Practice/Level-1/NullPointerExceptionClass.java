
import java.util.Scanner;  

// Public class definition with the name matching the file name
class NullPointerExceptionClass
{

    // Method to generate a NullPointerException by calling a method on a null object
    public static void generateNullPointerException()  
    {
        // Initialize a string to null
        String text = null;  
        
        // Try to call a method on the null object
        // This will throw a NullPointerException
        System.out.println(text.length());   
    }

    public static void main(String[] args) {
        
        // Create Scanner object  for reading input from the user
        Scanner sc = new Scanner(System.in);
        
        try {
            // This will throw the exception
            generateNullPointerException();   
        } catch (NullPointerException e) {
            // Handle the NullPointerException
            System.out.println("This is NullPointerException getting via accessing nll string.");
        }
        
        // Close the Scanner object to free up system resources
        sc.close();
    }
}