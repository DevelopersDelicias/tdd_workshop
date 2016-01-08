package com.developersdelicias.analyzer;

import java.util.ArrayList;
import java.util.List;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Description of the class PalindromeAnalyzerTest
 * @author Benjamin Cisneros
 */
@RunWith(JUnitParamsRunner.class)
public class PalindromeAnalyzerTest {
    private final PalindromeAnalyzer analyzer = new PalindromeAnalyzer();
    
    @Test
    @Parameters(method = "getRealPalindromes")
    public void testAnalyzeRealPalindromes(String phrase) {
        assertTrue(analyzer.analyze(phrase));
        
    }
    
    @Test 
    public void testAnalyzeNotRealPalindromes() {
        assertFalse(analyzer.analyze("This string is not a palyndrome"));
        assertFalse(analyzer.analyze("Hello World"));
        assertFalse(analyzer.analyze("Anything else and more"));
        assertFalse(analyzer.analyze(null));
        assertFalse(analyzer.analyze(""));
        assertFalse(analyzer.analyze("          "));
        assertFalse(analyzer.analyze("!#$%&()=?¡¿"));
        assertFalse(analyzer.analyze("1234567890"));
    }
    
    public static List<String> getRealPalindromes() {
        List<String> realPalindromes = new ArrayList<>();
        realPalindromes.add("A man, a plan, a canal, Panama!");
        realPalindromes.add("Amor, Roma");
        realPalindromes.add("Race car");
        realPalindromes.add("Stack cats");
        realPalindromes.add("Step on no pets");
        realPalindromes.add("taco cat");
        realPalindromes.add("Put it up");
        realPalindromes.add("Anita lava la tina");
        realPalindromes.add("Was it a car or a cat I saw?");
        realPalindromes.add("No 'x' in Nixon");
        realPalindromes.add("123321");

        return realPalindromes;
    }
}
