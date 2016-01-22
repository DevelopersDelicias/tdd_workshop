package com.developersdelicias.palindrome.util;

import static org.junit.Assert.*;

import org.junit.Test;

public abstract class PalindromeComplexityCalculatorTest {

	protected PalindromeComplexityCalculator calculator;

	@Test
	public void withOnewWordPalindromeShouldReturnLowComplexity() {
		assertSame(PalindromeComplexity.LOW, calculator.calculate("oso"));
	}

	@Test
	public void withFourWordsPalindromeShouldReturnMediumComplexity() throws Exception {
		assertSame(PalindromeComplexity.MEDIUM, calculator.calculate("Anita lava la tina"));
	}

	@Test
	public void withSevenWordsPalindromeShouldReturnHighComplexity() throws Exception {
		assertSame(PalindromeComplexity.HIGH, calculator.calculate("A man, a plan, a canal, Panama!"));
	}

	@Test(expected=InvalidPalindromeException.class)
	public void withInvalidPalindromeShouldThrowInvalidPalindromeException() throws Exception {
		calculator.calculate("not a palindrome");
	}

}
