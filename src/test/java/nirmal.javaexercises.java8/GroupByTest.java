package nirmal.javaexercises.java8;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GroupByTest {

    GroupByDataSetup groupByDataSetup = new GroupByDataSetup();

    GroupByDataSetup.Artist artist;

    @Test
    public void executeGroupByTest() {
        List<GroupByDataSetup.Artist> artist  = groupByDataSetup.createArtist();

        //Assertions.assertThat()

    }


}
