package nirmal.javaexercises.java8;

import com.google.common.collect.Lists;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class PartitionByTest {

    PartitionBy partitionBy = new PartitionBy();

    @Test
    public void testPartitionBy() {

    Media CD = new Media("CD", 20);
    Media LP = new Media("LP", 35);
    Media tape = new Media("TAPE", 50);

    Map<Boolean, List<Media>> partionedMap = partitionBy.createPartition(Lists.newArrayList(CD, LP, tape));

    Assertions.assertThat(partionedMap.get(true)).contains(LP, tape);


    }

}
