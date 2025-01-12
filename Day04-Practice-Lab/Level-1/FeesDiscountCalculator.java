import java.util.Scanner; 

// Create a class named FeesDiscountCalculator to calculate the discounted fee
class FeesDiscountCalculator  
{
    public static void main(String[] args)  
	{
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take user input for the fee and discount percentage
        System.out.print("Enter the fee: ");
        double fee = sc.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercent = sc.nextDouble();

        // Calculate the discount and the final discounted fee
        double discount = (fee * discountPercent) / 100;
        double discountedFee = fee - discount;

        // Display the discount details
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + discountedFee); 
						   
		// Closing the Scanner object named as sc 
		   sc.close();
    }
}
