
public class Palindrome {
	
	public static void main (String[] args) {
		
	//I want to refactor this to try inheritance instead.
		
	System.out.print("Enter a word or Q to quit.");
	Parser parser = new Parser();
	String input = parser.getStringInput();
	
	
	while (parser.continuing) {
		if (input.equals("Q")) {
			parser.end();
			System.out.println("The scanner has closed. Goodbye!");
			break;
			}
		palindrome(input);
		input = parser.getStringInput();	
	}
	
	
}
	
	public static void palindrome (String input) {
		
	System.out.println("String input: " + input);
	
	
	System.out.println("Reversed string output: " + reverse(input));
	
	if (checkPalindrome(input)) {
		System.out.println("The word '" + input + "' is a palindrome.");
	}else {
		System.out.println("The word '" + input + "' is not a palindrome.");
	}
	System.out.print("Enter another word or Q to quit.");
	}
		
	/**
	 * Method to reverse the string	
	 */
	
	public static String reverse(String input) {
		String output= "";
		for (int i=input.length()-1; i>=0; i--) {
			output +=  input.charAt(i);
		}
		return output;
	}

	/** 
	 * Method to check if the output matches the input
	 * @param input
	 * @return true or false
	 */
	
	public static boolean checkPalindrome (String input) {
		if (input.compareTo(reverse(input))==0) {
		return true;}
		return false;
	}
	
}
