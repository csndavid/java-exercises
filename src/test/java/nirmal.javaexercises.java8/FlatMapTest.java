package nirmal.javaexercises.java8;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FlatMapTest {

    FlatMap flatMap = new FlatMap();
    FlatMapDataSetup flatMapDataSetup = new FlatMapDataSetup();

    @Test
    public void testFlatMap() {
            flatMap.flatMapCollection(flatMapDataSetup.dataSetup());
    }

}
