package com.developersdelicias.analyzer;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Description of the class PalindromeAnalyzerTest
 * @author Benjamin Cisneros
 */
public class PalindromeAnalyzerTest {
    
    @Test
    public void testAnalyze() {
        PalindromeAnalyzer analyzer = new PalindromeAnalyzer();
        assertTrue(analyzer.analyze("A man, a plan, a canal, Panama!"));
        assertTrue(analyzer.analyze("Amor, Roma"));
        assertTrue(analyzer.analyze("Stack cats"));
        assertTrue(analyzer.analyze("Step on no pets"));
        assertTrue(analyzer.analyze("taco cat"));
        assertTrue(analyzer.analyze("Put it up"));
        assertTrue(analyzer.analyze("Anita lava la tina"));
        assertTrue(analyzer.analyze("Was it a car or a cat I saw?"));
        assertTrue(analyzer.analyze("No 'x' in Nixon"));
        assertFalse(analyzer.analyze("This string is not a palyndrome"));
        assertFalse(analyzer.analyze("Hello World"));
        assertFalse(analyzer.analyze("Anything else and more"));
    }
}
