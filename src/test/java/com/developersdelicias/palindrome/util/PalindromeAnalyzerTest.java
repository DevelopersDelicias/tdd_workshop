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
	
	@Test
	public void withCommaShouldReturnTrue() throws Exception {
		assertTrue(analyzer.isPalindrome("Amor, Roma"));
	}
	
	@Test
	public void withQuestionsShouldReturnTrue() throws Exception {
		assertTrue(analyzer.isPalindrome("Was it a car or a cat I saw?"));
	}
	
	@Test
	public void withApostrophesShouldReturnTrue() throws Exception {
		assertTrue(analyzer.isPalindrome("No 'x' in Nixon"));
	}
	
	@Test
	public void withPuntoYDosPuntosShouldReturnTrue() throws Exception {
		assertTrue(analyzer.isPalindrome("Campus motto: Bottoms up Mac."));
	}

}
