  
  // Create a class for converting kilometer to miles, class named as DistanceConversionKilometerToMile
   class DistanceConversionKilometerToMile
   { 
       public static void main ( String ars[]) 
     	{
	       
			 
			// Create a double variable kilometer and assign value 10.8
               double kilometer = 10.8;  
			   
		    // Create a double variable oneKilometerInMiles and assign value 1.6
               double oneKilometerInMiles = 0.6;
            
            // Create a double varible kilometerToMile and calculate  1km = 1.6 miles
               double kilometerToMile = ( kilometer * oneKilometerInMiles );			
			   
			// Display the Distance Conversion  
			   System.out.println ("The distance "+ kilometer +"km in miles is " + kilometerToMile);
              			
	       
	    }
  
   }