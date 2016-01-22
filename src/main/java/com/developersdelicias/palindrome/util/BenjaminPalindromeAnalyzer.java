package com.developersdelicias.palindrome.util;

import org.apache.log4j.Logger;

public class BenjaminPalindromeAnalyzer implements PalindromeAnalyzer {

	private final static Logger logger = Logger.getLogger(BenjaminPalindromeAnalyzer.class);

	@Override
	public boolean isPalindrome(String phrase) {
		logger.debug("Phrase: " + phrase);
		String phraseWithoutSpaces = phrase.replaceAll(" ", "").replaceAll("[?]", "").replaceAll("'", "")
				.replaceAll(":", "").replaceAll("[.]", "").replaceAll("’", "");
		logger.debug("Removing symbols: " + phraseWithoutSpaces);
		String reversedPhrase = new StringBuilder(phraseWithoutSpaces).reverse().toString();
		
		logger.debug("Reversed: " + reversedPhrase);
		return phraseWithoutSpaces.equalsIgnoreCase(reversedPhrase);
	}

}
