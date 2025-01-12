import java.util.Scanner;

class RandomNumbersStats  
{

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size)  
	{
        // Create an array to store the random numbers
        int[] randomNumbers = new int[size];

        // Generate random 4-digit numbers
        for (int i = 0; i < size; i++) {
            // Generate a random number between 1000 and 9999
            randomNumbers[i] = 1000 + (int) (Math.random() * 9000);
        }

        // Return the array
        return randomNumbers;
    }

   
    public static double[] findAverageMinMax(int[] numbers)  
    {
        // Initialize variables to store the sum, minimum, and maximum
        int sum = 0;
        int min = numbers[0]; 
        int max = numbers[0]; 

        // Loop through the array to calculate sum, and find min and max
        for (int num : numbers) {
            // Add each number to the sum
            sum += num;  

            // Update the minimum if the current number is smaller
            if (num < min) {
                min = num;
            }

            // Update the maximum if the current number is larger
            if (num > max) {
                max = num;
            }
        }

        // Calculate the average by dividing the sum by the number of elements
        double average = (double) sum / numbers.length;

        // Return an array containing the average, minimum, and maximum
        return new double[]{average, min, max};
    }

   
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the number of 4-digit random values to generate: ");
        int size = sc.nextInt();

        // Generate the array of random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(size);

        // Find the average, minimum, and maximum values of the array
        double[] stats = findAverageMinMax(randomNumbers);

        // Display the generated random numbers
        System.out.println("\nGenerated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Display the calculated average, minimum, and maximum values
        System.out.println("\nStatistics:");
        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);

        // Close the Scanner object to release resources
        sc.close();
    }
}