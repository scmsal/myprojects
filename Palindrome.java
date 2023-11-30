/**
* Application to check if a word is a palindrome.
*/

public class Palindrome {
	
	public static void main (String[] args) {

  	String reader;
  	System.out.print("Enter a word: ");
  	Parser parser = new Parser();
  	palindrome(parser.getStringInput());
		
	}
	
	public static void palindrome (String input) {
	
	System.out.println("String input: " + input);	
	System.out.println("Reversed string output: " + reverse(input));
	
	if (checkPalindrome(input)) {
		System.out.println("The word '" + input + "' is a palindrome.");
	}else {
		System.out.println("The word '" + input + "' is not a palindrome.");
	}
}
