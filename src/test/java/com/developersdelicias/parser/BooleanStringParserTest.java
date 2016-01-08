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
        assertEquals(Boolean.TRUE, parser.parse("y"));
        assertEquals(Boolean.TRUE, parser.parse("true"));
        assertEquals(Boolean.TRUE, parser.parse("t"));
        assertEquals(Boolean.TRUE, parser.parse("1"));
    }
    
    @Test
    public void testParseFalseValues() {
        assertEquals(Boolean.FALSE, parser.parse("no"));
        assertEquals(Boolean.FALSE, parser.parse("n"));
        assertEquals(Boolean.FALSE, parser.parse("false"));
        assertEquals(Boolean.FALSE, parser.parse("f"));
        assertEquals(Boolean.FALSE, parser.parse("0"));
    }
    
    @Test
    public void testParseNullValues() {
        assertNull(parser.parse("anything else"));
        assertNull(parser.parse(null));
    }
}
