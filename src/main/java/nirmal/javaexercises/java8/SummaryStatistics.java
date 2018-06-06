package nirmal.javaexercises.java8;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;

public class SummaryStatistics {


    public IntSummaryStatistics mediaCount(ArrayList<Media> medias) {

        return medias.stream()
                .mapToInt(Media::getMediaCount)
                .summaryStatistics();
    }
}
