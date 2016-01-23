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
	
	@Test
	public void withApostrophe2ShouldReturnTrue() throws Exception {
		assertTrue(analyzer.isPalindrome("Marge lets Norah see Sharon’s telegram."));
	}
	
	@Test
	public void withExclamationSignShouldReturnTrue() throws Exception {
		assertTrue(analyzer.isPalindrome("A man, a plan, a canal, Panama!"));
	}
	
	@Test
	public void withAnySignShouldReturnTrue() throws Exception {
		assertTrue(analyzer.isPalindrome("Are we not pure? “No sir!” Panama’s moody Noriega brags. “It is garbage!” Irony dooms a man; a prisoner up to new era."));
	}
	
	@Test
	public void withNullShouldReturnFalse() throws Exception {
		assertFalse(analyzer.isPalindrome(null));
	}
	
	@Test
	public void withEmptyStringShouldReturnFalse() throws Exception {
		assertFalse(analyzer.isPalindrome(""));
	}
	
	@Test
	public void withOnlySimbolsStringShouldReturnFalse() throws Exception {
		assertFalse(analyzer.isPalindrome("!&=087%#"));
	}

}
