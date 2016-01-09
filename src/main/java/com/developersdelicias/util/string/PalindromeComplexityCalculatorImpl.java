package com.developersdelicias.util.string;

/**
 * Description of the class PalindromeComplexityCalculatorImpl
 *
 * @author Benjamin Cisneros <benjamin.cisneros@softtek.com>
 */
public class PalindromeComplexityCalculatorImpl implements PalindromeComplexityCalculator {

    @Override
    public PalindromeComplexity calculate(String palindrome) throws NotValidPalindromeException {
        if (palindrome.split(" ").length <= 3) {
            return PalindromeComplexity.LOW;
        } else {
            return PalindromeComplexity.MEDIUM;
        }

    }

}
