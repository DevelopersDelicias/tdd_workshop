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
        switch (string) {
            case "yes":
                result = Boolean.TRUE;
                break;
            case "no":
                result = Boolean.FALSE;
                break;
        }
        return result;
    }

}
