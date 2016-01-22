package com.developersdelicias.palindrome.util;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public abstract class PalindromeComplexityCalculatorTest {

	protected PalindromeComplexityCalculator calculator;

	@Test
	@Parameters({ "oso", "taco cat", "Borrow or rob?", "1"})
	public void palindromesWithThreeOrLessWordsShouldReturnLowComplexity(String palindrome) {
		assertSame(PalindromeComplexity.LOW, calculator.calculate(palindrome));
	}

	@Test
	@Parameters({ "Anita lava la tina", "Campus motto: Bottoms up Mac.", "Marge lets Norah see Sharon’s telegram." })
	public void palindromeWithSixFiveOrFourWordsShouldReturnMediumComplexity(String palindrome) throws Exception {
		assertSame(PalindromeComplexity.MEDIUM, calculator.calculate(palindrome));
	}

	@Test
	@Parameters(method="getHighComplexityPalindromes")
	public void withSevenOrMoreWordsPalindromeShouldReturnHighComplexity(String palindrome) throws Exception {
		assertSame(PalindromeComplexity.HIGH, calculator.calculate(palindrome));
	}

	@Test(expected = InvalidPalindromeException.class)
	@Parameters(method="getInvalidPalindromes")
	public void withInvalidPalindromeShouldThrowInvalidPalindromeException(String palindrome) throws Exception {
		calculator.calculate(palindrome);
	}
	
	public static List<String> getHighComplexityPalindromes() {
		List<String> list = new ArrayList<>();
		list.add("A man, a plan, a canal, Panama!");
		list.add("A Toyota! Race fast, safe car! A Toyota!");
		list.add("A new order began, a more Roman age bred Rowena.");
		list.add("Are we not pure? “No sir!” Panama’s moody Noriega brags. “It is garbage!” Irony dooms a man; a prisoner up to new era.");
		return list;	
	}
	
	public static List<String> getInvalidPalindromes() {
		List<String> list = new ArrayList<>();
		list.add("");
		list.add(null);
		list.add("not a palindrome");
		list.add("!#$%&()=?+´*12345678980");
		return list;	
	}

}
