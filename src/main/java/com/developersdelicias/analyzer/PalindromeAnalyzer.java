package com.developersdelicias.analyzer;



/**
 * Description of the class PalindromeAnalyzer
 * @author Benjamin Cisneros <benjamin.cisneros@softtek.com>
 */
public class PalindromeAnalyzer {
    public boolean analyze(String phrase) {
        
        if (phrase == null) {
            return false;
        }
        String tempPhrase = phrase.replaceAll("[\\s\\W]", "");
        
        if (tempPhrase.isEmpty()) {
            return false;
        }
        
        String reversedPhrase = new StringBuilder(tempPhrase).reverse().toString();
        return tempPhrase.equalsIgnoreCase(reversedPhrase);
    }
}
