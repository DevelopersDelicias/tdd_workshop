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
    
    private static final List<PalindromeTestResource> lowComplexityPalindromesList;
    private static final List<PalindromeTestResource> mediumComplexityPalindromesList;

    static {
        lowComplexityPalindromesList = new ArrayList<>();
        lowComplexityPalindromesList.add(new PalindromeTestResource("oso",
                "Single palindrome with one word and all letters in lowercase"));
        lowComplexityPalindromesList.add(new PalindromeTestResource("taco cat",
                "Single palindrome with two words and all letters in lowercase"));
        lowComplexityPalindromesList.add(new PalindromeTestResource("Borrow or rob?",
                "Single palindrome with three words using uppercase and lowercase and question mark"));
        
        mediumComplexityPalindromesList = new ArrayList<>();
        mediumComplexityPalindromesList.add(new PalindromeTestResource("No 'x' in Nixon",
                "A palindrome with four words that has apostrophes"));
        mediumComplexityPalindromesList.add(new PalindromeTestResource("Campus motto: Bottoms up Mac.",
                "A palindrome with five words that has colon"));
        mediumComplexityPalindromesList.add(new PalindromeTestResource("Marge lets Norah see Sharon’s telegram.",
                "A palindrome with six words"));
        
        realPalindromesList = new ArrayList<>();
        realPalindromesList.addAll(lowComplexityPalindromesList);
        realPalindromesList.addAll(mediumComplexityPalindromesList);
        
        realPalindromesList.add(new PalindromeTestResource("Race car",
                "Single palindrome with two words using capital first letter"));
        realPalindromesList.add(new PalindromeTestResource("Amor, Roma",
                "Single palindrome with two words using upper and lower case and a comma"));
        realPalindromesList.add(new PalindromeTestResource("A man, a plan, a canal, Panama!",
                "A palindrome that use commas and ends with a exclamation mark"));
        realPalindromesList.add(new PalindromeTestResource("Was it a car or a cat I saw?",
                "A palindrome that ends with a question mark"));
        
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
    
    public static List<PalindromeTestResource> getLowComplexityPalindromes() {
        return lowComplexityPalindromesList;
    }
    
    public static List<PalindromeTestResource> getMediumComplexityPalindromes() {
        return mediumComplexityPalindromesList;
    }
}
