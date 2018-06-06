package nirmal.javaexercises.java8;

import com.google.common.collect.Lists;

import java.util.Collection;

public class FlatMapDataSetup {

    public Collection<Collection<String>> dataSetup() {
        return Lists.newArrayList(Lists.newArrayList("Canada", "US"), Lists.newArrayList("China", "India"));
    }

}
