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
    private static final List<PalindromeTestResource> highComplexityPalindromesList;

    static {
        lowComplexityPalindromesList = new ArrayList<>();
        lowComplexityPalindromesList.add(new PalindromeTestResource("oso",
                "Single palindrome with one word and all letters in lowercase"));
        lowComplexityPalindromesList.add(new PalindromeTestResource("taco cat",
                "Single palindrome with two words and all letters in lowercase"));
        lowComplexityPalindromesList.add(new PalindromeTestResource("Borrow or rob?",
                "Single palindrome with three words using uppercase and lowercase and question mark"));
        lowComplexityPalindromesList.add(new PalindromeTestResource("1",
                "Single integer number"));
        lowComplexityPalindromesList.add(new PalindromeTestResource("44",
                "Two repeated integer numbers"));
        lowComplexityPalindromesList.add(new PalindromeTestResource("121",
                "A palindrome with three integer numbers"));
        lowComplexityPalindromesList.add(new PalindromeTestResource("1221",
                "A palindrome with four integer numbers"));
        lowComplexityPalindromesList.add(new PalindromeTestResource("12321",
                "A palindrome with five integer numbers"));
        
        mediumComplexityPalindromesList = new ArrayList<>();
        mediumComplexityPalindromesList.add(new PalindromeTestResource("No 'x' in Nixon",
                "A palindrome with four words that has apostrophes"));
        mediumComplexityPalindromesList.add(new PalindromeTestResource("Campus motto: Bottoms up Mac.",
                "A palindrome with five words that has colon"));
        mediumComplexityPalindromesList.add(new PalindromeTestResource("Marge lets Norah see Sharon’s telegram.",
                "A palindrome with six words"));
        mediumComplexityPalindromesList.add(new PalindromeTestResource("123321",
                "A palindrome with six integer numbers"));
        mediumComplexityPalindromesList.add(new PalindromeTestResource("1234321",
                "A palindrome with seven integer numbers"));
        mediumComplexityPalindromesList.add(new PalindromeTestResource("12344321",
                "A palindrome with eight integer numbers"));
        mediumComplexityPalindromesList.add(new PalindromeTestResource("123454321",
                "A palindrome with nine integer numbers"));
        mediumComplexityPalindromesList.add(new PalindromeTestResource("1234554321",
                "A palindrome with nine integer numbers"));
        
        highComplexityPalindromesList = new ArrayList<>();
        highComplexityPalindromesList.add(new PalindromeTestResource("A man, a plan, a canal, Panama!",
                "A palindrome with seven words that use commas and ends with a exclamation mark"));
        highComplexityPalindromesList.add(new PalindromeTestResource("A Toyota! Race fast, safe car! A Toyota!",
                "A palindrome with eight words that use commas and exclamation marks"));
        highComplexityPalindromesList.add(new PalindromeTestResource("A new order began, a more Roman age bred Rowena.",
                "A palindrome with nine words that use comma"));
        highComplexityPalindromesList.add(new PalindromeTestResource("Degas, are we not drawn onward, no? In union, drawn onward to new eras aged?",
                "A palindrome with thirteen words that use commas and questions marks"));
        highComplexityPalindromesList.add(new PalindromeTestResource("Are we not pure? “No sir!” Panama’s moody Noriega brags. “It is garbage!” Irony dooms a man; a prisoner up to new era.",
                "A very large palindrome with many non-alphanumeric characters"));
        highComplexityPalindromesList.add(new PalindromeTestResource("12345654321",
                "A palindrome with ten integer numbers"));
        highComplexityPalindromesList.add(new PalindromeTestResource("1234567890987654321",
                "A very large palindrome with more than ten integer numbers"));
        
        realPalindromesList = new ArrayList<>();
        realPalindromesList.addAll(lowComplexityPalindromesList);
        realPalindromesList.addAll(mediumComplexityPalindromesList);
        realPalindromesList.addAll(highComplexityPalindromesList);
        
        realPalindromesList.add(new PalindromeTestResource("Race car",
                "Single palindrome with two words using capital first letter"));
        realPalindromesList.add(new PalindromeTestResource("Amor, Roma",
                "Single palindrome with two words using upper and lower case and a comma"));
        
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
    
    public static List<PalindromeTestResource> getHighComplexityPalindromes() {
        return highComplexityPalindromesList;
    }
}
