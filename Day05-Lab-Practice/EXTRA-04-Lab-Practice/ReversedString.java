import java.util.Arrays;
import java.util.Scanner;

class ReverseString 
{
  // create a method to reverse the string 
  public static String reversedString( String textInput ) 
  { 
    // convert the String into array and stored in charArr reference
    char charArr[] = textInput.toCharArray(); 
	
	// Create variable low and high and Intilize the value
	int low = 0 , high = textInput.length() - 1; 
	 
	// Iterate over the charArr and swap the value
	while( low <= high ) 
	{ 
      // Create a temp variable and store the value
	  char temp = charArr[low]; 
	  // Set the value of high at low
	  charArr[low] = charArr[high];
	  charArr[high] = temp;
	  
	  // Increment the low by 1
	  low++; 
	  
	  // Decrement the high by 1
	  high --;
	} 
	
	// convert the charArr resultant array into String
	return Arrays.toString(charArr);
  
  }
  public static void main( String args[]) 
  {
     // Create scanner object naem as input
	   Scanner input = new Scanner (System.in);  
	   
	   // Create a String variable to take user input  
	   // nextLine is used to take String input 
	   System.out.println(" Enter a textInput : ");
	   String textInput = input.nextLine();  
	   
	   String resultString = reversedString ( textInput ); 
	   
	   // Display the result 
	   System.out.println("Original String : " + textInput + " And the reversed version of Original is : " + resultString);
  
  
  }


}