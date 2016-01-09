package com.developersdelicias.util.string;

import org.apache.log4j.Logger;

/**
 * Implementation class for PalindromeAnalyzer
 *
 * @author Benjamin Cisneros <benjamin.cisneros@softtek.com>
 */
public class PalindromeAnalyzerImpl implements PalindromeAnalyzer {

    private static final Logger logger = Logger.getLogger(PalindromeAnalyzerImpl.class);

    @Override
    public boolean isPalindrome(String phrase) {
        logger.debug("Phrase is: " + phrase);
        String phraseWithoutSpaces = phrase.replaceAll(" ", "").toLowerCase()
                .replaceAll("!", "").replaceAll(",", "").replaceAll("[?]", "")
                .replaceAll("'", "");
        logger.debug("Removing spaces: " + phraseWithoutSpaces);
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

}
