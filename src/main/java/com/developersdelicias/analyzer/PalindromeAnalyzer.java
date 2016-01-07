package com.developersdelicias.analyzer;



/**
 * Description of the class PalindromeAnalyzer
 * @author Benjamin Cisneros <benjamin.cisneros@softtek.com>
 */
public class PalindromeAnalyzer {
    public boolean analyze(String phrase) {
        String tempPhrase = phrase.replaceAll("[\\s\\W]", "");
        String reversedPhrase = new StringBuilder(tempPhrase).reverse().toString();
        return tempPhrase.equalsIgnoreCase(reversedPhrase);
    }
}
