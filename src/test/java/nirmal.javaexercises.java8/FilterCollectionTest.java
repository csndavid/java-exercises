package nirmal.javaexercises.java8;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FilterCollectionTest {

    DataSetup dataSetup = new DataSetup();
    FilterCollection filterCollection = new FilterCollection();

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testFilterCollection() {
        filterCollection.filterCollection(dataSetup.createTestData());
    }

    @After
    public void tearDown() throws Exception {

    }

}