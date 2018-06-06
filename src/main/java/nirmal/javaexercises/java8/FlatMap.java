package nirmal.javaexercises.java8;

import java.util.Collection;
import java.util.stream.Collectors;

public class FlatMap {

    public void flatMapCollection(Collection<Collection<String>> beforeFlatMap) {

          System.out.println("Size of Collection After FlatMap" + beforeFlatMap.stream().count());

          Collection<String> afterFlatMap = beforeFlatMap.stream()
                                                .flatMap(list -> list.stream())
                                                .collect(Collectors.toList());

          System.out.println("Size of Collection After FlatMap" + afterFlatMap.stream().count());
    }
}
