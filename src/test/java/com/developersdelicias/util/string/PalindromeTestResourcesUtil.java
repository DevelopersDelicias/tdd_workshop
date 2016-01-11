package com.developersdelicias.util.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Provide palindrome resources used by different test classes
 *
 * @author Benjamin Cisneros <benjamin.cisneros@softtek.com>
 */
public class PalindromeTestResourcesUtil {

    private static final List<PalindromeTestResource> realPalindromesList;
    private static final List<PalindromeTestResource> invalidPalindromesList;

    static {
        realPalindromesList = new ArrayList<>();
        realPalindromesList.add(new PalindromeTestResource("oso",
                "Single palindrome with one word and all letters in lowercase"));
        realPalindromesList.add(new PalindromeTestResource("taco cat",
                "Single palindrome with two words and all letters in lowercase"));
        realPalindromesList.add(new PalindromeTestResource("Race car",
                "Single palindrome with two words using capital first letter"));
        realPalindromesList.add(new PalindromeTestResource("Amor, Roma",
                "Single palindrome with two words using upper and lower case and a comma"));
        realPalindromesList.add(new PalindromeTestResource("A man, a plan, a canal, Panama!",
                "A palindrome that use commas and ends with a exclamation mark"));
        realPalindromesList.add(new PalindromeTestResource("Was it a car or a cat I saw?",
                "A palindrome that ends with a question mark"));
        realPalindromesList.add(new PalindromeTestResource("No 'x' in Nixon",
                "A palindrome that has with apostrophes"));
        realPalindromesList.add(new PalindromeTestResource("123454321",
                "Integer number palindrome"));
        realPalindromesList.add(new PalindromeTestResource("1234.4321",
                "Decimal number palindrome"));

        invalidPalindromesList = new ArrayList<>();
        invalidPalindromesList.add(new PalindromeTestResource("it is not a palindrome", "Any string that is not a palindrome"));
        invalidPalindromesList.add(new PalindromeTestResource("", "Empty string"));
        invalidPalindromesList.add(new PalindromeTestResource(null, "Null value"));
    }

    public static List<PalindromeTestResource> getRealPalindromes() {
        return realPalindromesList;
    }

    public static List<PalindromeTestResource> getInvalidPalindromes() {
        return invalidPalindromesList;
    }
}
