import java.util.Scanner;  

// Public class definition with the name matching the file name
class StringIndexOutOfBoundsExceptionDemo  
{

    // Method to generate a StringIndexOutOfBoundsException by accessing an invalid index
    public static void generateIndexOutOfBoundsException()  
    {
        // Initialize a string
        String text = "Hello";  
        
        // Try to access an index that is out of bounds 
        // This will throw StringIndexOutOfBoundsException
        System.out.println(text.charAt(10));  
    }

    public static void main(String[] args)  
    {
        
        // Create Scanner object for reading input from the user
        Scanner sc = new Scanner(System.in);
        
        // Call the method that generates a StringIndexOutOfBoundsException
        try {
            // This will throw the exception
            generateIndexOutOfBoundsException();   
        } catch (StringIndexOutOfBoundsException e) {
            // Handle the StringIndexOutOfBoundsException
            System.out.println("Caught StringIndexOutOfBoundsException: Index is out of range.");
        }
        
        // Close the Scanner object to free up system resources
        sc.close();
    }
}