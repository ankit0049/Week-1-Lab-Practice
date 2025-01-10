// Create a class named TriangleArea to calculate the area of a triangle
import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for base and height
        System.out.print("Enter the base of the triangle (in cm): ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle (in cm): ");
        double height = input.nextDouble();

        // Calculate the area of the triangle
        double areaInCm= 0.5 * base * height;

        // Convert area to square inches (1 inch = 2.54 cm)
        double areaIn = areaInCm/ (2.54 * 2.54);

        // Display the results
        System.out.println("The area of the triangle is " + areaInCm + " square cm and " +
                           areaIn + " square inches");
    }
}
