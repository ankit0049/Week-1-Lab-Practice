import java.util.Scanner; 

// Class to divide chocolates among children and find the remainder
  class ChocolateDivision  
 {

    // Method to divide chocolates and find the remainder
    public static int[] divideChocolates(int totalChocolates, int totalChildren)  
	{
        // Calculate the number of chocolates each child gets
        int chocolatesPerChild = totalChocolates / totalChildren; 

        // Calculate the remaining chocolates
        int remainingChocolates = totalChocolates % totalChildren; 

        // Return the results as an array
        return new int[]{chocolatesPerChild, remainingChocolates}; 
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // P user to enter the total number of chocolates
        System.out.print("Enter the total number of chocolates: ");
        int totalChocolates = sc.nextInt(); // Read the total chocolates

        // Prompt the user to enter the total number of children
        System.out.print("Enter the total number of children: ");
        int totalChildren = sc.nextInt(); // Read the total children

        // Call the method to divide chocolates and find the remainder
        int[] result = divideChocolates(totalChocolates, totalChildren); // Store the result array

        // Display the number of chocolates each child gets and the remainder
        System.out.println("Each child gets: " + result[0] + " chocolates, and " +
                           "remaining chocolates: " + result[1]);

        // Close the Scanner object to release resources
        sc.close();
    }
}
