package com.developersdelicias.palindrome.util;

public class BenjaminPalindromeComplexityCalculator implements PalindromeComplexityCalculator {

	@Override
	public PalindromeComplexity calculate(String palindrome) throws InvalidPalindromeException {
		return PalindromeComplexity.LOW;
	}

}
