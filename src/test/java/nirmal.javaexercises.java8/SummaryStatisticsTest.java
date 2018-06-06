package nirmal.javaexercises.java8;

import com.google.common.collect.Lists;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.IntSummaryStatistics;

@RunWith(MockitoJUnitRunner.class)
public class SummaryStatisticsTest {

    SummaryStatistics summaryStatistics = new SummaryStatistics();

    @Test
    public void testSummaryStatistics() {

        Media CD = new Media("CD", 50);
        Media LP = new Media("LP", 75);
        Media LD = new Media("LD", 5);

        IntSummaryStatistics intSummaryStatistics = summaryStatistics.mediaCount(Lists.newArrayList(CD, LP, LD));

        Assertions.assertThat(intSummaryStatistics.getCount()).isEqualTo(3);

        Assertions.assertThat(intSummaryStatistics.getSum()).isEqualTo(130);

        Assertions.assertThat(intSummaryStatistics.getMax()).isEqualTo(75);
    }

}
