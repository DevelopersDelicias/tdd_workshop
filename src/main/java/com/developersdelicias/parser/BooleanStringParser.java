package com.developersdelicias.parser;

/**
 *
 * @author Benjamin Cisneros <benjamin.cisneros@softtek.com>
 */
public interface BooleanStringParser {

    /**
     * Check the value of a string and determines its boolean value
     * @param string The {@code String} object to be parsed
     * @return Boolean.TRUE if the string is yes, y, true, t, or a number greater or equals to 1
     *         Boolean.FALSE if the string is no, n, false, f or a number less than 1
     *         null in otherwise including null value
     */
    public Boolean parse(String string);
}
