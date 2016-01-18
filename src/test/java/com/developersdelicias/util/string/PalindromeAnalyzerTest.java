package com.developersdelicias.util.string;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Class to test a PalindromeAnalyzer implementation
 *
 * @author Benjamin Cisneros <cisnerosbarraza@gmail.com>
 */
@RunWith(JUnitParamsRunner.class)
public class PalindromeAnalyzerTest {

	PalindromeAnalyzer instance;

	@Before
	public void setUp() {
		instance = new PalindromeAnalyzerImpl();
	}

	@Test
	@Parameters(source = PalindromeTestResourcesUtil.class, method = "getRealPalindromes")
	public void isPalindromeWithRealPalindromeMustReturnTrue(PalindromeTestResource testCase) {
		assertTrue(testCase.getTestDescription() + " must return true.", instance.isPalindrome(testCase.getPhrase()));
	}

	@Test
	@Parameters(source = PalindromeTestResourcesUtil.class, method = "getInvalidPalindromes")
	public void isPalindromeWithInvalidPalindromeMustReturnFalse(PalindromeTestResource testCase) {
		assertFalse(testCase.getTestDescription() + " must return false.", instance.isPalindrome(testCase.getPhrase()));
	}
}
