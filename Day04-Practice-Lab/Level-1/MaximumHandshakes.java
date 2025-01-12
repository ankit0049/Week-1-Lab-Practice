import java.util.Scanner;

// Create a class MaximumHandshakes to calculate the possible handshake in n students 

class MaximumHandshakes 
 { 
    // Create a method name maximumHandshakes to calculate possible handshake in n students 
    public static int maximumHandshakes ( int number ) 
    { 
	 // Create a variable name resultOfHandshake to store the result
     int resultOfHandshake = ( number * (number - 1)) / 2;
	 return resultOfHandshake;
    }	
	 public static void main(String args[])
	 { 
	   // Create a Scanner object name as input
	   Scanner input = new Scanner(System.in); 
	   
	   // Create a number variable and get user Input 
	   System.out.println(" Enter a number : " );
	   int number = input.nextInt(); 
	   
	   // Create a variable name resultOfHandshake and stored th result of MaximumHandshakes method
	   int resultOfHandshake = maximumHandshakes( number ); 
	   
	   // Display the result 
	   System.out.println(" Maximum Possible Handshakes of n students : " + resultOfHandshake ); 
	   
	   // Closing the Scanner Input to release the resource 
	   input.close();
	 }
	
	
 }