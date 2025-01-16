 import java.util.Scanner;
 class CountVowelConsonants
 {
    public static void main ( String args[]) 
	{
	   // Create scanner object naem as input
	   Scanner input = new Scanner (System.in);  
	   
	   // Create a String variable to take user input  
	   // nextLine is used to take String input
	   String userInput = input.nextLine();  
	   
	   // Create a String vowel and assign the vowels
	   String vowels = "aeiou";  
	   
	   // Create count variables of int type, named as vowelCounter and consonantsCounter  
	   // and Intilize with zero
	   int vowelCounter  = 0 , consonantsCounter = 0;
	   
	   
	   // Iterate over the String and Count the vowel and Consonants  
	   for(int i = 0; i < userInput.length(); i++)
	   { 
	     // Create a character variable to store the char of the String
	     char character = userInput.charAt(i); 
		 
		 // check wheater character is vowel  
		 if( vowels.indexOf( character ) != -1 )
		 {
		   vowelCounter++; 
		 } 
		 else 
		 {
	       consonantsCounter++;	 
		 }
	   
	   } 
	   
	   
	   // Disaplay the result 
	   System.out.println(" Number of vowels in string is : " + vowelCounter +
	                      " Number of Consonants in String is : " + consonantsCounter ); 

       // closing the Scanner object to release the resource 
       input.close();	   
	
	}
 
 
 
 }