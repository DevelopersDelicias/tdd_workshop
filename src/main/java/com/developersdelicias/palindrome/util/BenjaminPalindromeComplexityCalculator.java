package com.developersdelicias.palindrome.util;

public class BenjaminPalindromeComplexityCalculator implements PalindromeComplexityCalculator {

	private PalindromeAnalyzer analyzer;
	
	public BenjaminPalindromeComplexityCalculator(PalindromeAnalyzer analyzer) {
		this.analyzer = analyzer;
	}
	
	@Override
	public PalindromeComplexity calculate(String palindrome) throws InvalidPalindromeException {
		
		if (!analyzer.isPalindrome(palindrome)) {
			throw new InvalidPalindromeException(palindrome  + " is not a palindrome");
		}
		int numberOfWords = palindrome.split(" ").length;
		
		if (numberOfWords < 4) {
			return PalindromeComplexity.LOW;
		} else if (numberOfWords < 7) {
			return PalindromeComplexity.MEDIUM;
		}
		
		return PalindromeComplexity.HIGH;
	}

}