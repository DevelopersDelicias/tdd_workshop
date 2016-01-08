package com.developersdelicias.parser;

import java.util.ArrayList;
import java.util.List;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author Benjamin Cisneros <benjamin.cisneros@softtek.com>
 */
@RunWith(JUnitParamsRunner.class)
public abstract class BooleanStringParserTest {

    protected BooleanStringParser parser;
    
    @Test
    @Parameters(method = "getTrueValues")
    public void testParseTrueValues(String string) {
        assertEquals(Boolean.TRUE, parser.parse(string));
        assertEquals(Boolean.TRUE, parser.parse("yes"));
        assertEquals(Boolean.TRUE, parser.parse("YES"));
        assertEquals(Boolean.TRUE, parser.parse("Yes"));
        assertEquals(Boolean.TRUE, parser.parse("y"));
        assertEquals(Boolean.TRUE, parser.parse("Y"));
        assertEquals(Boolean.TRUE, parser.parse("true"));
        assertEquals(Boolean.TRUE, parser.parse("TRUE"));
        assertEquals(Boolean.TRUE, parser.parse("True"));
        assertEquals(Boolean.TRUE, parser.parse("t"));
        assertEquals(Boolean.TRUE, parser.parse("T"));
        assertEquals(Boolean.TRUE, parser.parse("1"));
        assertEquals(Boolean.TRUE, parser.parse("2"));
        assertEquals(Boolean.TRUE, parser.parse("3"));
    }
    
    public List<String> getTrueValues() {
        List<String> list = new ArrayList<>();
        list.add("yes");
        list.add("YES");
        list.add("Yes");
        list.add("y");
        list.add("Y");
        list.add("true");
        list.add("TRUE");
        list.add("True");
        list.add("t");
        list.add("T");
        list.add("1");
        list.add("2");
        list.add("3");
        return list;
    }
    
    @Test
    @Parameters(method = "getFalseValues")
    public void testParseFalseValues(String string) {
        assertEquals(Boolean.FALSE, parser.parse(string));
    }
    
    public List<String> getFalseValues() {
        List<String> list = new ArrayList<>();
        list.add("no");
        list.add("NO");
        list.add("No");
        list.add("n");
        list.add("N");
        list.add("false");
        list.add("FALSE");
        list.add("False");
        list.add("f");
        list.add("F");
        list.add("0");
        list.add("-1");
        list.add("-2");
        return list;
    }
    
    @Test
    public void testParseNullValues() {
        assertNull(parser.parse("anything else"));
        assertNull(parser.parse(null));
    }
}
