package nirmal.javaexercises.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionBy {


    public Map<Boolean,List<Media>> createPartition(ArrayList<Media> medias) {
        return medias.stream()
                .collect(Collectors.partitioningBy(entry -> entry.getMediaCount() > 25));
    }
}
