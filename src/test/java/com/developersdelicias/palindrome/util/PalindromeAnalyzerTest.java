package com.developersdelicias.palindrome.util;

import static org.junit.Assert.*;

import org.junit.Test;

import com.developersdelicias.palindrome.util.PalindromeAnalyzer;

public abstract class PalindromeAnalyzerTest {

	protected PalindromeAnalyzer analyzer;

	@Test
	public void withSinglePalindromeShouldReturnTrue() {
		assertTrue(analyzer.isPalindrome("oso"));
	}
	
	@Test
	public void withNoPalindromeShouldReturnFalse() throws Exception {
		assertFalse(analyzer.isPalindrome("osos"));
	}
	
	@Test
	public void withSpacesShouldReturnTrue() throws Exception {
		assertTrue(analyzer.isPalindrome("taco cat"));
	}
	
	@Test
	public void withUpperCaseShouldReturnTrue() throws Exception {
		assertTrue(analyzer.isPalindrome("Race car"));
	}
	

}
