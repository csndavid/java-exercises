package nirmal.javaexercises.java8;

import java.util.Collection;
import java.util.stream.Collectors;

public class FilterCollection {

    public void filterCollection(Collection<String> stringCollection) {

        Collection<String> filteredCollection = stringCollection.stream()
                .filter(list -> list.length() > 2)
                .collect(Collectors.toList());

        filteredCollection.stream().forEach(list -> System.out.println(list.toString()));
    }
}
