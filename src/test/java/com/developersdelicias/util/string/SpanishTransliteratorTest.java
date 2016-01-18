package com.developersdelicias.util.string;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Benjamin Cisneros <benjamin.cisneros@softtek.com>
 */
public class SpanishTransliteratorTest {

	@Test
	public void transliterateWithLettersWithAccentMustReturnLettersWithoutAccents() {
		SpanishTransliterator transliterator = new SpanishTransliterator();

		assertEquals("aeiouAEIOU", transliterator.transliterate("áéíóúÁÉÍÓÚ"));
	}

}
