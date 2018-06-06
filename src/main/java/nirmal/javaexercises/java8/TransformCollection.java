package nirmal.javaexercises.java8;

import com.google.common.collect.Lists;

import java.util.Collection;
import java.util.stream.Collectors;

public class TransformCollection {

    Collection<String> stringCollection = Lists.newArrayList("cd", "vinyl", "laserdisc");

    public void upperCaseJava8(Collection<String> stringCollection) {
        Collection<String> upperCaseString = stringCollection.stream()
                .map(list -> list.toUpperCase())
                .collect(Collectors.toList());

        upperCaseString.stream().forEach(list -> System.out.println(list.toString()));
    }

}
