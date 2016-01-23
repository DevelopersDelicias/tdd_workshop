package com.developersdelicias.palindrome.util;

import org.apache.log4j.Logger;

public class BenjaminPalindromeAnalyzer implements PalindromeAnalyzer {

	Logger logger = Logger.getLogger(BenjaminPalindromeAnalyzer.class);

	@Override
	public boolean isPalindrome(String phrase) {
		logger.debug("Phrase: " + phrase);
		String phraseWithoutSymbols = phrase.replaceAll("[^a-zA-Z]", "");
		logger.debug("No symbols: " + phraseWithoutSymbols);
		String reversed = new StringBuilder(phraseWithoutSymbols).reverse().toString();
		logger.debug("Reversed: " + reversed);
		return phraseWithoutSymbols.equalsIgnoreCase(reversed);
	}

}
