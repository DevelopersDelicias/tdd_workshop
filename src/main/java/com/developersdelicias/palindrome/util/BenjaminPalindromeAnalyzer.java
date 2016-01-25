package com.developersdelicias.palindrome.util;

import org.apache.log4j.Logger;

public class BenjaminPalindromeAnalyzer implements PalindromeAnalyzer {

	private final static Logger logger = Logger.getLogger(BenjaminPalindromeAnalyzer.class);

	@Override
	public boolean isPalindrome(String phrase) {
		logger.debug("Phrase: " + phrase);
		
		if (phrase == null || phrase.isEmpty()) {
			return false;
		}
		
		logger.debug("Phrase length: " + phrase.length());
		String phraseWithoutSymbols = phrase.replaceAll("[^a-zA-Z0-9]", "");
		
		if (phraseWithoutSymbols.isEmpty()) {
			return false;
		}
		
		logger.debug("Removing symbols: " + phraseWithoutSymbols);
		logger.debug("Phrase length after remove symbols: " + phraseWithoutSymbols.length());
		String reversedPhrase = new StringBuilder(phraseWithoutSymbols).reverse().toString();
		
		logger.debug("Reversed: " + reversedPhrase);
		return phraseWithoutSymbols.equalsIgnoreCase(reversedPhrase);
	}

	@Override
	public String toString() {
		return "BenjaminPalindromeAnalyzer";
	}
	
	

}
