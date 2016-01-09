package com.developersdelicias.util.string;

import static org.junit.Assert.assertEquals;
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
        instance = new PalindromeComplexityCalculatorImpl();
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
}
