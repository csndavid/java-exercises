package nirmal.javaexercises.java8;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TransformCollectionTest {

    TransformCollection transformCollection = new TransformCollection();
    DataSetup dataSetup = new DataSetup();

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @Test
    public void testUpperCaseTransform() {
        transformCollection.upperCaseJava8(dataSetup.createTestData());
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

}