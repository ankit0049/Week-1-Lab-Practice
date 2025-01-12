  import java.util.Scanner; 
  // create a  SimpleInterest class 
  class SimpleInterest
   {  
     // create a method name simpleInterest to calculate the SimpleInterest of 
	 // given principal, time and rateOfInterest 
	 
	 public static double simpleInterest ( double principal , double rateOfInterest , double time )
	 { 
	  // create a interestValue variable and assign the result
	  double interestValue  = (( principal * rateOfInterest * time )  / 100.0);
	  
	  return interestValue;
	 }
   
      public static void main (String args[] ) 
	  {
	     // Create a Scanner object name as input
	     Scanner input = new Scanner (System.in);   
		 
		 // Create a  double variable principal 
         System.out.println(" Enter principal value (In INR) : " );
         double principal = input.nextDouble();
		 
		 // Create a double variable rate and get user input  
		 System.out.println( " Enter rateOfInterest value ( In % ) : ");
		 double rateOfInterest = input.nextDouble(); 
		 
		 // Create a double variable time and get user input 
		 System.out.println( " Enter time value ( In Year ) : ");
		 double time = input.nextDouble(); 
		 
		 // calling simpleInterest Method and keep the result in simpleInterestHolder
		 double simpleInterestHolder = simpleInterest (principal , rateOfInterest , time); 
		 
		 // Display the result
		 System.out.println(" The Simple Interest is " + simpleInterestHolder + 
		                     " for Principal " + principal + ", Rate of Interest "+
							  rateOfInterest + " and Time " + time );
	   
	  }
   
   }