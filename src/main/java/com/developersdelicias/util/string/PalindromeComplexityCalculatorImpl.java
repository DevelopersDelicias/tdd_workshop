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
        
        try {
            Integer value = Integer.parseInt(palindrome);
            String stringValue = value.toString();
            
            if (stringValue.length() <= 5) {
                return PalindromeComplexity.LOW;
            } else {
                return PalindromeComplexity.MEDIUM;
            }
        } catch (NumberFormatException nfe){
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
