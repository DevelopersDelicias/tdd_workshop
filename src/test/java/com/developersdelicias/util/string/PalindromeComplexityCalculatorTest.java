package com.developersdelicias.util.string;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

/**
 * Test class for PalindromeComplexityCalculator
 *
 * @author Benjamin Cisneros <benjamin.cisneros@softtek.com>
 */
@RunWith(JUnitParamsRunner.class)
public class PalindromeComplexityCalculatorTest {

	PalindromeComplexityCalculator instance;

	@Before
	public void setUp() {
		PalindromeAnalyzer mockAnalyzer = Mockito.mock(PalindromeAnalyzer.class);
		PalindromeTestResourcesUtil.getRealPalindromes().stream().forEach((resource) -> {
			Mockito.when(mockAnalyzer.isPalindrome(resource.getPhrase())).thenReturn(Boolean.TRUE);
		});

		PalindromeTestResourcesUtil.getInvalidPalindromes().stream().forEach((resource) -> {
			Mockito.when(mockAnalyzer.isPalindrome(resource.getPhrase())).thenReturn(Boolean.FALSE);
		});
		instance = new PalindromeComplexityCalculatorImpl(mockAnalyzer);
	}

	@Test
	@Parameters(source = PalindromeTestResourcesUtil.class, method = "getLowComplexityPalindromes")
	public void calculateWithOneToThreeWordsOrOneToFiveDigitsNumberPalindromesMustReturnLowComplexity(
			PalindromeTestResource testCase) {
		assertEquals(testCase.getTestDescription() + " must return low complexity.", PalindromeComplexity.LOW,
				instance.calculate(testCase.getPhrase()));
	}

	@Test
	@Parameters(source = PalindromeTestResourcesUtil.class, method = "getMediumComplexityPalindromes")
	public void calculateWithFourToSixWordsOrSixToTenDigitsNumberPalindromesMustReturnMediumComplexity(
			PalindromeTestResource testCase) {
		assertEquals(testCase.getTestDescription() + " must return medium complexity.", PalindromeComplexity.MEDIUM,
				instance.calculate(testCase.getPhrase()));
	}

	@Test
	@Parameters(source = PalindromeTestResourcesUtil.class, method = "getHighComplexityPalindromes")
	public void calculateWithSevenOrMoreWordsPalindromeMustReturnHighComplexity(PalindromeTestResource testCase) {
		assertEquals(testCase.getTestDescription() + " must return high complexity.", PalindromeComplexity.HIGH,
				instance.calculate(testCase.getPhrase()));
	}

	@Test(expected = NotValidPalindromeException.class)
	@Parameters(source = PalindromeTestResourcesUtil.class, method = "getInvalidPalindromes")
	public void calculateWithNotAPalindromeMustThrowNotValidPalindromeException(PalindromeTestResource testCase) {
		instance.calculate(testCase.getPhrase());
	}
}
