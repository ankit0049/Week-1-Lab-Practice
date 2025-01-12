
class NumberStatusAnalyzer  
{

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number)  
    {
        // First loop to count the number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {  // Check if 'i' is a factor of the number
                count++;  // Increment the factor count
            }
        }

        // Second loop to store the factors in an array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;  // Store each factor in the array
            }
        }

        return factors;  // Return the factors array
    }

    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int[] factors)  
    {
        // The largest factor will always be the last element in the sorted factors array
        return factors[factors.length - 1];  // Return the greatest factor
    }

    // Method to find the sum of the factors using factors array
    public static int sumOfFactors(int[] factors)  
    {
        int sum = 0;  // Initialize sum to 0
        for (int factor : factors) {
            sum += factor;  // Add each factor to the sum
        }

        return sum;  // Return the sum of the factors
    }

    // Method to find the product of the factors using factors array
    public static int productOfFactors(int[] factors)  
    {
        int product = 1;  // Initialize product to 1
        for (int factor : factors) {
            product *= factor;  // Multiply each factor to the product
        }

        return product;  // Return the product of the factors
    }

    // Method to find the product of the cubes of the factors using the factors array
    public static double productOfCubesOfFactors(int[] factors)  
    {
        double product = 1;  // Initialize product to 1.0
        for (int factor : factors) {
            product *= Math.pow(factor, 3);  // Multiply the cube of each factor
        }

        return product;  // Return the product of cubes of the factors
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number)  
    {
        int[] factors = findFactors(number);  // Get the factors of the number
        int sumOfFactors = sumOfFactors(factors) - number;  // Sum of proper divisors (exclude the number itself)

        return sumOfFactors == number;  // Return true if sum of proper divisors equals the number
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number)  
    {
        int[] factors = findFactors(number);  // Get the factors of the number
        int sumOfFactors = sumOfFactors(factors) - number;  // Sum of proper divisors (exclude the number itself)

        return sumOfFactors > number;  // Return true if sum of proper divisors is greater than the number
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number)  
    {
        int[] factors = findFactors(number); 
        // Sum of proper divisors (exclude the number itself)
        int sumOfFactors = sumOfFactors(factors) - number; 

        // Return true if sum of proper divisors is less than the number
        return sumOfFactors < number; 
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number)  
    {
        int sum = 0;  
        int originalNumber = number;

        // Loop to extract each digit and calculate the factorial of the digit
        while (number > 0) {
            int digit = number % 10;  
            // Add the factorial of the digit to the sum
            sum += factorial(digit);  
            number /= 10;  
        }

        return sum == originalNumber;  // Return true if the sum of factorials equals the original number
    }

    // Method to calculate the factorial of a number
    private static int factorial(int n)  
    {
        // Initialize factorial to 1
        int fact = 1; 
        for (int i = 1; i <= n; i++) {
            fact *= i; 
        }
        // Return the factorial
        return fact;  
    }


    public static void main(String[] args) {
        
        // Create scanner object for input
        Scanner sc = new Scanner(System.in);  

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();  

        // Call methods and display the results
        int[] factors = findFactors(number);  

        System.out.println("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");  // Print each factor
        }

        System.out.println("\nGreatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productOfCubesOfFactors(factors));

        System.out.println("Is " + number + " a Perfect Number? " + isPerfectNumber(number));
        System.out.println("Is " + number + " an Abundant Number? " + isAbundantNumber(number));
        System.out.println("Is " + number + " a Deficient Number? " + isDeficientNumber(number));
        System.out.println("Is " + number + " a Strong Number? " + isStrongNumber(number));

        // Close the scanner object to prevent resource leakage
        sc.close();
    }
}
