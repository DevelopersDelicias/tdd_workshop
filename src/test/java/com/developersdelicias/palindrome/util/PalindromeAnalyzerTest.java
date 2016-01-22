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

	@Test
	public void withPalindromeThatHaveCommaShouldReturnTrue() throws Exception {
		assertTrue(analyzer.isPalindrome("Amor, Roma"));
	}

	@Test
	public void withPalindromeThatIsAQuestionShouldReturnTrue() throws Exception {
		assertTrue(analyzer.isPalindrome("Was it a car or a cat I saw?"));
	}

	@Test
	public void withPalindromeThatHaveAposthrophesShouldReturnTrue() throws Exception {
		assertTrue(analyzer.isPalindrome("No 'x' in Nixon"));
	}
	
	@Test
	public void withPalindromeThatHaveColonAndPeriodShouldReturnTrue() throws Exception {
		assertTrue(analyzer.isPalindrome("Campus motto: Bottoms up Mac."));
	}
}
