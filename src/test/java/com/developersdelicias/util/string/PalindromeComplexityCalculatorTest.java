package com.developersdelicias.util.string;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for PalindromeComplexityCalculator
 * @author Benjamin Cisneros <benjamin.cisneros@softtek.com>
 */
public class PalindromeComplexityCalculatorTest {
    
    PalindromeComplexityCalculator instance;
    
    @Before
    public void setUp() {
        instance = new PalindromeComplexityCalculatorImpl(new PalindromeAnalyzerImpl());
    }
    
    @Test 
    public void calculateWithOneWordPalindromeMustReturnLowComplexity() {
        assertEquals(PalindromeComplexity.LOW, instance.calculate("oso"));
    }
    
    @Test 
    public void calculateWithTwoWordsPalindromeMustReturnLowComplexity() {
        assertEquals(PalindromeComplexity.LOW, instance.calculate("taco cat"));
    }
    
    @Test 
    public void calculateWithThreeWordsPalindromeMustReturnLowComplexity() {
        assertEquals(PalindromeComplexity.LOW, instance.calculate("Borrow or rob?"));
    }
    
    @Test 
    public void calculateWithFourWordsPalindromeMustReturnMediumComplexity() {
        assertEquals(PalindromeComplexity.MEDIUM, instance.calculate("No 'x' in Nixon"));
    }
    
    @Test 
    public void calculateWithFiveWordsPalindromeMustReturnMediumComplexity() {
        assertEquals(PalindromeComplexity.MEDIUM, instance.calculate("Campus motto: Bottoms up Mac."));
    }
    
    @Test 
    public void calculateWithSixWordsPalindromeMustReturnMediumComplexity() {
        assertEquals(PalindromeComplexity.MEDIUM, instance.calculate("Marge lets Norah see Sharon’s telegram."));
    }
    
    @Test 
    public void calculateWithSevenWordsPalindromeMustReturnMediumComplexity() {
        assertEquals(PalindromeComplexity.HIGH, instance.calculate("Depardieu, go razz a rogue I draped."));
    }
    
    @Test 
    public void calculateWithMoreThanSevenWordsPalindromeMustReturnMediumComplexity() {
        assertEquals(PalindromeComplexity.HIGH, instance.calculate("A Toyota! Race fast, safe car! A Toyota!"));
        assertEquals(PalindromeComplexity.HIGH, instance.calculate("A new order began, a more Roman age bred Rowena."));
        assertEquals(PalindromeComplexity.HIGH, instance.calculate("Degas, are we not drawn onward, no? In union, drawn onward to new eras aged?"));
        assertEquals(PalindromeComplexity.HIGH, instance.calculate("Are we not pure? “No sir!” Panama’s moody Noriega brags. “It is garbage!” Irony dooms a man; a prisoner up to new era."));
    }
    
    @Test
    public void calculateWithOneDigitNumberPalindromeMustReturnLowComplexity() {
        assertEquals(PalindromeComplexity.LOW, instance.calculate("1"));
    }
    
    @Test
    public void calculateWithTwoDigitsNumberPalindromeMustReturnLowComplexity() {
        assertEquals(PalindromeComplexity.LOW, instance.calculate("44"));
    }
    
    @Test
    public void calculateWithThreeDigitsNumberPalindromeMustReturnLowComplexity() {
        assertEquals(PalindromeComplexity.LOW, instance.calculate("121"));
    }
    
    @Test
    public void calculateWithFourDigitsNumberPalindromeMustReturnLowComplexity() {
        assertEquals(PalindromeComplexity.LOW, instance.calculate("1221"));
    }
    
    @Test
    public void calculateWithFiveDigitsNumberPalindromeMustReturnLowComplexity() {
        assertEquals(PalindromeComplexity.LOW, instance.calculate("12321"));
    }
    
    @Test
    public void calculateWithSixDigitsNumberPalindromeMustReturnMediumComplexity() {
        assertEquals(PalindromeComplexity.MEDIUM, instance.calculate("123321"));
    }
    
    @Test
    public void calculateWithSevenDigitsNumberPalindromeMustReturnMediumComplexity() {
        assertEquals(PalindromeComplexity.MEDIUM, instance.calculate("1234321"));
    }
    
    @Test
    public void calculateWithEightDigitsNumberPalindromeMustReturnMediumComplexity() {
        assertEquals(PalindromeComplexity.MEDIUM, instance.calculate("12344321"));
    }
    
    @Test
    public void calculateWithNineDigitsNumberPalindromeMustReturnMediumComplexity() {
        assertEquals(PalindromeComplexity.MEDIUM, instance.calculate("123454321"));
    }
    
    @Test
    public void calculateWithTenDigitsNumberPalindromeMustReturnMediumComplexity() {
        assertEquals(PalindromeComplexity.MEDIUM, instance.calculate("1234554321"));
    }
    
    @Test
    public void calculateWithElevenOrMoreDigitsNumberPalindromeMustReturnHighComplexity() {
        assertEquals(PalindromeComplexity.HIGH, instance.calculate("12345654321"));
        assertEquals(PalindromeComplexity.HIGH, instance.calculate("1234567890987654321"));
    }
    
    @Test
    public void calculateWithNotAPalindromeMustThrowNotValidPalindromeException() {
        try {
            instance.calculate("not a palindrome");
            fail("It must throw an exception");
        } catch (NotValidPalindromeException notValidPalindromeException) {
        }
    }
}
