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
        
        if (phrase == null) {
            return false;
        }
        
        String phraseWithoutSpaces = phrase.replaceAll("[^\\p{L}\\p{Nd}]+", "").toLowerCase();
        phraseWithoutSpaces = new SpanishTransliterator().transliterate(phraseWithoutSpaces);
        logger.debug("Removing spaces: " + phraseWithoutSpaces);
        
        if (phraseWithoutSpaces.isEmpty()) {
            return false;
        }
        return phraseWithoutSpaces.equals(new StringBuilder(phraseWithoutSpaces).reverse().toString());
    }

}
