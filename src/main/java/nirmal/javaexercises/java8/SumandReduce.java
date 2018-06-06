package nirmal.javaexercises.java8;

import java.util.List;

public class SumandReduce {

    public int invokeSumandReduce(List<Integer> integerList) {
        return integerList.stream()
                .reduce(0, (total, number) -> total + number);
    }

}
