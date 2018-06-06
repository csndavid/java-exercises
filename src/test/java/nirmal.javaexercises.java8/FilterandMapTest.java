package nirmal.javaexercises.java8;

import com.google.common.collect.Lists;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FilterandMapTest {

    FilterandMap filterandMap = new FilterandMap();

    @Test
    public void testFilterandMapMethod() {

        Media CD = new Media("CD", 50);
        Media LP = new Media("LP", 75);
        Media LD = new Media("LD", 5);

        List<String> mediaCollection = filterandMap.filterandMapMethod(Lists.newArrayList(CD, LP, LD));

        Assertions.assertThat(mediaCollection).contains("CD").doesNotContain("LD");

    }

}
