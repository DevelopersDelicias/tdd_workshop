package com.developersdelicias.analyzer;

import com.developersdelicias.parser.BenjaminBooleanStringParser;
import com.developersdelicias.parser.BooleanStringParser;

/**
 * Description of the class BenjaminBooleanExpressionAnalyzer
 * @author Benjamin Cisneros <benjamin.cisneros@softtek.com>
 */
public class BenjaminBooleanExpressionAnalyzer implements BooleanExpressionAnalyzer {
    private final BooleanStringParser parser;

    BenjaminBooleanExpressionAnalyzer(BooleanStringParser booleanStringParser) {
        parser = booleanStringParser;
    }

    @Override
    public boolean analyze(String expression) throws MalformedBooleanExpression {
        return true;
    }

}
