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
                result = Boolean.TRUE;
                break;
            case "no":
            case "n":
            case "false":
            case "f":
                result = Boolean.FALSE;
                break;
            default:
                try {
                    Integer value = Integer.parseInt(string);
                    result = value >= 1;
                } catch (NumberFormatException numberFormatException) {
                }
                
        }
        return result;
    }

}
