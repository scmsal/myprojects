

import java.lang.Math;

public class PrimeNumber {

	//This pair of methods makes testing possible.
	public static boolean isPrime(int value) {
		  if (value <= 1) {
		    return false;
		  }
		  for (int i = 2; i <= Math.sqrt(value); i++) {
		    if (value % i == 0) {
		      return false;
		    }
		  }
		  return true;
		  
		}
	
	public static void print(int value) {
		System.out.println( value + " is prime: "+ isPrime(value));
	}
	
	//This method combines the prior two methods into one.
	public static void isPrime1 (int n) {
		boolean isPrime=true;
		
		if (n<0) {
			System.out.println("Not applicable to numbers less than 1");
			isPrime= false;
		}
		
		if (n==1) {
			isPrime= false;
		}
		
		if (n==2 || n==3) {
			isPrime=true;
		}
		
		for (int i = 2; i <= Math.sqrt (n); i++) { 
			if (n % i ==0) {
				isPrime= false;
				break;
			}
		}
	
		if (isPrime) { 
			System.out.println(n + " is a prime number.");
		} else {
		System.out.println(n + " is not a prime number.");
		}
		System.out.print("Enter another number greater than 0, or enter 0 to quit.");
	}
	

	//This is the driver method.
	public static void main(String[] args) {
		
		System.out.print("Enter a number greater than 0, or enter 0 to quit.");
		Parser parser = new Parser();
		int input = parser.getIntInput();
		
		
		while (parser.continuing) {
			if (input == 0) {
				parser.end();
				System.out.println("The scanner has closed.");
				break;
				}
			isPrime1(input);
			input = parser.getIntInput();	
		}
		
	}
	
	
	
}
