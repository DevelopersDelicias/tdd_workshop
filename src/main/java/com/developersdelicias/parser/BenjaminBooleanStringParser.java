package com.developersdelicias.parser;

/**
 * Description of the class BenjaminBooleanStringParser
 *
 * @author Benjamin Cisneros <benjamin.cisneros@softtek.com>
 */
public class BenjaminBooleanStringParser implements BooleanStringParser {

    @Override
    public Boolean parse(String string) {
        Boolean result = null;

        if (string == null) {
            return null;
        }

        switch (string) {
            case "yes":
            case "y":
            case "true":
            case "t":
            case "1":
                result = Boolean.TRUE;
                break;
            case "no":
            case "n":
            case "false":
            case "f":
            case "0":
                result = Boolean.FALSE;
                break;
        }
        return result;
    }

}
