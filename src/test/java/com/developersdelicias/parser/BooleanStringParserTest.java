package com.developersdelicias.parser;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Benjamin Cisneros <benjamin.cisneros@softtek.com>
 */
public abstract class BooleanStringParserTest {

    protected BooleanStringParser parser;
    
    @Test
    public void testParseTrueValues() {
        assertEquals(Boolean.TRUE, parser.parse("yes"));
    }
    
    @Test
    public void testParseFalseValues() {
        assertEquals(Boolean.FALSE, parser.parse("no"));
    }
    
    @Test
    public void testParseNullValues() {
        assertNull(parser.parse("anything else"));
    }
}
