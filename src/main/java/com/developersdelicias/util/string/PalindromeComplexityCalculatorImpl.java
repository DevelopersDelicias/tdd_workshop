package com.developersdelicias.util.string;

/**
 * Description of the class PalindromeComplexityCalculatorImpl
 *
 * @author Benjamin Cisneros <benjamin.cisneros@softtek.com>
 */
public class PalindromeComplexityCalculatorImpl implements PalindromeComplexityCalculator {

    @Override
    public PalindromeComplexity calculate(String palindrome) throws NotValidPalindromeException {
        final int wordCount = palindrome.split(" ").length;
        if (wordCount <= 3) {
            return PalindromeComplexity.LOW;
        } else if (wordCount <= 6) {
            return PalindromeComplexity.MEDIUM;
        }
        return PalindromeComplexity.HIGH;

    }

}
