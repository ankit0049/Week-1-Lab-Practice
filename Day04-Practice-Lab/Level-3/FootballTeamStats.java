import java.util.Arrays;

public class FootballTeamStats 
 {

    // Method to generate random heights for players
    public static int[] generateRandomHeights(int size)  
	{
        // Array to store heights
        int[] heights = new int[size]; 
        for (int i = 0; i < size; i++) {
            // Generate random heights between 150 and 250 cm
            heights[i] = (int) (Math.random() * 101) + 150;
        }
        return heights; 
    }

    // Method to calculate the sum of all heights
    public static int calculateSum(int[] heights)  
	{
        int sum = 0; 
        for (int height : heights) {
            // Add each height to the sum
            sum += height; 
        }
        // Return the total sum
        return sum; 
    }

    // Method to calculate the mean height
    public static double calculateMean(int[] heights)  
	{
        // Get the total sum of heights
        int sum = calculateSum(heights); 
        // Calculate mean (sum divided by count)
        return (double) sum / heights.length; 
    }

    // Method to find the shortest height in the array
    public static int findShortestHeight(int[] heights)  
	{
        // Assume the first height is the shortest
        int shortest = heights[0]; 
        for (int height : heights) {
            if (height < shortest) {
                // Update shortest if a smaller value is found
                shortest = height; 
            }
        }
        // Return the shortest height
        return shortest; 
    }

    // Method to find the tallest height 
    public static int findTallestHeight(int[] heights)  
	{
        // Assume the first height is the tallest
        int tallest = heights[0]; 
        for (int height : heights) {
            if (height > tallest) {
                // Update tallest if a larger value is found
                tallest = height; 
            }
        }
        // Return the tallest height
        return tallest;  
    }


    public static void main(String[] args)  
	{
        // Define the size of the football team
        int teamSize = 11; 
        int[] heights = generateRandomHeights(teamSize); 

        // Calculate required operation
        double meanHeight = calculateMean(heights);  

        // Find shortest height
        int shortestHeight = findShortestHeight(heights); 
        
        // Find tallest height
        int tallestHeight = findTallestHeight(heights);  

        // Display the results in one println statement using \n for formatting 

        System.out.println(
            "Football Team Heights Statistics: \n" +
            "Player Heights: " + Arrays.toString(heights) + "\n" +
            "Mean Height: " + meanHeight + " cm\n" +
            "Shortest Height: " + shortestHeight + " cm\n" +
            "Tallest Height: " + tallestHeight + " cm"
        );
    }
}
