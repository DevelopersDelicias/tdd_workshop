package com.developersdelicias.util.string;

import org.junit.Test;

/**
 * Class to test a PalindromeAnalyzer implementation
 * @author Benjamin Cisneros <cisnerosbarraza@gmail.com>
 */
public class PalindromeAnalyzerTest {
    PalindromeAnalyzer instance;
    @Test
    public void isPalindromeWithSinglePalindromeMustReturnTrue() {
        assertTrue(instance.isPalindrome("taco cat"));
    }
}
