package com.developersdelicias.palindrome.util;

import static org.junit.Assert.*;

import org.junit.Test;

public abstract class PalindromeComplexityCalculatorTest {

	protected PalindromeComplexityCalculator calculator;

	@Test
	public void withOnewWordPalindromeShouldReturnLowComplexity() {
		assertSame(PalindromeComplexity.LOW, calculator.calculate("oso"));
	}

}
