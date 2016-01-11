package com.developersdelicias.util.string;

import org.apache.log4j.Logger;

/**
 * Implementation class for PalindromeAnalyzer
 *
 * @author Benjamin Cisneros <benjamin.cisneros@softtek.com>
 */
public class PalindromeAnalyzerImpl implements PalindromeAnalyzer {

    private static final Logger logger = Logger.getLogger(PalindromeAnalyzerImpl.class);

    private final SpanishTransliterator transliterator = new SpanishTransliterator();

    @Override
    public boolean isPalindrome(String phrase) {
        if (phrase == null) {
            return false;
        }

        String normalizedPalindrome = normalize(phrase);

        if (normalizedPalindrome.isEmpty()) {
            return false;
        }
        return normalizedPalindrome.equalsIgnoreCase(
                new StringBuilder(normalizedPalindrome).reverse().toString());
    }

    protected String normalize(String phrase) {
        return transliterator.transliterate(
                phrase.replaceAll("[^\\p{L}\\p{Nd}]+", ""));
    }

}
