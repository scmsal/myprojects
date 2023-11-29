/**
 * Program to reverse a number (iterative and recursive) and check if it is a palindrome.
 */

public class IntegerPalindrome {
	
	
	static int reversed = 0;
	static int number;
	public static int answer;
	
	/* 
	 * Method to reverse a number using iteration.
	 * @ return reverse of number
	 */
	public static int reverse (int number) {
		int reverse = 0;
		int remainder = 0;
		do {
			remainder = number%10;
			reverse = reverse*10 + remainder;
			number = number/10;
		}while (number >0);
		return reverse;
	}
	
	/* 
	 * Method to check if a number is a palindrome.
	 */
	public static boolean checkPalindrome (int number) {
		return (number == answer ) ? true : false;
	}
	
	/*
	 * Recursive method to reverse a number
	 */
	
	public static int reverserec (int number) {
		if (number ==0) {
			return reversed;
		}
		
		if (number >0) {
			int remainder = number%10;
		
			reversed = reversed*10 + remainder;
			
			reverserec(number/10);
		}	
		return reversed;
		
	}

/**
* Method to find and print the answer of whether the inputted number is a palindrome or not.
/*

	public static void printAnswer(String method) {
		
		answer = (method=="Iterative") ? reverse(number) : reverserec(number);
		System.out.println ("***" + method +  " method***");
		System.out.println ("The reverse of " + number + " is " + answer);
		System.out.println (number + " is a palindrome: " + checkPalindrome(number) + "\n");
		
	}

/**
* Main method to run the program.
*/

public static void main (String [] args) {
		
		System.out.println ("Enter a number.");
		
		MyParser parser = new MyParser();
		number = parser.getIntInput();
		
		printAnswer ("Iterative");
		printAnswer ("Recursive");
		
	}
}
