package nirmal.javaexercises.java8;

import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class SumandReduceTest {

    SumandReduce sumandReduce = new SumandReduce();

    @Test
    public void invokeSumandReduceMethod() {
       List<Integer> integerList = Lists.newArrayList(1,3,4,8);
       assertThat(sumandReduce.invokeSumandReduce(integerList)).isEqualTo(1+3+4+8);
    }

}
