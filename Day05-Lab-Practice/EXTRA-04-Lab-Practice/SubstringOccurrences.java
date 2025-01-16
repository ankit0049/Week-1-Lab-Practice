// Create a Class SubstringOccurrences to count occurrences of a substring in a string
public class SubstringOccurrences  
{
    // Method to count occurrences of a substring
    public static int countOccurrences(String str, String subStr)  
	{
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(subStr, index)) != -1) {
            count++; 
			// Move index forward
            index += subStr.length(); 
        }
        return count;
    }

    public static void main(String[] args)  
	{   // Create a Scanenr object to get the user input
	    Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        String subStr = sc.nextLine();
        System.out.println("Occurrences of '" + subStr + "': " + countOccurrences(str, subStr));
    }
}
