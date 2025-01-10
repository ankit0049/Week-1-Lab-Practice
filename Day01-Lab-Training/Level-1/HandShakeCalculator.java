// Create a class named HandshakeCalculator to calculate the maximum number of handshakes
import java.util.Scanner;

class HandshakeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculate the maximum number of handshakes using the formula n * (n - 1) / 2
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the result
        System.out.println("The maximum number of handshakes among " +
                           numberOfStudents + " students is " + handshakes);
    }
}
