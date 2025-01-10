// Create a class named PurchasePriceCalculator to calculate the total price
import java.util.Scanner;

class PurchasePriceCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for unit price and quantity
        System.out.print("Enter the unit price: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Display the result
        System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
    }
}
