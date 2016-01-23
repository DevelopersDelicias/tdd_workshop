package com.developersdelicias.palindrome.util;

public class BenjaminPalindromeAnalyzer implements PalindromeAnalyzer {

	@Override
	public boolean isPalindrome(String phrase) {
		String phraseWithoutSpaces = phrase.replaceAll(" ", "");
		String reversed = new StringBuilder(phraseWithoutSpaces).reverse().toString();
		return phraseWithoutSpaces.equalsIgnoreCase(reversed);
	}

}
