package com.developersdelicias.repository;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;

import com.developersdelicias.model.Palindrome;
import com.developersdelicias.util.file.FileUtils;

public abstract class PalindromeRepositoryTest extends RepositoryTest<Palindrome> {

	
	@Override
	protected IDataSet getDataSet() throws Exception {
		IDataSet palindromeTestFixtures = new FlatXmlDataSetBuilder()
				.build(FileUtils.getInputStreamFromResourceFile("/palindromes.xml"));
		return palindromeTestFixtures;
	}

	@Override
	protected String getTableName() {
		return "PALINDROMES";
	}

	@Override
	protected Palindrome getEntityToCreate() {
		Palindrome palindrome = new Palindrome();
		palindrome.setPhrase("taco cat");
		return palindrome;
	}
	

}
