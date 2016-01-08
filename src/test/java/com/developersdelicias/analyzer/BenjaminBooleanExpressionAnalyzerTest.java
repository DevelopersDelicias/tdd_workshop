
package com.developersdelicias.analyzer;

import com.developersdelicias.parser.BenjaminBooleanStringParser;

/**
 *
 * @author Benjamin Cisneros <benjamin.cisneros@softtek.com>
 */
public class BenjaminBooleanExpressionAnalyzerTest extends BooleanExpressionAnalyzerTest {
    
    public BenjaminBooleanExpressionAnalyzerTest() {
        analyzer = new BenjaminBooleanExpressionAnalyzer(new BenjaminBooleanStringParser());
    }    
}
