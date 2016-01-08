
package com.developersdelicias.analyzer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Benjamin Cisneros <benjamin.cisneros@softtek.com>
 */
public abstract class BooleanExpressionAnalyzerTest {
    
    protected BooleanExpressionAnalyzer analyzer;

    @Test
    public void testAnalyzeTrueExpressions() throws Exception {
        assertTrue(analyzer.analyze("true and true"));
        assertTrue(analyzer.analyze("yes and yes"));
        assertTrue(analyzer.analyze("true and yes"));
        assertTrue(analyzer.analyze("yes and true"));
    }
    
    @Test
    public void testAnalyzeFalseExpressions() throws Exception {
        assertFalse(analyzer.analyze("true and false"));
        assertFalse(analyzer.analyze("yes and no"));
        assertFalse(analyzer.analyze("true and no"));
        assertFalse(analyzer.analyze("no and true"));
    }
    
}
