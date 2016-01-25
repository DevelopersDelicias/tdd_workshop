package com.developersdelicias.palindrome.util;

import org.apache.log4j.Logger;

public class AnotherPalindromeAnalyzer implements PalindromeAnalyzer {
	private static final Logger logger = Logger.getLogger(AnotherPalindromeAnalyzer.class);

	@Override
	public boolean isPalindrome(String phrase) {
		logger.debug("Phrase is: " + phrase);

		if (phrase == null) {
			return false;
		}

		String phraseWithoutSpaces = phrase.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		logger.debug("Removing spaces: " + phraseWithoutSpaces);

		if (phraseWithoutSpaces.isEmpty()) {
			return false;
		}
		final int lengthWithoutSpaces = phraseWithoutSpaces.length();
		String firstHalfPhrase = phraseWithoutSpaces.substring(0, lengthWithoutSpaces / 2);
		String secondHalfPhrase = phraseWithoutSpaces.substring(lengthWithoutSpaces / 2);

		boolean equals = true;
		for (int i = 0; i < firstHalfPhrase.length(); i++) {
			final char firstLetter = firstHalfPhrase.charAt(i);
			final char lastLetter = secondHalfPhrase.charAt(secondHalfPhrase.length() - i - 1);

			logger.debug("First Letter:" + firstLetter);
			logger.debug("Last Letter:" + lastLetter);
			if (firstLetter != lastLetter) {
				equals = false;
				logger.debug("Letters are not equal");
				break;
			}
		}
		return equals;
	}

	@Override
	public String toString() {
		return "AnotherPalindromeAnalyzer";
	}

}
