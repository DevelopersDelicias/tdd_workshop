package com.developersdelicias.palindrome.util;

import static org.junit.Assert.*;

import org.junit.Test;

public abstract class PalindromeAnalyzerTest {
	
	protected PalindromeAnalyzer analyzer;

	@Test
	public void withSinglePalindromeShouldReturnTrue() {
		assertTrue(analyzer.isPalindrome("oso"));
	}
	
	@Test
	public void withNotRealPalindromeShouldReturnFalse() {
		assertFalse(analyzer.isPalindrome("osos"));
	}
	
	@Test
	public void withPalindromeThatHaveSpacesShouldReturnTrue() throws Exception {
		assertTrue(analyzer.isPalindrome("taco cat"));
	}
	
	@Test
	public void withPalindromeThatHaveUpperAndLowerCasesShouldReturnTrue() throws Exception {
		assertTrue(analyzer.isPalindrome("Race car"));
	}

}
