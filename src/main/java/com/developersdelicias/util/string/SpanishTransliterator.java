package com.developersdelicias.util.string;

/**
 * Description of the class SpanishTransliterator
 *
 * @author Benjamin Cisneros <benjamin.cisneros@softtek.com>
 */
public class SpanishTransliterator {

	public String transliterate(String string) {
		return string.replaceAll("á", "a").replaceAll("é", "e").replaceAll("í", "i").replaceAll("ó", "o")
				.replaceAll("ú", "u").replaceAll("Á", "A").replaceAll("É", "E").replaceAll("Í", "I")
				.replaceAll("Ó", "O").replaceAll("Ú", "U");
	}
}
