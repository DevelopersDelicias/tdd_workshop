package com.developersdelicias.palindrome.util;

import org.apache.log4j.Logger;

public class BenjaminPalindromeAnalyzer implements PalindromeAnalyzer {
	
	Logger logger = Logger.getLogger(BenjaminPalindromeAnalyzer.class); 
	
	@Override
	public boolean isPalindrome(String phrase) {
		logger.debug("Phrase: "+ phrase);
		String phraseWithoutSpaces = phrase.replaceAll(" ", "")
				.replaceAll("[?]", "")
				.replaceAll("'", "")
				.replaceAll(":", "")
				.replaceAll("[.]", "");
		logger.debug("No spaces: "+phraseWithoutSpaces);
		String reversed = new StringBuilder(phraseWithoutSpaces).reverse().toString();
		logger.debug("Reversed: "+reversed);
		return phraseWithoutSpaces.equalsIgnoreCase(reversed);
	}

}
