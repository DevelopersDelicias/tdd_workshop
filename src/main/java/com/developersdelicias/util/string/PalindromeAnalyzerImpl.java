package com.developersdelicias.util.string;

/**
 * Implementation class for PalindromeAnalyzer
 * @author Benjamin Cisneros <benjamin.cisneros@softtek.com>
 */
public class PalindromeAnalyzerImpl implements PalindromeAnalyzer {

    @Override
    public boolean isPalindrome(String phrase) {
        String phraseWithoutSpaces = phrase.replaceAll(" ", "").toLowerCase();
        String firstHalfPhrase = phraseWithoutSpaces.substring(0, phraseWithoutSpaces.length() / 2);
        String secondHalfPhrase = phraseWithoutSpaces.substring(phraseWithoutSpaces.length() / 2);
        
        boolean equals = true;
        for (int i = 0; i< firstHalfPhrase.length(); i++) {
            if(firstHalfPhrase.charAt(i) != secondHalfPhrase.charAt(secondHalfPhrase.length() - i - 1)) {
                equals = false; 
                break;
            }
        }
        return equals;
    }

}
