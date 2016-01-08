package com.developersdelicias.analyzer;

import com.developersdelicias.parser.BooleanStringParser;

/**
 *
 * @author Benjamin Cisneros <benjamin.cisneros@softtek.com>
 */
public interface BooleanExpressionAnalyzer {
    public boolean analyze(String expression) throws MalformedBooleanExpression;
}
