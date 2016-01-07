package com.developersdelicias.analyzer;

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
    }
}
