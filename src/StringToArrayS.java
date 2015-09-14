//Quiz Practice
//Write Java code to implement the method tokenizeString that accepts a String parameter stringToTokenize and returns a String array.  The method should separate the String parameter into separate Strings delimited by whitespace.
//Ex:  For the input "sample input.",  the output would contain only the elements "sample" and "input.".
public class StringToArrayS {
	
	public static void main(String[] args) {
		
		System.out.println(tokenizeString("sample input.")[0]);
		System.out.println(tokenizeString("sample input.")[1]);

	}
	
	
	public static String[] tokenizeString(String stringToTokenize){

      String[] arrayOfStrings = stringToTokenize.split("\\s+");
        
        return arrayOfStrings;
	}
}
