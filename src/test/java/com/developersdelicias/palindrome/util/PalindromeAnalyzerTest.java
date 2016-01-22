package com.developersdelicias.palindrome.util;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public abstract class PalindromeAnalyzerTest {

	protected PalindromeAnalyzer analyzer;

	@Test
	@Parameters(source=TestPalindromeProvider.class, method="validPalindromes")
	public void withValidPalindromeShouldReturnTrue(String palindrome) throws Exception {
			assertTrue(palindrome + " should be a palindrome.", analyzer.isPalindrome(palindrome));
	}
	
	@Test
	@Parameters(source=TestPalindromeProvider.class, method="invalidPalindromes")
	public void withInvalidPalindromeShouldReturnFalse(String palindrome) throws Exception {
			assertFalse(palindrome + " should not be a palindrome.", analyzer.isPalindrome(palindrome));
	}
	
}
