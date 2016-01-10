package com.developersdelicias.util.string;

import org.apache.log4j.Logger;

/**
 * Description of the class PalindromeComplexityCalculatorImpl
 *
 * @author Benjamin Cisneros <benjamin.cisneros@softtek.com>
 */
public class PalindromeComplexityCalculatorImpl implements PalindromeComplexityCalculator {

    private static final Logger logger = Logger.getLogger(PalindromeComplexityCalculatorImpl.class);

    @Override
    public PalindromeComplexity calculate(String palindrome) throws NotValidPalindromeException {
        PalindromeAnalyzer analyzer = new PalindromeAnalyzerImpl();

        if (!analyzer.isPalindrome(palindrome)) {
            throw new NotValidPalindromeException(
                    String.format("\"%s\" is not a palindrome. "
                            + "Complexity cannot be calculated.", palindrome));
        }
        try {
            Long value = Long.parseLong(palindrome);
            String stringValue = value.toString();

            if (stringValue.length() <= 5) {
                return PalindromeComplexity.LOW;
            } else if (stringValue.length() <= 10) {
                return PalindromeComplexity.MEDIUM;
            } else {
                return PalindromeComplexity.HIGH;
            }
        } catch (NumberFormatException nfe) {
            logger.info("Skipping this error: " + nfe);
        }

        final int wordCount = palindrome.split(" ").length;
        if (wordCount <= 3) {
            return PalindromeComplexity.LOW;
        } else if (wordCount <= 6) {
            return PalindromeComplexity.MEDIUM;
        }
        return PalindromeComplexity.HIGH;

    }

}
