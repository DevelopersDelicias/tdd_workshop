package com.developersdelicias.util.string;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 * Class to test a PalindromeAnalyzer implementation
 *
 * @author Benjamin Cisneros <cisnerosbarraza@gmail.com>
 */
public class PalindromeAnalyzerTest {

    PalindromeAnalyzer instance;

    @Before
    public void setUp() {
        instance = new PalindromeAnalyzerImpl();
    }

    @Test
    public void isPalindromeWithSinglePalindromeMustReturnTrue() {
        assertTrue(instance.isPalindrome("taco cat"));
    }

    @Test
    public void isPalindromeWithNoPalindromePhraseMustReturnFalse() {
        assertFalse(instance.isPalindrome("it is not a palindrome"));
    }
}
