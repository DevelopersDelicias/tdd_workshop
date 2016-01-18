package com.developersdelicias.util.string;

/**
 * Represents a Palindrome test case
 *
 * @author Benjamin Cisneros <benjamin.cisneros@softtek.com>
 */
public class PalindromeTestResource {

	private final String phrase;
	private final String testDescription;

	public PalindromeTestResource(String phrase, String testDescription) {
		this.phrase = phrase;
		this.testDescription = testDescription;
	}

	public String getPhrase() {
		return phrase;
	}

	public String getTestDescription() {
		return testDescription;
	}

	@Override
	public String toString() {
		return "PalindromeTestResource{" + "phrase=" + phrase + ", testDescription=" + testDescription + '}';
	}

}
