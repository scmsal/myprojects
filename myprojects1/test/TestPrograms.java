import static org.junit.Assert.*;

import org.junit.Test;

public class TestPrograms {

//Test Palindrome class
	
	@Test
	public void testReverse() {
		
		assertEquals("olleh", Palindrome.reverse("hello"));
	}

	@Test
	public void testcheckPalindrome() {
		assertFalse(Palindrome.checkPalindrome("restaurant"));
		assertFalse(Palindrome.checkPalindrome("dragon"));
		assertTrue(Palindrome.checkPalindrome("shooboohs"));
		assertTrue(Palindrome.checkPalindrome("dad"));
		assertTrue(Palindrome.checkPalindrome("madam"));
	}
	
//Test IntegerPalindrome
		
	@Test
	
	public void testIntPalReverse() {
		assertEquals(789, IntegerPalindrome.reverse(987),0);
	}
	
	@Test
	
	public void testIntPalReverserec() {
		assertEquals(6875, IntegerPalindrome.reverserec(5786));
	
	}

//Test PrimeNumber class
@Test
public void testPrimeNumber(){
   assertFalse(PrimeNumber.isPrime(4));

   assertFalse(PrimeNumber.isPrime(82));

   assertTrue(PrimeNumber.isPrime(5));

   assertTrue(PrimeNumber.isPrime(101));
   
   assertTrue(PrimeNumber.isPrime(3));
}
}
