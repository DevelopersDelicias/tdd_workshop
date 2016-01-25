package com.developersdelicias.util.file;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileUtilsTest {

	@Test
	public void getResoourceAsStringShouldReturnTheContentOfTheFileAsString() {
		assertEquals("Hello World!", FileUtils.getResourceAsString("/test.txt"));
	}

}
