package com.developersdelicias.palindrome.util;

import org.apache.log4j.Logger;

public class BenyiboyPalindromeAnalyzer implements PalindromeAnalyzer {

	Logger logger = Logger.getLogger(BenyiboyPalindromeAnalyzer.class);

	@Override
	public boolean isPalindrome(String phrase) {

		if (phrase == null || phrase.isEmpty()) {
			return false;
		}

		String phraseWithoutSymbols = phrase.replaceAll("[^a-zA-Z0-9]", "");
		int length = phraseWithoutSymbols.length();
		String firstHalfString = phraseWithoutSymbols.substring(0, length / 2);
		String reversed = new StringBuilder(phraseWithoutSymbols).reverse().toString();
		String secondHalfStringReversed = reversed.substring(0, length / 2);

		return firstHalfString.equalsIgnoreCase(secondHalfStringReversed);
	}

	@Override
	public String toString() {
		return "BenyiboyPalindromeAnalyzer";
	}

}
