package com.developersdelicias.repository;

import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.dbunit.database.DatabaseDataSourceConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ITable;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.developersdelicias.configuration.DatabaseUnitTestsConfiguration;
import com.developersdelicias.model.EntityObject;

@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = DatabaseUnitTestsConfiguration.class)

public abstract class RepositoryTest<E extends EntityObject> extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	DataSource dataSource;
	protected Repository<E> repository;

	protected IDataSet dataSet;

	@Before
	public void setup() throws Exception {
		IDatabaseConnection connection = new DatabaseDataSourceConnection(dataSource);
		dataSet = getDataSet();
		DatabaseOperation.CLEAN_INSERT.execute(connection, dataSet);
	}

	@Test
	public void testList() throws DataSetException {
		ITable expectedTable = dataSet.getTable(getTableName());
		assertEquals(expectedTable.getRowCount(), repository.retrieveAll().size());
	}

	@Test
	public void addShouldCreateNewEntityInRepository() throws Exception {
		E entityToCreate = getEntityToCreate();
		E entityCreated = repository.add(entityToCreate);
		assertEquals(entityToCreate, entityCreated);
		assertTrue(repository.retrieveAll().contains(entityToCreate));
	}

	protected abstract E getEntityToCreate();

	protected abstract IDataSet getDataSet() throws Exception;

	protected abstract String getTableName();

}
