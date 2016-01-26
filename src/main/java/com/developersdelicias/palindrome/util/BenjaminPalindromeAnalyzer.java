package com.developersdelicias.palindrome.util;

import org.apache.log4j.Logger;

public class BenjaminPalindromeAnalyzer implements PalindromeAnalyzer {

	private final static Logger logger = Logger.getLogger(BenjaminPalindromeAnalyzer.class);

	@Override
	public boolean isPalindrome(String phrase) {

		logger.info("Checking if " + phrase + " is a palindrome");
		if (phrase == null || phrase.isEmpty()) {
			return false;
		}

		String phraseWithoutSymbols = phrase.replaceAll("[^a-zA-Z0-9]", "");

		if (phraseWithoutSymbols.isEmpty()) {
			return false;
		}

		String reversedPhrase = new StringBuilder(phraseWithoutSymbols).reverse().toString();

		return phraseWithoutSymbols.equalsIgnoreCase(reversedPhrase);
	}

	@Override
	public String toString() {
		return "BenjaminPalindromeAnalyzer";
	}

}
