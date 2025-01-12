   // Create a class for calculate the Average Marks of PCM, class named as AverageMarkComputation
  class AverageMarkComputation 
  {
  
      public static void main ( String args[])
      {  
	    
		// Create a String varible name and assign value Sam 
           String name = "Sam";		
 
        // Create a int varible mathScore and assign value 94 
		   int mathScore = 94; 
		
        // Create a int varible physicsScore and assign value 95 
		   int physicsScore = 95; 
        
		// Create a int varible chemistryScore and assign value 96 
		   int chemistryScore = 96; 	 

        // Create a double varible averageOfAll and calculate using ( mathScore + physicsScore + chemistryScore ) / 3	 
           int averageOfPCM = (( mathScore + physicsScore + chemistryScore ) / 3); 

        // Display the AverageMarks 
           System.out.println( name +"'s average marks in PCM is "+ averageOfPCM);		
	  
  
      }  
  }