package com.developersdelicias.util.string;

/**
 * Description of the class PalindromeComplexityCalculatorImpl
 *
 * @author Benjamin Cisneros <benjamin.cisneros@softtek.com>
 */
public class PalindromeComplexityCalculatorImpl implements PalindromeComplexityCalculator {

    @Override
    public PalindromeComplexity calculate(String palindrome) throws NotValidPalindromeException {
        return PalindromeComplexity.LOW;
    }

}
